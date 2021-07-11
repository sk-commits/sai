package miniproj.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import miniproj.bean.SignInBean;

import miniproj.regI.SigninI;

import miniproj.regimpl.SignInImpl;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = request.getParameter("email");
        String password = request.getParameter("psw");
        
         response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
        
        try {
        	
        	SigninI obj = new SignInImpl();
        	boolean b = obj.checkLogin(email, password);
        	System.out.println("............"+b);
        	
        	if (b) {
            	//System.out.println("............"+b);

        		request.setAttribute("email", email);
        		RequestDispatcher dp = request.getRequestDispatcher("Welcome.jsp");
    			dp.forward(request, response);
            	
            } else {
            	
            	out.println(" OOPS!!!!!!!!! Invalid email/password");
            	
                /*String message = "OOPS!!!!!!!!! Invalid email/password";
                request.setAttribute("message", message);
                RequestDispatcher dp = request.getRequestDispatcher("Failure.jsp");
    			dp.forward(request, response);*/
            }
				
		 
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
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
