package dto;
import java.sql.Date;

public class Compte{
	
	int idCompte;				//numero de compte
	/*int id;*/
	String type;	//nom du titulaire du compte
	String typeCarte;
	String service;		//prénom du titulaire du compte
	String chequier;				//numero de téléphone
	String releve;	 //adresse du titulaire du compte
	String alerte;	
	String moyen;	
	String numeroCompte;
	
	/**
	 * Construteur sans paramètres
	 */
	public Compte(){
	}
	
	/**
	 * Constructeur
	 * @param expediteur expéditeur du message
	 * @param message contenu du message
	 */
	public Compte(int idCompte, String type,String typeCarte, String service, String chequier,  String releve, String alerte, String moyen, String numeroCompte) {
		super();
		this.idCompte= idCompte;
		/*this.id= id;				*/
		this.type= type;
		this.typeCarte= typeCarte;
		this.service= service;		
		 this.chequier= chequier;			
		 this.releve= releve;	
		 this.alerte= alerte;	
		 this.moyen= moyen;	
		 this.numeroCompte=numeroCompte;
		 
	}
	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	
	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
*/
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type= type;
	}
	public String getTypeCarte() {
		return typeCarte;
	}
	public void setTypeCarte(String typeCarte) {
		this.typeCarte= typeCarte;
	}
	
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service= service;
	}
	
	public String getChequier() {
		return chequier;
	}
	public void setChequier(String chequier) {
		this.chequier= chequier;
	}
	
	public String getReleve() {
		return releve;
	}
	public void setReleve(String releve) {
		this.releve= releve;
	}

	public String getAlerte() {
		return alerte;
	}
	public void setAlerte(String alerte) {
		this.alerte= alerte;
	}

	
	
	public String getMoyen() {
		return moyen;
	}
	public void setMoyen(String moyen) {
		this.moyen= moyen;
	}
	
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte= numeroCompte;
	}
	
	

	/**
	 * Redéfinition de la méthode toString permettant de définir la traduction de l'objet en String
	 * pour affichage par exemple
	 */
	//@Override
	/*public String toString() {
		return "Compte [id=" + id + ", nomNaissance=" + nomUsage
				+ ", message=" + Compte + "]";
	}*/
	

}
