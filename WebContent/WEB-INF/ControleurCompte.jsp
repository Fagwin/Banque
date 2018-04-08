<%@ page import="dao.*,dto.*,java.util.*"%>
<%
	String action2 = request.getParameter("action2");
	String pageSuivante = "erreur.jsp";

	try {

		if ("AjouterUnCompte".equals(action2)) {

			Compte c = new Compte(0, request.getParameter("type"), request.getParameter("typeCarte"),
					request.getParameter("service"), request.getParameter("chequier"),
					request.getParameter("releve"), request.getParameter("alerte"),
					request.getParameter("moyen"), request.getParameter("numeroCompte"));
			int retour = CompteDAO.getInstance().ajouter(c);
			if (retour == 1)
				pageSuivante = "inscription.jsp";
			else
				pageSuivante = "erreur.jsp";
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
%>

<jsp:forward page="<%=pageSuivante%>" />

