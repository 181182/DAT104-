package no.hib.dat104;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hib.dat104.exchange.ExchangeRate;
import no.hib.dat104.exchange.ExchangeRateService;

/**
 * Servlet implementation class valuta
 */
@WebServlet("/valuta")
public class valuta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html; charset=ISO-8859-1");
		double belop = 0;
		if (request.getParameter("Belop").matches("^\\d+$")) {
			belop = Integer.parseInt(request.getParameter("Belop"));
		}
		String fra = request.getParameter("fra");
		String til = request.getParameter("til");
		
		ExchangeRate rate = ExchangeRateService.getRate(fra, til);
		
		double sum = belop * rate.getRate();

		
		PrintWriter out = response.getWriter();
		out.println(sum);

	}
}
