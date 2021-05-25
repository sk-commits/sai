package emp.controllers;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class GetAllEmpServlet
 */
@WebServlet("/GetAllEmpServlet")
public class GetAllEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 		 
       try {
    	     EmpI empRecd = new EmpImpl();
			 List<EmpBean> bean = empRecd.getAllEmpRecords();
			 System.out.println("employee all records from employee table"+ bean);
			 
			 request.setAttribute("bean", bean);
			RequestDispatcher dp = request.getRequestDispatcher("view.jsp");
			dp.forward(request, response);
			
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
