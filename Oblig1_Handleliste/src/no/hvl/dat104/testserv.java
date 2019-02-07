package no.hvl.dat104;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hvl.dat104.dataaccess.vareEAO;
import no.hvl.dat104.jpa.vare;

/**
 * Servlet implementation class testserv
 */
@WebServlet("/testserv")
public class testserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private vareEAO eao = new vareEAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		vare Vare = new vare();
		Vare.setNavn("Jesus");
		eao.leggTilVare(Vare);
		
	}


}
