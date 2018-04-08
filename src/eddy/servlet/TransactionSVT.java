package eddy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eddy.bdd.DaoTransaction;
import eddy.bdd.Daoconnection;
import eddy.beans.Transaction;
import eddy.beans.User;

/**
 * Servlet implementation class Transaction
 */
@WebServlet("/Transaction")
public class TransactionSVT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionSVT() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String idC
		this.getServletContext().getRequestDispatcher("/WEB-INF/FormulaireTransaction.jsp").forward( request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DaoTransaction t = new DaoTransaction();
		
		String next = null ;
		String mot = null ;
		int idC = 0;// = request.getParameter("idClient");
		String motifTransaction = request.getParameter("motif");
		int montantTransaction= 0; //= request.getParameter("montant");
		String natureTransaction = request.getParameter("nature");
		String beneficiaire = request.getParameter("beneficiaire");
		
		Transaction transaction = new Transaction(idC,motifTransaction,montantTransaction,natureTransaction,beneficiaire);
		
		int test = t.add(transaction);
		if(test!=0)
		{
			if(test == 1)
			{
				next = "/WEB-INF/acceuilClient.jsp";
			}
			else
			{
				next = "/WEB-INF/FormulaireTransaction.jsp";
			}
		}
		
		
		
		this.getServletContext().getRequestDispatcher("next").forward( request, response);
	}

}
