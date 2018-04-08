package dto;
/*import java.util.Date;*/
import java.sql.Date;

public class Client{
	
	int id;				//numero de compte
	String nomNaissance;	//nom du titulaire du compte
	String nomUsage;
	String prenom;		//prénom du titulaire du compte
    static String telephone;				//numero de téléphone
	String adresse;	 //adresse du titulaire du compte
	String nationalite;	
	String commune;	
	String pays;	
	String email;
	String civilite;
	String profession;
	Date date;
	String mdp;
	String nomFichier;
	
	 
	/**
	 * Construteur sans paramètres
	 */
	public Client(){
	}
	
	/**
	 * Constructeur
	 * @param 
	 * @param  
	 */
	
	
	
	
	
	
	
	public Client(int id, String nomNaissance, String nomUsage,  String prenom, String telephone, String adresse, String nationalite,
			String commune, String pays, String email, String civilite, String profession, Date date, String mdp, String nomFichier) {
		super();
		this.id= id;				
		this.nomNaissance= nomNaissance;
		this.nomUsage= nomUsage;
		this.prenom= prenom;		
		 this.telephone= telephone;			
		 this.adresse= adresse;	
		 this.nationalite= nationalite;	
		 this.commune= commune;	
		 this.pays=pays;	
		 this.email=email;
		 this.civilite=civilite;
		 this.profession=profession;
		 this.date=date;
		 this.mdp=mdp;
	   this.nomFichier=nomFichier;
		
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomNaissance() {
		return nomNaissance;
	}
	public void setNomNaissance(String nomNaissance) {
		this.nomNaissance= nomNaissance;
	}
	
	public String getNomUsage() {
		return nomUsage;
	}
	public void setNomUsage(String nomUsage) {
		this.nomUsage= nomUsage;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom= prenom;
	}

	
	public static String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone= telephone;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse= adresse;
	}

	
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite= nationalite;
	}

	
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune= commune;
	}
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays= pays;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email= email;
	}

	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite= civilite;
	}

	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession= profession;
	}

	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date= date;
	}
	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp= mdp;
	}

	public String getNomFichier() {
		return nomFichier;
	}
	public void setNomFichier(String nomFichier) {
		this.nomFichier= nomFichier;
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
