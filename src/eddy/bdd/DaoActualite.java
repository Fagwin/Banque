package eddy.bdd;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Actu;

public class DaoActualite
{
	

	private static String URL = "jdbc:mysql://localhost:3306/banque";
	private static String LOGIN="root";
	private static String PASS="";
	/**
	 * singleton attribut permettant de mettre en oeuvre le design pattern singleton
	 * @throws SQLException 
	 */

	static Connection DaoActualite() throws SQLException
	{
		URL = "jdbc:mysql://localhost:3306/banque";
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

	
	public int add(Actu actu) 
	{
		String titre = actu.getTitre();
		String texte = actu.getTexte();
		String img = actu.getImg();
		String date = actu.getDate();
		
		
		
		
		
		int retour = 0;
		try {	
			Connection connection = DaoActualite();

			PreparedStatement ps = connection.prepareStatement("INSERT INTO actualite (titreActu, texteActu,  imageActu, dateActu) VALUES (?,?,?,?)");
			ps.setString(1,titre);
			ps.setString(2,texte);
			ps.setString(3, img);
			ps.setString(4, date);
			
			
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
	
	public ArrayList<Actu> getActualite()
	{
		//initialisation
		Connection connection  = null;
		
		PreparedStatement ps = null;
		ResultSet rs=null;
		Actu ret=null;
		ArrayList<Actu> retour = new ArrayList<Actu>();
		//connexion a la base de données
		try {
			connection = DaoActualite();
			ps =  connection.prepareStatement("SELECT *  FROM actualite");
			//on execute la requete 
			rs=ps.executeQuery();
			while(rs.next())
				ret =new Actu(rs.getString("titreActu"),rs.getString("texteActu"),rs.getString("imageActu"),rs.getString("dateActu"));
				retour.add(ret);

		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			//fermeture du rs,preparedStatement et de la connexion
			try {if (rs != null)rs.close();} catch (Exception t) {}
			try {if (ps != null)ps.close();} catch (Exception t) {}
			try {if (connection  != null)connection .close();} catch (Exception t) {}
		}
		return retour;

	}
	
	public static void main(String[] args) 
	{
		
	}

}
