package beans;

public class Users {
	
	private String idClient ;
	private String idCompte ;
	private String nom_naissance ;
	private String nomUsage ;
	private String prenom;
	private String tel;
	private String address;
	private String nationalite;
	private String commune;
	private String pays;
	private String email;
	private String civiliter;
	private String profession;
	private String date;
	
	
	
	
	public Users(String idClient, String idCompte, String nom_naissance, String nomUsage, String prenom, String tel,
			String address, String nationalite, String commune, String pays, String email, String civiliter,
			String profession, String date) {
		super();
		this.idClient = idClient;
		this.idCompte = idCompte;
		this.nom_naissance = nom_naissance;
		this.nomUsage = nomUsage;
		this.prenom = prenom;
		this.tel = tel;
		this.address = address;
		this.nationalite = nationalite;
		this.commune = commune;
		this.pays = pays;
		this.email = email;
		this.civiliter = civiliter;
		this.profession = profession;
		this.date = date;
	}




	public String getIdClient() {
		return idClient;
	}




	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}




	public String getIdCompte() {
		return idCompte;
	}




	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}




	public String getNom_naissance() {
		return nom_naissance;
	}




	public void setNom_naissance(String nom_naissance) {
		this.nom_naissance = nom_naissance;
	}




	public String getNomUsage() {
		return nomUsage;
	}




	public void setNomUsage(String nomUsage) {
		this.nomUsage = nomUsage;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getTel() {
		return tel;
	}




	public void setTel(String tel) {
		this.tel = tel;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getNationalite() {
		return nationalite;
	}




	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}




	public String getCommune() {
		return commune;
	}




	public void setCommune(String commune) {
		this.commune = commune;
	}




	public String getPays() {
		return pays;
	}




	public void setPays(String pays) {
		this.pays = pays;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getCiviliter() {
		return civiliter;
	}




	public void setCiviliter(String civiliter) {
		this.civiliter = civiliter;
	}




	public String getProfession() {
		return profession;
	}




	public void setProfession(String profession) {
		this.profession = profession;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	
	
	
	
	
	
	
	

}
