package eddy.bdd;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import eddy.beans.Utilisateur;

public class Dao
{
	

	private static String URL = "jdbc:mysql://localhost/";
	private static String LOGIN="root";
	private static String PASS="";
	/**
	 * singleton attribut permettant de mettre en oeuvre le design pattern singleton
	 * @throws SQLException 
	 */

	static Connection Dao() throws SQLException
	{
		URL = "jdbc:mysql://localhost/utilisateurs";
		Connection connection = null ;
		// chargement du pilote Mysql
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			 connection = DriverManager.getConnection(URL, LOGIN, PASS);
			 }
			
		catch (Exception e) {
			System.out.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier mysql-connector-java-XXXX.jar dans le projet");
		}
		return connection;
		
		
	}

	
	public int add(Utilisateur users) 
	{
		String civilite = users.getCivilite();
		String nom = users.getNom();
		String prenom = users.getPrenom();
		String adresse = users.getAdresse();
		String mail = users.getMail();
		String moyen = users.getMoyen();
		String telephone = users.getTelephone();
		String objetMessage = users.getObjetMessage() ;
		String message = users.getMessage();
		
		
		
		int retour = 0;
		try {	
			Connection connection = Dao();

			PreparedStatement ps = connection.prepareStatement("INSERT INTO formulaire_demandeinformation (civiliteVC, nomVC,  prenomVC, adresseVC,mailVC, telephoneVC, moyenVC, objetMessageVC, messageVC) VALUES (?,?,?,?,?,?,?,?,?)");
			ps.setString(1,civilite);
			ps.setString(2, prenom);
			ps.setString(3,nom);
			ps.setString(4, adresse);
			ps.setString(5,mail);
			ps.setString(6,telephone);
			ps.setString(7,moyen);
			ps.setString(8, objetMessage);
			ps.setString(9, message);
			
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
	
	public Utilisateur getClient(int id)
	{
		//initialisation
		Connection connection  = null;
		
		PreparedStatement ps = null;
		ResultSet rs=null;
		Utilisateur retour=null;

		//connexion a la base de données
		try {
			connection = Dao();
			ps =  connection.prepareStatement("SELECT civiliteVC, nomVC, prenomVC, adresseVC , mailVC, telephoneVC , moyenVC,objetMessageVC , messageVC FROM formulaire_demandeinformation WHERE idMessage= ?");
			ps.setInt(1,id);
			//on execute la requete 
			rs=ps.executeQuery();
			if(rs.next())
				retour =new Utilisateur(rs.getString("civiliteVC"),rs.getString("nomVC"),rs.getString("prenomVC"),rs.getString("adresseVC"),rs.getString("mailVC"),rs.getString("telephoneVC"),rs.getString("moyenVC"),rs.getString("objetMessageVC"),rs.getString("messageVC"));
            
			

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
		/*// connection Bdd
	     Dao daos = new Dao();
		// Creation nouveau client
		Utilisateur client = new Utilisateur("Mme","Mbouki","Manuella","2 avenue maryse bastier","siewema@yahoo.fr","0753485095"," SMS","Carte","je nais pas de carte bancaire et ca m'enerve ");
		// ajout a la base de donner
		daos.add(client);*/
		//Recupération du client a partir de lid
		//stocker dans lamda l'utilisateur recuperer
		Dao daos = new Dao();
		int id = 22;
		Utilisateur lambda = daos.getClient(id);
		//affichage du client trouver
		//String nom =  lambda.getPrenom();
		
		System.out.println(lambda.getAdresse());
	
		
	}

}
