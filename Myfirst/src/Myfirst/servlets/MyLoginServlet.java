package Myfirst.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLoginServlet
 */
@WebServlet("/MyLoginServlet")
public class MyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
       String UserName = request.getParameter("user");
       String Password = request.getParameter("pwd");
		
		System.out.println("userName" +  Password + "password" + Password);
		if (UserName.equalsIgnoreCase("sai")&& Password.equalsIgnoreCase("krishna"))
				{
			RequestDispatcher rd=request.getRequestDispatcher("/success.jsp");  
			//servlet2 is the url-pattern of the second servlet  
			  
			rd.forward(request, response);
			
				}else {
					
					RequestDispatcher rd=request.getRequestDispatcher("/failure.jsp");  
					//servlet2 is the url-pattern of the second servlet  
					  
					rd.forward(request, response);
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
