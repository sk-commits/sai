package com.emp.java;

import java.util.Scanner;

public class EmployeeTask1 {

	 String empName;
	 int empid;
	 String email;

	public EmployeeTask1() {

	}

	public EmployeeTask1(String name, int id, String email) {
		this.empName = name;
		this.empid = id;
		this.email = email;
		/*System.out.println("employee name is...."+ this.empName);
		System.out.println("employee id is...."+ this.empid);
		System.out.println("employee email is...."+ this.email);*/
		
	}

	
	/*void disp() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empid);
		System.out.println("Employee Address: " + email);
	}
*/
	/*String disp(String empName, int id, String email) {
		
		System.out.println("employee name is....."+ empName);
		System.out.println("employee id is...."+ id);
		System.out.println("employee email is..."+email);
		return empName;
		
	}
	*/
	
	@Override
	public String toString() {
		return "EmployeeTask1 [empName=" + empName + ", empid=" + empid + ", email=" + email + "]";
	}

	public static void main(String[] args) {
		EmployeeTask1 obj = new EmployeeTask1("Sai", 1, "email1");
		EmployeeTask1 obj2 = new EmployeeTask1("Sam", 2, "email2");
		EmployeeTask1 obj3 = new EmployeeTask1("John", 3, "email3");
		/*obj.disp();
		obj2.disp();
		obj3.disp();*/
		
		/*EmployeeTask1 obj= new EmployeeTask1();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of employee");
		String S=sc.next();
		System.out.println("enter the  employee id");
		int id = sc.nextInt();
		System.out.println("enter the employee email");
		String email = sc.next();
		obj.disp(S, id, email);
		*/
		
		System.out.println("employee email is...."+ obj);
		System.out.println("employee email is...."+ obj2);
		System.out.println("employee email is...."+ obj3);
		
		
	}
}