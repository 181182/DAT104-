package no.hib.dat104;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class temperaturkontrol
 */
@WebServlet("/temperaturkontrol")
public class temperaturkontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		float temperatur = Float.parseFloat(request.getParameter("Belop"));
		float sum;
		String valg = request.getParameter("test");

		response.setContentType("text/html; charset=ISO-8859-1");

		PrintWriter out = response.getWriter();
		out.println("<h1>Temperaturregning resultat</h1>");

		if (request.getParameter("test").equals("CtF")) {
			sum = ((temperatur - 32) * 5) / 9;
			out.println("<h1>" + temperatur + "C = " + sum + "F</h1>");
		} else if (request.getParameter("test").equals("FtC")) {
			sum = ((temperatur - 32) * 5 / 9);
			out.println("<h1>" + temperatur + "F = " + sum + "C</h1>");

		}
//		out.print(valg + " : valg");
		// out.println("<button type=\"button\"
		// onclick=\"response.sendRedirect(\"Temperatur.html\");\"> Click me");
		// out.println("</button>");
		// response.sendRedirect("Temperatur.html");

		// String requestedURI = request.getRequestURI();
		// out.println(requestedURI);
		// out.println("<a href=\""+ requestedURI +"\">Prøv Igjen</a>");
		// out.println("<a href=\"+ requestedURI +\"\">Prøv Igjen</a>\");
		out.println("<p><a href='Temperatur.html'> En gang til? </a></p>");

	}

}
