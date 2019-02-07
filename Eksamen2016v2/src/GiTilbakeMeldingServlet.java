

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GiTilbakeMeldingServlet
 */
@WebServlet("/GiTilbakeMeldingServlet")
public class GiTilbakeMeldingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GiTilbakeMeldingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//
	//if (getCookieFromRequest(request,nick).equals(null)
		//response.sendRedirect(RegistrerBrukerServlet);
		//if(finnesGjeldeneAktivitetForStudent(nick)
		//Student student = hentStudentMedNick(nick)
		//hentGjeldeneAktivitetForStudent(student)
		//reqeust.setParameter("nick",nick)
		//request.setParameter("getNaaSomString, getnaaSomString)
		//request.setParameter("aktivitet", aktivitet)
		request.getRequestDispatcher("/Tilbakemeldingskjema.jsp").forward(request, response);
		//
	//
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
