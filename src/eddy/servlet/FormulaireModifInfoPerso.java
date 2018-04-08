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
 * Servlet implementation class FormulaireModifInfoPerso
 */
@WebServlet("/FormulaireModifInfoPerso")
public class FormulaireModifInfoPerso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final String CHAMP_ADRESSE = "adresse";
	public static final String CHAMP_NOM = "nom";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormulaireModifInfoPerso() {
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
		this.getServletContext().getRequestDispatcher("/WEB-INF/FormulaireInfoPerso.jsp").forward(request, response);

		DaoInfoPerso validate = new DaoInfoPerso();
		Users utilisateur = validate.con("quentin.vaslin@gmail.com");
		String adresse = utilisateur.getAddress();
		String address = request.getParameter(CHAMP_ADRESSE);

		if (address != adresse) {
			utilisateur.setAddress(address);
			System.out.println(address);
		} else
			System.out.println("erreur" + address);
		
		
		
		
		
		

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
