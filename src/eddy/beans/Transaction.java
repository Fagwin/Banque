package eddy.beans;

public class Transaction {
	
	private int idTransaction ;
	private int idCompte ;
	private String motifTransaction ;
	private Integer montantTransaction ;
	private String natureTransaction ;
	private String beneficiaire ;
	
	public Transaction(int idT, int idC,String motif, Integer montant ,String nature,String beneficiaire)
	{
		// TODO Auto-generated constructor stub
	
		this.idTransaction = idT;
		this.idCompte = idC;
		this.motifTransaction = motif;
		this.montantTransaction = montant;
		this.natureTransaction = nature;
		this.beneficiaire =beneficiaire;
		
		
	}
	
	
	public Transaction( int idC,String motif, int montant ,String nature,String beneficiaire)
	{
		// TODO Auto-generated constructor stub
	
		//this.idTransaction = idT;
		this.idCompte = idC;
		this.motifTransaction = motif;
		this.montantTransaction = montant;
		this.natureTransaction = nature;
		this.beneficiaire =beneficiaire;
		
		
	}



	public int getIdTransaction() {
		return idTransaction;
	}




	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}



	public int getIdCompte() {
		return idCompte;
	}




	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}





	public String getMotifTransaction() {
		return motifTransaction;
	}




	public void setMotifTransaction(String motifTransaction) {
		this.motifTransaction = motifTransaction;
	}




	public Integer getMontantTransaction() {
		return montantTransaction;
	}




	public void setMontantTransaction(Integer montantTransaction) {
		this.montantTransaction = montantTransaction;
	}




	public String getNatureTransaction() {
		return natureTransaction;
	}




	public void setNatureTransaction(String natureTransaction) {
		this.natureTransaction = natureTransaction;
	}




	public String getBeneficiaire() {
		return beneficiaire;
	}




	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	

}



