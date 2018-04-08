package dao;
import dto.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.util.Random;

/**
 * Classe d'acc�s aux donn�es contenues dans la table message
 * @author lesly
 * */
public class CompteDAO {
	
	/**
	 * Param�tres de connexion � la base de donn�es
	 */
	final static String URL = "jdbc:mysql://localhost/banque";
	final static String LOGIN="root";
	final static String PASS="";
	/**
	 * singleton attribut permettant de mettre en oeuvre le design pattern singleton
	 */
	private static CompteDAO singleton;
	
	/**
	 * Constructeur (priv�) de la classe
	 * Priv� car utilisation du design pattern singleton
	 */
	private CompteDAO()
	{
		// chargement du pilote Mysql
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e2) {
			System.out.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier mysql-connector-java-XXXX.jar dans le projet");
		}
		
	}
	/**
	 * Permet de r�cup�rer l'instance unique de la classe CompteDAO
	 * cf design pattern singleton
	 * @return
	 */
	public static CompteDAO getInstance()
	{
		if(CompteDAO.singleton==null)
			singleton=new CompteDAO();
		return singleton;
	}
	
	/**
	 * Permet d'ajouter un compte dans la table compte
	 * @param c le compte � ajouter
	 * @return le nombre de ligne ajout�es dans la table
	 */
	public int ajouter(Compte cl)
	{
		Connection con = null;
		PreparedStatement ps = null;
		int retour=0;
	
		//connexion a la base de donn�es
		try {
		String	debut="70";
		
		Random rand = new Random();
		String num = debut.concat(Client.getTelephone());
		
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("INSERT INTO compte ( type, typeCarte, service, chequier, releve, alerte, moyen, numeroCompte) VALUES (?,?,?,?,?,?,?,?)");
			
			ps.setString(1,cl.getType());
			ps.setString(2,cl.getTypeCarte());
			ps.setString(3,cl.getService());		
			ps.setString(4,cl.getChequier());			
			ps.setString(5,cl.getReleve());
			ps.setString(6,cl.getAlerte());	
			ps.setString(7,cl.getMoyen());	
			ps.setString(8, num);
			
			
			 
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
	 * Permet de r�cup�rer un message � partir de son id
	 * @param id l'id du message � r�cup�rer
	 * @return le message
	 * @return null si aucun message ne correspond � cet id
	 */
	public Compte getCompte(int idCompte)
	{
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		Compte retour=null;
	
		//connexion a la base de donn�es
		try {
			
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM compte WHERE id=?");
			ps.setInt(1,idCompte);
						
			//on execute la requete 
			rs=ps.executeQuery();
			if(rs.next())
				retour=new Compte(rs.getInt("idCompte"), rs.getString("type"), rs.getString("typeCarte"),
	rs.getString("service"), rs.getString("chequier"), rs.getString("releve"), rs.getString("alerte"), rs.getString("moyen"), rs.getString("numeroCompte") );
			

	
			
			
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
	 * Permet de r�cup�rer tous les messages de la table
	 * @return la liste des messages
	 */
	public List<Compte> getListeComptes()
	{
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		List<Compte> retour=new ArrayList<Compte>();
	
		//connexion a la base de donn�es
		try {
			
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM compte");
									
			//on execute la requete 
			rs=ps.executeQuery();
			//on parcourt les lignes du resultat
			while(rs.next())
				retour.add(new Compte(rs.getInt("idCompte"), rs.getString("type"), rs.getString("typeCarte"),
						rs.getString("service"), rs.getString("chequier"), rs.getString("releve"), rs.getString("alerte"), rs.getString("moyen"), rs.getString("numeroCompte")));
			
			
			
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
		CompteDAO compteDAO=new CompteDAO();
		//test de la m�thode ajouter
		Compte c=new Compte(2, "Courant", "Visa","Assurance","Oui","Oui","Non","Mail", "705874568855");
				  
		int retour=compteDAO.ajouter(c);
		System.out.println(retour+ " lignes ajout�es");
		
		//test de la m�thode getMessage
		Compte c2=compteDAO.getCompte(2);
		System.out.println(c2);
		
		//test de la m�thode getListeMessages
		List<Compte> liste=compteDAO.getListeComptes();
		System.out.println(liste);
		
	}
	
	


}
