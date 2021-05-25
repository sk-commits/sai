package emp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import emp.bean.EmpBean;
import emp.dao.EmpI;
import emp.dbutil.Dbutil;
public class EmpImpl implements EmpI {
	Connection con = null;
	EmpBean bean = new EmpBean();
	List<EmpBean>list = new ArrayList<EmpBean>();
	
	@Override
	public EmpBean getEmpRecordsByID(String empID) {
		// TODO Auto-generated method stub
		
		//sql Query
		
		String sql = ("select * from emply where empID=?");
		//Connection
		//prepare stmt
		//excute query or excute update
		
	try {
		
		Dbutil DbUtil = new Dbutil();
		 con = DbUtil.getConnection();
		System.out.println("connection success"+ con);
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,empID);  
        ResultSet rs=ps.executeQuery();  
        if(rs.next()){ 		
        	
        	bean.setEmpId(rs.getString(1));
        	bean.setEmpName(rs.getString(2));
        	bean.setEmpSal(rs.getString(3));
        	bean.setEmpAddr(rs.getString(4));
        	
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
		
		return bean;
	}

	
	@Override
	public boolean addEmp(String empID, String empName, String empSal, String empAddr) {
		// TODO Auto-generated method stub
		String sql = "insert into emply(empId,empName,empSal,empAddr) values (?,?,?,?)";  
		boolean flag = false;
		try {
			Dbutil DbUtil = new Dbutil();
			con = DbUtil.getConnection();
			System.out.println("connection success"+ con);
			
			PreparedStatement ps=con.prepareStatement(sql);
             
			
			ps.setString(1,empID);  
            ps.setString(2,empName);  
            ps.setString(3,empSal);  
            ps.setString(4,empAddr);  
              
            int i =ps.executeUpdate();  
			if (i==1) {
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
	public boolean updateEmp(String empID, String empName, String empSal, String empAddr) {
		// TODO Auto-generated method stub
		
		String sql = ("update emply set empName=?, empSal=?, empAddr=? where empId=?");
		boolean flag = false;
		
		try {
			Dbutil DbUtil = new Dbutil();
			con = DbUtil.getConnection();
			System.out.println("connection success"+ con);
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,empName);
			System.out.println("1");
            ps.setString(2,empSal); 
            System.out.println("2");
            ps.setString(3,empAddr);
            System.out.println("3");
            ps.setString(4,empID);
            System.out.println("4");
            
			int i =ps.executeUpdate();  
			if (i==1) {
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
	public boolean deleteEmp(String empID, String empName, String empSal, String empAddr) {
		// TODO Auto-generated method stub
		
		String sql = ("delete from emply where empId=?");
		boolean flag = false;
		
		try {
			
				Dbutil DbUtil = new Dbutil();
				con = DbUtil.getConnection();
				System.out.println("connection success"+ con);
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1,empID);
					            
				int i =ps.executeUpdate();  
				if (i==1) {
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
	public List<EmpBean> getAllEmpRecords() {
		// TODO Auto-generated method stub
		
		String sql = ("select * from emply order by empId desc;");
		
		try {
			
			Dbutil DbUtil = new Dbutil();
			 con = DbUtil.getConnection();
			System.out.println("connection success"+ con);
			
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			 
	          bean = new EmpBean();
	        while(rs.next()){ 		
	        	EmpBean bean = new EmpBean();

	        	bean.setEmpId(rs.getString(1));
	        	bean.setEmpName(rs.getString(2));
	        	bean.setEmpSal(rs.getString(3));
	        	bean.setEmpAddr(rs.getString(4));
	        	list.add(bean);
	        	
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
		return list;
		
	}
	
}
