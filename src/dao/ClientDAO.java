package dao;
import dto.*;
/*import java.util.Date;*/

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
/*import java.io.File.*/;

/**
 * Classe d'accès aux données contenues dans la table message
 * @author lesly
 * */
public class ClientDAO {
	
	/**
	 * Paramètres de connexion à la base de données
	 */
	final static String URL = "jdbc:mysql://localhost/banque";
	final static String LOGIN="root";
	final static String PASS="";
	/**
	 * singleton attribut permettant de mettre en oeuvre le design pattern singleton
	 */
	private static ClientDAO singleton;
	
	/**
	 * Constructeur (privé) de la classe
	 * Privé car utilisation du design pattern singleton
	 */
	private ClientDAO()
	{
		// chargement du pilote Mysql
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e2) {
			System.out.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier mysql-connector-java-XXXX.jar dans le projet");
		}
		
	}
	/**
	 * Permet de récupérer l'instance unique de la classe CompteDAO
	 * cf design pattern singleton
	 * @return
	 */
	public static ClientDAO getInstance()
	{
		if(ClientDAO.singleton==null)
			singleton=new ClientDAO();
		return singleton;
	}
	
	/**
	 * Permet d'ajouter un compte dans la table compte
	 * @param c le compte à ajouter
	 * @return le nombre de ligne ajoutées dans la table
	 */
	public int ajouter(Client cl)
	{
		Connection con = null;
		PreparedStatement ps = null;
		int retour=0;
		
	
		//connexion a la base de données
		try {
			
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("INSERT INTO client ( nomNaissance, nomUsage, prenom, telephone, adresse,nationalite,\r\n" + 
					" commune, pays, email, civilite, profession, date, mdp, nomFichier) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1,cl.getNomNaissance());
			ps.setString(2,cl.getNomUsage());
			ps.setString(3,cl.getPrenom());
			ps.setString(4,cl.getTelephone());		
			ps.setString(5,cl.getAdresse());			
			ps.setString(6,cl.getNationalite());
			ps.setString(7,cl.getCommune());	
			ps.setString(8,cl.getPays());	
			ps.setString(9,cl.getEmail());	
			ps.setString(10,cl.getCivilite());	
			ps.setString(11,cl.getProfession());	
			ps.setDate(12,cl.getDate());	
			ps.setString(13,cl.getMdp());
		    ps.setString(14,cl.getNomFichier());	
				
			
			//on execute la requete 
			retour=ps.executeUpdate();
			

		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			//fermeture du preparedStatement et de la connexion
			try {if (ps != null)ps.close();} catch (Exception t) {}
			try {if (con != null)con.close();} catch (Exception t) {}
		}
		return retour;
	
	}
	
	/**
	 * Permet de récupérer un message à partir de son id
	 * @param id l'id du message à récupérer
	 * @return le message
	 * @return null si aucun message ne correspond à cet id
	 */
	public Client getClient(int id)
	{
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		Client retour=null;
	
		//connexion a la base de données
		try {
			
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM client WHERE id=?");
			ps.setInt(1,id);
						
			//on execute la requete 
			rs=ps.executeQuery();
			if(rs.next())
				retour=new Client(rs.getInt("id"),rs.getString("nomNaissance"),rs.getString("nomUsage"),rs.getString("prenom"),
						rs.getString("telephone"),rs.getString("adresse"),rs.getString("nationalite"),rs.getString("commune"),
						rs.getString("pays"),rs.getString("email"),rs.getString("civilite"),rs.getString("profession"),
						rs.getDate("date") , rs.getString("mdp") ,rs.getString("nomFichier"));
			

	
			
			
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			//fermeture du rs,preparedStatement et de la connexion
			try {if (rs != null)rs.close();} catch (Exception t) {}
			try {if (ps != null)ps.close();} catch (Exception t) {}
			try {if (con != null)con.close();} catch (Exception t) {}
		}
		return retour;
	
	}
	
	/**
	 * Permet de récupérer tous les messages de la table
	 * @return la liste des messages
	 */
	public List<Client> getListeClients()
	{
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		List<Client> retour=new ArrayList<Client>();
	
		//connexion a la base de données
		try {
			
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM client");
									
			//on execute la requete 
			rs=ps.executeQuery();
			//on parcourt les lignes du resultat
			while(rs.next())
				retour.add(new Client(rs.getInt("id"),rs.getString("nomNaissance"),rs.getString("nomUsage"),rs.getString("prenom"),
						rs.getString("telephone"),rs.getString("adresse"),rs.getString("nationalite"),rs.getString("commune"),
						rs.getString("pays"),rs.getString("email"),rs.getString("civilite"),rs.getString("profession"),
						rs.getDate("date"),rs.getString("mdp") , rs.getString("nomFichier")));
			
			
			
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			//fermeture du rs,preparedStatement et de la connexion
			try {if (rs != null)rs.close();} catch (Exception t) {}
			try {if (ps != null)ps.close();} catch (Exception t) {}
			try {if (con != null)con.close();} catch (Exception t) {}
		}
		return retour;
	
	}
	
	
	
	//main permettant de tester la classe
	public static void main(String[] args){
		ClientDAO clientDAO=new ClientDAO();
		//test de la méthode ajouter
		Client cl=new Client(1,"GOOOO","GUUUU","Guyyy","0698574235","2 avenue bhsqbi","Tchadien",
				"normandie","France","guyyyy@yahoo.fr","monsieur","Enseignant", Date.valueOf("1997-03-02"), "ghigli55669", "ehfibn,");
		int retour=clientDAO.ajouter(cl);
		System.out.println(retour+ " lignes ajoutées");
		
		//test de la méthode getMessage
		Client cl2=clientDAO.getClient(1);
		System.out.println(cl2);
		
		//test de la méthode getListeMessages
		List<Client> liste=clientDAO.getListeClients();
		System.out.println(liste);
		
	}
	
	


}
