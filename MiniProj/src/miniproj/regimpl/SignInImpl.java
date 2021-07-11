package miniproj.regimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import miniproj.bean.SignInBean;
import miniproj.dbutil.Dbutil;
import miniproj.regI.SigninI;

public class SignInImpl implements SigninI{

	Connection con = null;
	boolean flag = false;
	@Override
	public boolean checkLogin(String email, String password) {
		// TODO Auto-generated method stub
		
		String sql = ("select * from register where email=? and password=?");
		try {
			
			Dbutil Dbutil= new Dbutil();
			con = Dbutil.getConnection();
			System.out.println("connection success"+ con);
			
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2,password);
            
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){ 		
            	
            	flag = true;
            }else {
				flag = false;
			}

			
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
		
		
		return flag;
	}
	@Override
	public boolean isExist(String email) {
		// TODO Auto-generated method stub
		String sql = ("select * from register where email=?");
		try {
			
			
			Dbutil Dbutil= new Dbutil();
			con = Dbutil.getConnection();
			System.out.println("connection success"+ con);
			
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,email);
            
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){ 		
            	
            	flag = true;
            }else {
				flag = false;
			}
			
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
				e.printStackTrace( );
			}
			
		}
		
		
		
		return flag;
	}

}
