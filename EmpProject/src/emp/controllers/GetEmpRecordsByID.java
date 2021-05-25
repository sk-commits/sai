package emp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/GetEmpRecordsByID")
public class GetEmpRecordsByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmpRecordsByID() {
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
		try {

			 EmpI empRecd = new EmpImpl();
			 EmpBean bean = empRecd.getEmpRecordsByID(empId);
			 System.out.println("employee data by id");
			 
			 request.setAttribute("bean", bean);
			RequestDispatcher dp = request.getRequestDispatcher("empDisplay.jsp");
			dp.forward(request, response);
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
