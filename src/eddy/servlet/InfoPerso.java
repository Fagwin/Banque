package eddy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eddy.bdd.DaoInfoPerso;
import beans.Users;

/**
 * Servlet implementation class InfoPerso
 */
@WebServlet("/InfoPerso")
public class InfoPerso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final String CHAMP_NOM = "nom";
	public static final String CHAMP_PRENOM = "prenom";
	public static final String CHAMP_ADRESSE = "adresse";
	public static final String CHAMP_EMAIL = "email";
	public static final String CHAMP_TEL = "tel";
	public static final String CHAMP_ANNIV = "anniv";
	public static final String CHAMP_SEXE = "sexe";
	public static final String CHAMP_NATIO = "natio";
	public static final String CHAMP_COMMUNE = "commune";
	public static final String CHAMP_PAYS = "pays";
	public static final String CHAMP_PROFESS = "profess";
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InfoPerso() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		DaoInfoPerso validate = new DaoInfoPerso();
		Users utilisateur = validate.con("quentin.vaslin@gmail.com");
		
		
		String nom = utilisateur.getNomUsage();
		String prenom = utilisateur.getPrenom();
		String adresse = utilisateur.getAddress();
		String email = utilisateur.getEmail();
		String tel = utilisateur.getTel();
		String anniv = utilisateur.getDate();
		String sexe = utilisateur.getCiviliter();
		String natio = utilisateur.getNationalite();
		String commune = utilisateur.getCommune();
		String pays = utilisateur.getPays();
		String profess = utilisateur.getProfession();

		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("adresse", adresse);
		request.setAttribute("email", email);
		request.setAttribute("tel", tel);
		request.setAttribute("anniv", anniv);
		request.setAttribute("sexe", sexe);
		request.setAttribute("natio", natio);
		request.setAttribute("commune", commune);
		request.setAttribute("pays", pays);
		request.setAttribute("profess", profess);

		this.getServletContext().getRequestDispatcher("/WEB-INF/InfosPerso.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		

		
	}
}
