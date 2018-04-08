package com.octest.servlets;

import eddy.beans.*;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eddy.bdd.DaoActualite;
import beans.Actu;
import beans.Users;
/**
 * Servlet implementation class Actu
 */
@WebServlet("/ActuFr")
public class ActuFr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ActuFr() {
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

		String util = "admin";

		request.setAttribute("utilisateur", util);
		//response.setContentType("text/html");
		

		// connection Bdd
		DaoActualite dao = new DaoActualite();
		HttpSession session= request.getSession();

		ArrayList<Actu> test = new ArrayList<Actu>();

		test = dao.getActualite();

		request.setAttribute("test", test);
		
		session.setAttribute("test", test);
		//response.sendRedirect("Actualites.jsp");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/ActualiteFr.jsp").forward(request, response);
		
		
		

	}

}
