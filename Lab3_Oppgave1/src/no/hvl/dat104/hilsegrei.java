package no.hvl.dat104;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hilsegrei
 */
@WebServlet("/hilsegrei")
public class hilsegrei extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=ISO-8859-1"); 
		PrintWriter out = response.getWriter();
		String navn = request.getParameter("username");
		out.println("Hallo " + navn + "!");

	}

}
