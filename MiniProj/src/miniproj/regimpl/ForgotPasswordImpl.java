package miniproj.regimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import miniproj.bean.RegBean;
import miniproj.dbutil.Dbutil;
import miniproj.regI.GetPassword;

public class ForgotPasswordImpl implements GetPassword {
	static final Logger LOGGER = Logger.getLogger(ForgotPasswordImpl.class);
	Connection con = null;
	RegBean bean = new RegBean();
	@Override
	public RegBean getEmpPwdByemail(String email) {
		// TODO Auto-generated method stub
		LOGGER.info(" Forgot Password Impl is called ");
		//LOGGER.info(" ");
		String sql = ("select * from register where email=?");
		
		try {
			
			Dbutil Dbutil= new Dbutil();
			 con = Dbutil.getConnection();
			System.out.println("connection success"+ con);
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,email);  
	        ResultSet rs=ps.executeQuery();  
	        if(rs.next()){ 		
	        	bean.setFirstname(rs.getString(1));
	       		bean.setMiddlename(rs.getString(2));
	        	bean.setLastname(rs.getString(3));
	        	bean.setEmail(rs.getString(4));
	        	bean.setPassword(rs.getString(5));
	        	bean.setPasswordrepeat(rs.getString(6));
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
				System.out.println("your connection is closed"+ con);
				e.printStackTrace();
			}
		}
		
		return bean;
	}

}
