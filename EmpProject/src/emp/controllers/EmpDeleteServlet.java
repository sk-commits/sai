package emp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dao.EmpI;
import emp.daoimpl.EmpImpl;

/**
 * Servlet implementation class EmpDeleteServlet
 */
@WebServlet("/EmpDeleteServlet")
public class EmpDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();  
        
		 String empId = request.getParameter("empId");
		 String empName = request.getParameter("empName");
		 String empSal = request.getParameter("empSal");
		 String empAdd= request.getParameter("empAddr");
		 
		 try {
	        	EmpI empRecd = new EmpImpl();
				 boolean b = empRecd.deleteEmp(empId, empName, empSal, empAdd);
				 System.out.println("employee record deleted sucessfully "+b);
				 if (b) {
					 System.out.println("record deleted sucessfully");
					
				}else {
					
					System.out.println("Some thing went wrong, try again...");
				}
	        	
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
