package eddy.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Users;



public class DaoInfoPerso {
	
	
	

	private static String URL = "jdbc:mysql://localhost/";
	private static String LOGIN="root";
	private static String PASS="";
	
	


	static Connection DaoConnection() throws SQLException
	{
		URL = "jdbc:mysql://localhost/banque";
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
	
	
	public Users con (String email )
	{
		//initialisation
		Connection connection  = null;
		
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		Users retour = null ;

		//connexion a la base de données
		try 
		{
			connection = DaoConnection();
			ps =  connection.prepareStatement("SELECT *  FROM clients  WHERE emailVisiteur = ? ");
			//on execute la requete
			ps.setString(1,email);
		
			//on execute la requete 
			rs=ps.executeQuery();
			if(rs.next())
				retour =new Users(rs.getString("idClient"),rs.getString("idCompte"),rs.getString("nom_naissance"),rs.getString("nomUsage"),rs.getString("prenomVisiteur"),rs.getString("telephoneVisiteur"),rs.getString("addressVisiteur"),rs.getString("nationaliteVisiteur"),rs.getString("communeVisiteur"),rs.getString("paysVisiteur"),rs.getString("emailVisiteur"),rs.getString("civiliterVisiteur"),rs.getString("professionVisiteur"),rs.getString("dateVisiteur"));
            
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
		DaoInfoPerso connection= new DaoInfoPerso();
		String email= "quentin.vaslin@gmail.com" ;
		Users utilisateur = connection.con(email);
			
	}

}
