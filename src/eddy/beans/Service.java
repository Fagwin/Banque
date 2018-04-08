package eddy.beans;

public class Service {
	
	
	private String titre ;
	private String commentaire ;
	private String image ;

	
	
	
	/*public Utilisateur(String nom, String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	*/
	public Service(String titre,String commentaire, String image) {
		// TODO Auto-generated constructor stub
		this.titre = titre;
		this.commentaire = commentaire;
		this.image = image;
		
	}


	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getCommentaire() {
		return commentaire;
	}




	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}




	public String getImage() {
		return image;
	}




	public void setImage(String image) {
		this.image = image;
	}
	
	

}
