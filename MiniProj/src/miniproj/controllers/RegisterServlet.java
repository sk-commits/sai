package miniproj.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import miniproj.regI.RegI;
import miniproj.regimpl.RegImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname = request.getParameter("firstname");
		 String middlename = request.getParameter("middlename");
		 String lastname = request.getParameter("lastname");
		 String email= request.getParameter("email");
		 String password= request.getParameter("password");
		 String passwordrepeat= request.getParameter("passwordrepeat");
		 
		
		try {
			
			RegI obj= new RegImpl();
			String b= obj.register(firstname, middlename, lastname, email, password, passwordrepeat);
			
			//System.out.println("employee registered  by id"+b);
			 if (b.equals("sucess")) {
            request.getRequestDispatcher("/Sucess.jsp").forward(request, response);
			}/*else {
				System.out.println("user details not found");
				request.getRequestDispatcher("/signup.jsp").forward(request, response);
			}*/
			
			
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
