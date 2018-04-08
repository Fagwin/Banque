package eddy.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import eddy.beans.Service;

public class DaoService {


	

		private static String URL = "jdbc:mysql://localhost/";
		private static String LOGIN="root";
		private static String PASS="";
		
		static Connection DaoService() throws SQLException
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

		
		public int add(Service service) 
		{
			String titre = service.getTitre();
			String commentaire = service.getCommentaire();
			String image = service.getImage();
		
			
			
			
			
			int retour = 0;
			try {	
				Connection connection = DaoService();

				PreparedStatement ps = connection.prepareStatement("INSERT INTO service (titreServ, commentaireServ,  imageServ) VALUES (?,?,?)");
				ps.setString(1,titre);
				ps.setString(2,commentaire);
				ps.setString(3, image);
				
				
				
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
		
		public Service getSerrvice(int id)
		{
			//initialisation
			Connection connection  = null;
			
			PreparedStatement ps = null;
			ResultSet rs=null;
			Service retour=null;

			//connexion a la base de données
			try {
				connection = DaoService();
				ps =  connection.prepareStatement("SELECT titreServ, commentaireServ,  imageServ  FROM Service  WHERE idActu= ?");
				ps.setInt(1,id);
				//on execute la requete 
				rs=ps.executeQuery();
				if(rs.next())
					retour =new Service(rs.getString("titreServ"),rs.getString("commentaireServ"),rs.getString("imageServ"));


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
			// connection Bdd
		     DaoService con = new DaoService();
			// Creation nouvelle Service
			Service Service = new Service("livret A","Lorsque vous disposer d'un compte bancaire chez nous vous ....","image3");
			// ajout a la base de donner
			con.add(Service);
			/*//Recupération du client a partir de lid
			int id = 1;
			Service a = dao.getService(id);
			//affichage du client trouver
			System.out.println(a.getTitre());
		*/
			
		}

}
