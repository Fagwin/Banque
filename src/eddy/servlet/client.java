package eddy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eddy.bdd.Daoconnection;
import eddy.beans.User;

/**
 * Servlet implementation class client
 */
@WebServlet("/client")
public class client extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public client() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Client.jsp").forward( request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
	/*	Daoconnection con = new Daoconnection();
		User utilisateur;
		String next = null ;
		String mot = null ;
		String email = request.getParameter("email");
		String mdp = request.getParameter("mdp");
		utilisateur = con.con(email);
		if (utilisateur.getMdp()!= null)
		{
		if(mdp.equals( utilisateur.getMdp()))
		{
			mot= "congratulation";
			HttpSession session = request.getSession();
			session.setAttribute("nom", utilisateur.getNom());
			session.setAttribute("prenom", utilisateur.getPrenom());
			if (utilisateur.getFonction().equals("manager"))
			{
				next = "/WEB-INF/acceuilManager.jsp";
			}
			else
			{
				 next = "/fr/authentification/profil";
			}
			
		}
		else
		{
			mot = "try again";
		}
		
		}
		else
		{
			mot ="404 not found";
		}
		
	     request.setAttribute("congrat",mot);*/
		
		this.getServletContext().getRequestDispatcher("next").forward( request, response);
		
		
	}

}
