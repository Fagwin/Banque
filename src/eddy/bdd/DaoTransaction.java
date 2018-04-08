package eddy.bdd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import eddy.beans.Actualite;
import eddy.beans.Transaction;

public class DaoTransaction {
		private static String URL = "jdbc:mysql://localhost/";
		private static String LOGIN="root";
		private static String PASS="";
		
		


		static Connection DaoTransaction() throws SQLException
		{
			URL = "jdbc:mysql://localhost/utilisateurs";
			Connection connection = null ;
			// chargement du pilote Mysql
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				 connection = DriverManager.getConnection(URL, LOGIN, PASS);
				 }
				
			catch (Exception e) {
				System.out.println("bbd incorecte");
			}
			return connection;
			
			
		}
		public int add(Transaction transaction) 
		{
			int idCompte = transaction.getIdCompte();
			String motifTransaction = transaction.getMotifTransaction();
			int montantTransaction = transaction.getMontantTransaction();
			String natureTransaction = transaction.getNatureTransaction();
			String beneficiaire = transaction.getBeneficiaire();
			
			
			
			
			int retour = 0;
			try {	
				Connection connection = DaoTransaction();

				PreparedStatement ps = connection.prepareStatement("INSERT INTO transaction (idCompte, motifTransaction,  montantTransaction, natureTransaction ,beneficiaire) VALUES (?,?,?,?,?)");
				ps.setInt(1,idCompte);
				ps.setString(2,motifTransaction);
				ps.setInt(3, montantTransaction);
				ps.setString(4, natureTransaction);
				ps.setString(5,beneficiaire);
				
				
				retour = ps.executeUpdate();
				connection.close();
				return retour; // return 1 if okey
			}
			catch(Exception e) 
			{
				e.printStackTrace();
				System.out.println(e.getMessage());
				return retour;
			}
		}
		
		
		public Transaction getTransaction ( int id)
		{
			//initialisation
			Connection connection  = null;
			
			PreparedStatement ps = null;
			ResultSet rs=null;
			
			Transaction retour = null ;

			//connexion a la base de données
			try 
			{
				connection = DaoTransaction();
				ps =  connection.prepareStatement("SELECT idTransaction, motifTransaction, montantTransaction, natureTransaction,beneficiaire   FROM transaction  WHERE idTransaction = ? ");
				//on execute la requete
				ps.setInt(1,id);
			
				//on execute la requete 
				rs=ps.executeQuery();
				if(rs.next())
					retour =new Transaction(rs.getInt("idTransaction"),id,rs.getString("motifTransaction"),rs.getInt("montantTransaction"),rs.getString("natureTransaction"),rs.getString("beneficiaire"));
	            
			}
			catch (Exception ee) 
			{
				ee.printStackTrace();
			} 
			finally 
			{
				//fermeture du rs,preparedStatement et de la connexion
				try {if (rs != null)rs.close();} catch (Exception t) {}
				try {if (ps != null)ps.close();} catch (Exception t) {}
				try {if (connection  != null)connection .close();} catch (Exception t) {}
			}
			return retour;


		}
		
		
		
		public static void main(String[] args) 
		{
		
			//creation d'un mdp et d'un email
			DaoTransaction connection= new DaoTransaction();
			//test d'ajout
			//Transaction t = new Transaction(2,"reglement de compte",100,"Crediteur","Eddy"); 
			 //connection.add(t);
			//test de recuperation
			Transaction t = connection.getTransaction(1);
		 System.out.println(t.getMotifTransaction());		
		}

	}



