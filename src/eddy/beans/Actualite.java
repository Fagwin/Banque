package eddy.beans;

public class Actualite {
	
		private String titre ;
		private String commentaire ;
		private String image ;
		private String dateCreation;
		private String dateLimite ;
		
		
		
		/*public Utilisateur(String nom, String prenom)
		{
			this.nom = nom;
			this.prenom = prenom;
		}
		*/
		public Actualite(String titre,String commentaire, String image, String dateCreation, String dateLimite) {
			// TODO Auto-generated constructor stub
			this.titre = titre;
			this.commentaire = commentaire;
			this.image = image;
			this.dateCreation = dateCreation;
			this.dateLimite = dateLimite;
			
			
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



		public String getDateCreation() {
			return dateCreation;
		}



		public void setDateCreation(String dateCreation) {
			this.dateCreation = dateCreation;
		}



		public String getDateLimite() {
			return dateLimite;
		}



		public void setDateLimite(String dateLimite) {
			this.dateLimite = dateLimite;
		}
		
		

}
