<%@ page
	import="dao.*,dto.*, java.util.*, java.text.SimpleDateFormat"%>
<%
	String action1 = request.getParameter("action1");
	String pageSuivante = "erreur.jsp";
	String motdepasse = request.getParameter("mdp");
	String motdepase = request.getParameter("mdp2");

	
	try {

		if ("AjouterUnClient".equals(action1)) {
			
			if (motdepasse.equals(motdepase)) {
				
				String date = request.getParameter("date");
				SimpleDateFormat datee = new SimpleDateFormat("YYYY-MM-DD");
				Date dateee = datee.parse(date);
				java.sql.Date dateeee = new java.sql.Date(dateee.getTime());
				
				
				
				Client cl = new Client(1, request.getParameter("nomNaissance"),
						request.getParameter("nomUsage"), request.getParameter("prenom"),
						request.getParameter("telephone"), request.getParameter("adresse"),
						request.getParameter("nationalite"), request.getParameter("commune"),
						request.getParameter("pays"), request.getParameter("email"),
						request.getParameter("civilite"), request.getParameter("profession"), dateeee,
						request.getParameter("mdp"), request.getParameter("nomFichier"));
				
				
				int retour = ClientDAO.getInstance().ajouter(cl);
			
				
				if (retour == 1)
					pageSuivante = "Compte.jsp";
				else
					pageSuivante = "erreur.jsp";

			} else 
				pageSuivante = "mauvaismdp.jsp";
			

		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
%>

<jsp:forward page="<%=pageSuivante%>" />

