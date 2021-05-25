package emp.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.bean.EmpBean;
import emp.dao.EmpI;
import emp.daoimpl.EmpImpl;

/**
 * Servlet implementation class GetEmpRecordsByID
 */
@WebServlet("/EmpRegisterServlet")
public class EmpRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 String empId = request.getParameter("empId");
		 String empName = request.getParameter("empName");
		 String empSal = request.getParameter("empSal");
		 String empAdd= request.getParameter("empAddr");
		 
		try {

			 EmpI empRecd = new EmpImpl();
			 boolean b = empRecd.addEmp(empId, empName, empSal, empAdd);
			 System.out.println("employee data by id"+b);
			 if (b) {
				 System.out.println("record inserted sucessfully");
				
			}else {
				
				System.out.println("Some thing went wrong, try again...");
			}
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
