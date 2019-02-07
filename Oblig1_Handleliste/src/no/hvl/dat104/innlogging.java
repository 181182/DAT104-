package no.hvl.dat104;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hvl.dat104.jpa.vare;
import no.hvl.dat104.dataaccess.*;

/**
 * Servlet implementation class innlogging
 */
@WebServlet("/omg")
public class innlogging extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String loginpassord;
//	private EntityManager em;
	
	@EJB
	private vareEAO eao;
       
    /**
     * @throws ServletException 
     * @see HttpServlet#HttpServlet()
     */
	public void init(ServletConfig config) throws ServletException
    {
        super.init(config);
        loginpassord = getServletContext().getInitParameter("passord");
    }

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=ISO-8859-1");
		String passord = request.getParameter("passord");
		PrintWriter out = response.getWriter();
//		ServletConfig config = getServletConfig(); 
		//getServletConfig().getInitParameter("password")
		
//		if(passord == getServletConfig().getInitParameter("password")) {
		if(passord.equals(loginpassord)) {
		
//			Vare = em.find(vare.class, "fisk");
//			out.print(Vare.getNavn());
//			response.sendRedirect(arg0);
			
		}
		else{
//			out.print("<p>"+config.getInitParameter("password")+"</p>");
			out.print("<p>Nay...</p>");
			out.println(passord);
			out.println(loginpassord);
		}
//		Vare.setNavn("jesus");
//		vare Vare = new vare("jesus");

//		eao.leggTilVare(Vare);
//		eao.finnVare("fisk");
////		eao.slettVare("fisk");
//		vare Vare = new vare();
//		Vare.setNavn("jesus");
////		
////		out.print(Vare.getNavn());
//		eao.leggTilVare(Vare);
		vare Vare = eao.finnVare("fisk");
		out.println(Vare.getNavn());
//		eao.slettVare("fisk");
//		eao.oppdaterVare(Vare);
		
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("varePersistenceUnit");
//		EntityManager em = emf.createEntityManager();
//
//		EntityTransaction tx = em.getTransaction();
//		vare Vare = new vare();
//		Vare.setNavn("Jesus");
//		try {
//			tx.begin();
//			em.persist(Vare);
//			tx.commit();
//
//		} catch (Exception e) {
//			if (tx.isActive()) {
//				tx.rollback();
//			}
//		} finally {
//			em.close();
//		}
//		Vare.setNavn("jesus");
//		em.persist(Vare);
//		Vare.setNavn("Jesus! For faen");
//		out.println(getInitParameter("password"));


	}

}
