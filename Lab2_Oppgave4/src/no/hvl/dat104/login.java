package no.hvl.dat104;

import java.io.IOException;
import java.io.PrintWriter;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		response.setContentType("text/html; charset=ISO-8859-1"); 
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String requestedURI = request.getRequestURI();
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1> Login resoult </h1>");
		out.println("<p>Logged in from " + requestedURI + "</p>");
		out.println("<p>Username:" + username+"</p>");
		out.println("<p>Password:" + password );
		

	}

}
