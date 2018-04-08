package eddy.beans;

public class Actu {
	
	private String titre ;
	private String texte ;
	private String img ;
	private String date ;
	public Actu(String titre, String texte, String img, String date) {
		super();
		this.titre = titre;
		this.texte = texte;
		this.img = img;
		this.date = date;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	
}
