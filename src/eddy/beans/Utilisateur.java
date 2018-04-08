package eddy.beans;

public class Utilisateur {
	private String civilite ;
	private String nom ;
	private String prenom ;
	private String adresse;
	private String mail ;
	private String telephone ;
	private String moyen ;
	private String objetMessage ;
	private String message ;
	
	
	/*public Utilisateur(String nom, String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	*/
	public Utilisateur(String civilite,String nom, String prenom, String adresse,String mail,String telephone,String moyen,String objetMessage,String message) {
		// TODO Auto-generated constructor stub
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.telephone =telephone;
		this.moyen =moyen;
		this.objetMessage = objetMessage;
		this.message = message;
		
	}
	
	public String getMoyen() {
		return moyen;
	}

	public void setMoyen(String moyen) {
		this.moyen = moyen;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getObjetMessage() {
		return objetMessage;
	}

	public void setObjetMessage(String objetMessage) {
		this.objetMessage = objetMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNom()
	{
		return this.nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public void setNom(String nom)
	{
		this.nom= nom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom= prenom;
	}
	
	

}
