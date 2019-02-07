

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.io.IOException;
import java.util.Arrays;
/**
 * Servlet implementation class RegisterBrukerServlet
 */
@WebServlet("/RegisterBrukerServlet")
public class RegisterBrukerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterBrukerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String feilmelding = null;
		String feilkode = request.getParameter("feilkode");
			if (feilkode != null) {
				if (feilkode == "1") {
					feilmelding ="ugyldig nickname";
				}
				if (feilkode == "2") {
					feilmelding = "navn eksistere";
				}
			}
		
		//List<String> klassekoder = Dh.hentListeAvKlassekoder();
		List<String> klassekoder = Arrays.asList("dat104", "dat103", "dat102");
		request.setAttribute("feilmelding", feilmelding);
		request.setAttribute("klassekoder", klassekoder);
		request.getRequestDispatcher("RegistrerBrukerSkjema.jsp").forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String klassekode = request.getParameter("klassekoder");
		String nick = request.getParameter("nick");
		String feilkode = null;
		//if (!erGyldigNick(nick))
		//feilkode = 1
		//if (finnesStudentMedNick(nick)
		//filkode = 2
		//addCookieToResponse(response,nick, nick);
		response.sendRedirect("/RegisterBrukerServlet?feilkode=1");
	}

}
