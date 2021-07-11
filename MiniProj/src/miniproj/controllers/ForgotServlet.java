package miniproj.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import miniproj.bean.RegBean;
import miniproj.regI.GetPassword;
import miniproj.regimpl.ForgotPasswordImpl;

/**
 * Servlet implementation class ForgotServlet
 */
@WebServlet("/ForgotServlet")
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		try {
			
			GetPassword obj = new ForgotPasswordImpl();
			RegBean bean = obj.getEmpPwdByemail(email);		
			
			
			System.out.println("display password by email id" + bean);
			
            if(bean!=null) {
				
            	 
   			 request.setAttribute("bean", bean);
   			RequestDispatcher dp = request.getRequestDispatcher("forgotpwd.jsp");
   			dp.forward(request, response);
				
			}else {
				
				//out.println("email id doesn't exist");
				String message = "OOPS!!!!!!!!! Invalid email/password";
                request.setAttribute("message", message);
                RequestDispatcher dp = request.getRequestDispatcher("Failure.jsp");
    			dp.forward(request, response);
				
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
