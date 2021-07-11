package miniproj.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import miniproj.regI.SigninI;
import miniproj.regimpl.SignInImpl;

/**
 * Servlet implementation class EmailExistServlet
 */
@WebServlet("/EmailExistServlet")
public class EmailExistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailExistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String email = request.getParameter("email");
        response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
        String msg = "";
        boolean flag = false;
        
        try {
        	
        	SigninI obj = new SignInImpl();
        	boolean b = obj.isExist(email);
       	
        	
        	if (b) {
        		
        		System.out.println("inside if condition");
        		msg = email + "OOPS!!!!!!!!!  email already exists  ";
        		flag = true;
				
			} else {
				flag = false;
				//out.println(" OOPS from else condition!!!!!!!!!  email already exists");
				
			}
			
        	response.getWriter().write(msg);
        	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		doGet(request, response);
	}

}
