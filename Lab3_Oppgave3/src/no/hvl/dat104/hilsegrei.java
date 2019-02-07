package no.hvl.dat104;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;
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

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	String greetingForThisServletOnly;

	String greetingForTheEntireApplication;
	public hilsegrei() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void init() throws ServletException {

		greetingForThisServletOnly = getServletConfig().getInitParameter("greeting");
		greetingForTheEntireApplication = getServletContext().getInitParameter("greeting");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=ISO-8859-1");
//		response.setContentType("text/plain");
//		Locale rLocale = request.getLocale();
//		ResourceBundle bundle = ResourceBundle.getBundle("MyLocale", rLocale);
//		Locale selectedLocale = bundle.getLocale();
//		String userLocale=response.getHeader("Accept-Language");;
		Locale land = response.getLocale();
		
		PrintWriter out = response.getWriter();
		String navn = request.getParameter("username");
		out.println("Hallo " + navn + "!");
		out.println(land.getLanguage());
//		out.println(rLocale);
//		out.println(bundle);
//		out.println(greetingForThisServletOnly);
//		out.println(greetingForTheEntireApplication);
	}

}
