package no.hvl.dat104;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class skjema
 */
@WebServlet("/skjema")
public class skjema extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public skjema() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	private ArrayList<String> readOptionsFromFile(String filePath) throws IOException {
		ArrayList<String> options = new ArrayList<String>();
		InputStream optionsStream = getServletContext().getResourceAsStream(filePath);
		BufferedReader optionsReader = new BufferedReader(new InputStreamReader(optionsStream));
		String option = optionsReader.readLine();
		while (option != null) {
			options.add(option);
			option = optionsReader.readLine();
		}
		optionsReader.close();
		return options;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=ISO-8859-1");

		Cookie[] requestCookies = request.getCookies();
		

		int epletall = 0;
		int peretall = 0;
		int kiwitall = 0;
		int banantall = 0;

		switch (request.getParameter("frukt")) {

		case "eple":
			epletall++;
			break;

		case "pere":
			peretall++;
			break;

		case "kiwi":
			kiwitall++;
			break;

		case "banan":
			banantall++;
			break;

		}
		

		PrintWriter out = response.getWriter();
		out.println("<h1>Favorittfrukt resultat</h1>");
		out.println("<br>");
		out.println("<p> Eple: " + epletall + "</p>");
		out.println("<br>");
		out.println("<p> Pære: " + peretall + "</p>");
		out.println("<br>");
		out.println("<p> Kiwi: " + kiwitall + "</p>");
		out.println("<br>");
		out.println("<p> Banan: " + banantall + "</p>");
		out.println("<p><a href='stemmeskjema.html'> En gang til? </a></p>");

		out.println(readOptionsFromFile("options.txt"));

	}

}
