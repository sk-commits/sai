package emp.dao;

import java.util.List;

import emp.bean.EmpBean;

public interface EmpI {
	
	public EmpBean getEmpRecordsByID(String empID);
	public boolean addEmp(String empID, String empName, String empSal, String empAddr);
	public boolean updateEmp(String empID, String empName, String empSal, String empAddr);
	public boolean deleteEmp(String empID, String empName, String empSal, String empAddr);
	public List<EmpBean> getAllEmpRecords();
} 
 