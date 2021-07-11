package miniproj.regimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import miniproj.dbutil.Dbutil;
import miniproj.regI.RegI;


public class RegImpl implements RegI{
 
	Connection con = null;
	@Override
	public String register(String firstname, String middlename, String lastname, String email, String password,
			String passwordrepeat) {
		// TODO Auto-generated method stub
		
		String sql = "insert into register(firstname, middlename, lastname,  email,  password,  passwordrepeat) values (?,?,?,?,?,?)";  
		//boolean flag = false;
		
		try {
			
			
			Dbutil Dbutil= new Dbutil();
			con = Dbutil.getConnection();
			System.out.println("connection success"+ con);
			
            PreparedStatement ps=con.prepareStatement(sql);
             
			
			ps.setString(1,firstname);  
            ps.setString(2,middlename);  
            ps.setString(3,lastname);  
            ps.setString(4,email); 
            ps.setString(5,password); 
            ps.setString(6,passwordrepeat); 
            
              
            int i =ps.executeUpdate();  
			if (i!=0) {
				return  "sucess";
			}/*else {
				
				flag = false;
			}
			*/
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			if (con!=null);
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("your connection is closed");
				e.printStackTrace();
			}
			
		}
	
		
		
		return "something went wrong";
	}

}
