package com.octest.forms;

import dao.*;
import dto.*;
import java.util.*;
import java.text.SimpleDateFormat;



import javax.servlet.http.*;

public class IdentificationForm {
	private String resultat;

	public void verifierIdentifiants( HttpServletRequest request) {
		String mdp = request.getParameter("mdp");
		String mdp2 = request.getParameter("mdp2");
		try {
			if(mdp2.equals(mdp)) {
				String date=request.getParameter("date");
				SimpleDateFormat datee = new SimpleDateFormat("YYYY-MM-DD");
				Date dateee = datee.parse(date);
				java.sql.Date dateeee = new java.sql.Date(dateee.getTime());
				
				
					Client cl= new Client(1,request.getParameter("nomNaissance"),request.getParameter("nomUsage"),request.getParameter("prenom"),
							request.getParameter("telephone"),request.getParameter("adresse"),request.getParameter("nationalite"),request.getParameter("commune"),
							request.getParameter("pays"),request.getParameter("email"),request.getParameter("civilite"),request.getParameter("profession"),
							dateeee, request.getParameter("mdp"), "oi" /*,rs.getLongBlob("fichier")*/);
				
					int retour=ClientDAO.getInstance().ajouter(cl);
					if(retour==1)
						resultat="/Banque/fr/creation-compte";
					else
						resultat="/WEB-INF/erreur.jsp";
					
				}
				
				else
					resultat="mauvaismdp.jsp";
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	
	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
}
