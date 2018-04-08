package eddy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Actu;
import eddy.bdd.DaoActualite;

/**
 * Servlet implementation class ModifActu
 */
@WebServlet("/ModifActu")
public class ModifActu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static final String CHAMP_TITRE = "titre";
	public static final String CHAMP_TEXTE = "texte";
	public static final String CHAMP_IMG = "img";
	public static final String CHAMP_DATE = "date";
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifActu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String titre = request.getParameter(CHAMP_TITRE);
		String texte = request.getParameter(CHAMP_TEXTE);
		String img = request.getParameter(CHAMP_IMG);
		String date = request.getParameter(CHAMP_DATE);
		
		
		
		
		// connection Bdd
	     DaoActualite dao = new DaoActualite();
		// Creation nouvelle actualité
		Actu actualite = new Actu(titre,texte,img,date);
		// ajout a la base de données
		dao.add(actualite);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/ModifActu.jsp").forward(request, response);
		
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
