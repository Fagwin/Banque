package eddy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eddy.bdd.Dao;
import eddy.beans.Utilisateur;


@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaireCreationCompteB.jsp").forward( request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String civilite = request.getParameter("civilite");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String moyen = request.getParameter("mail1");
		String objet = request.getParameter("objet");
		String message = request.getParameter("message");
		
		Utilisateur compte =  new Utilisateur(civilite,nom,prenom,adresse,email,telephone,moyen,objet,message);
		Dao connection = new Dao();
		connection.add(compte);
		
		/*
		String felicitation = "felicitation vous avez réussi";
		request.setAttribute( "felicitation", felicitation);*/
		// TODO Auto-generated method stub
		//this.getServletContext().getRequestDispatcher("/WEB-INF/formulaireCreationCompteB.jsp").forward( request, response);
	    
	
	}

}
