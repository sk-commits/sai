package webapp.impl;


public class EmployeeImpl  {

	String Empid;
	 String EmpName;
	 String EmpSal;
	 String EmpAddr;
	 
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(String empSal) {
		EmpSal = empSal;
	}
	public String getEmpAddr() {
		return EmpAddr;
	}
	public void setEmpAddr(String empAddr) {
		EmpAddr = empAddr;
	}
	@Override
	public String toString() {
		return "EmployeeImpl [Empid=" + Empid + ", EmpName=" + EmpName + ", EmpSal=" + EmpSal + ", EmpAddr=" + EmpAddr
				+ "]";
	}


	
	
}


