package webapp.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.jasper.tagplugins.jstl.core.Out;

import webapp.auth.Authentication;
import webapp.impl.AuthenticationImpl;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/AuthenticationServlet")
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter out=response.getWriter();  
		RequestDispatcher rd = null;
		 		 
		String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        if (userName == null || "".equals(userName)
                || password == null || "".equals(password)) {

            out.print(" Username or password both fields are required");
             rd = request.getRequestDispatcher("/servletlogin.jsp");
            rd.include(request, response);
            
        } else {
        	Authentication obj = new AuthenticationImpl();
        	boolean b = obj.validlogin(userName, password);
        	if (b) {  
            
            chain.doFilter(request, response);
		
        	}else {
        		out.print(" Invalid");
        		rd = request.getRequestDispatcher("/servletlogin.jsp");
        		rd.include(request, response);
            }		
	}
        }

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
