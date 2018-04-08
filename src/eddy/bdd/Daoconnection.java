package eddy.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Client;
import eddy.beans.User;




public class Daoconnection {
	
	
	

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
			e.printStackTrace();
		}
		return connection;
		
		
	}
	
	
	public Client con (String email )
	{
		//initialisation
		Connection connection  = null;
		
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		Client retour = null ;

		//connexion a la base de données
		try 
		{
			connection = DaoConnection();
			ps =  connection.prepareStatement("SELECT id, nomNaissance, nomUsage, prenom, telephone,adresse, nationalite, commune, pays, civilite, profession, date,mdp, nomFichier  FROM client  WHERE email = ? ");
			//on execute la requete
			ps.setString(1,email);
		
			//on execute la requete 
			rs=ps.executeQuery();
			if(rs.next())
				retour =new Client(rs.getInt("id"),rs.getString("nomNaissance"),rs.getString("nomUsage"),rs.getString("prenom"),rs.getString("telephone"),rs.getString("adresse"),rs.getString("nationalite"),rs.getString("commune"),email,rs.getString("pays"),rs.getString("civilite"),rs.getString("profession"),rs.getDate("date"),rs.getString("mdp"),rs.getString("nomFichier"));
            
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
		Daoconnection connection= new Daoconnection();
		String email= "amira.bouraima@yahoo.com" ;
		
		Client utilisateur = connection.con(email);
		 System.out.println("aaaa"+utilisateur.getMdp());		
	}

}
