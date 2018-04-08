<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/header_fr.jsp"%>
</br></br></br>
        <main role="main" class="col-sm-9 ml-sm-auto col-md-10 pt-3">
          
            <div class=" panel panel-default ">
             	<table id="table" class="table table-hover" style="color:white;" >
				  <thead>
				    <tr>
				      <th style="font-size: 20px;">1-Inscription</th>
				    </tr>
				  </thead>
				 </table>
       
 <div class="panel-body">
     <form  action="/Banque/fr/controleur-client" method="POST" enctype="multipart/form-data" id="formInscription">
	    <div class="form-group form-row">
	        <input type="hidden" name="action1" value="AjouterUnClient">
	    	<legend class="col-form-legend col-sm-2">Civilité</legend>
	        <div class="form-group form-row">
				<div class="form-check">

								<label class="form-check-label"> <input
										class="form-check-input" type="radio" name="civilite"
										id="radio2" value="monsieur" checked> Monsieur
									</label>
								</div>
								
								<div class="form-check">
									<label class="form-check-label"> <input
										class="form-check-input" type="radio" name="civilite"
										id="radio2" value="madame"> Madame
									</label>
								</div>
								<div class="form-check">
									<label class="form-check-label"> <input
										class="form-check-input" type="radio" name="civilite"
										id="radio2" value="mademoiselle"> Mademoiselle
									</label>
								</div>
								</div>
								</br>
					 </div>
	        <div class="form-group form-row">
	        	<label class="col-sm-4" for="nom"> Nom de naissance*</label>
	            <input type="text" class="form-control col-sm-8" placeholder="nom" id="nom" name="nomNaissance" aria-describedby="sizing-addon1"  required >
	        </div>
	        <div class="form-group form-row">
	            <label class="col-sm-4" for="nomu"> Nom d'usage</label>
	            <input type="text" class="form-control col-sm-8" placeholder="nomu" id="nomu" name="nomUsage" aria-describedby="sizing-addon1"    required>
	        </div>
	        <div class="form-group form-row">
	            <label class="col-sm-4" for="prenom"> Prénom*</label>
	            <input type="text" class="form-control col-sm-8" placeholder="Prénom" id="prenom" name="prenom" aria-describedby="sizing-addon1"  required>
	         </div>
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="date">Date de naissance</label>
	            <input type="date" class="form-control col-sm-8" placeholder="Date de naissance" id="date" name="date" aria-describedby="sizing-addon1"  required>
	         </div>      
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="Commune"> Commune de naissance</label>
	            <input type="text" class="form-control col-sm-8" placeholder="commune" id="commune" name="commune" aria-describedby="sizing-addon1"  required>
	         </div>              
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="Pays"> Pays de naissance*</label>
	            <input type="text" class="form-control col-sm-8"  id="pays" name="pays" aria-describedby="sizing-addon1"  required>
	         </div>
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="nation"> Nationalité</label>
	            <input type="text" class="form-control col-sm-8" id="nationalite" name="nationalite" aria-describedby="sizing-addon1"  required>
	         </div>                        
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="adresse"> Adresse*</label>
	            <input type="text" class="form-control col-sm-8" placeholder="Votre adresse" id="adresse" name="adresse" aria-describedby="sizing-addon1"  required>
	         </div>
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="email"> Email*</label>
	            <input type="text" class="form-control col-sm-8" id="email" name="email" aria-describedby="sizing-addon1"  required>
	         </div>  
	         <div class="form-row">
                  <div class="col-sm-4">
                  </div>
                  <small id="courrielHelp" class="form-text text-muted col-sm-8">Cet email sera votre identifiant de connexion</small>
             </div>            
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="email"> Numéro de Téléphone</label>
	            <input type="number" class="form-control col-sm-8" id="telephone" name="telephone" aria-describedby="sizing-addon1"  required>
	         </div>                     
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="profession">Profession*</label>
	            <input type="text" class="form-control col-sm-8"  id="profession" name="profession" aria-describedby="sizing-addon1"  required>
	         </div>              
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="mdp">Mot de Passe*</label>
	            <input type="text" class="form-control col-sm-8"  id="mdp" name="mdp" aria-describedby="sizing-addon1" required>
	         </div>
	         <div class="form-group form-row">
	            <label class="col-sm-4" for="mdp2">Confirmation du mot de Passe*</label>
	            <input type="text" class="form-control col-sm-8"  id="mdp2" name="mdp2" aria-describedby="sizing-addon1" required>
	         </div>
	         <br/>             
	         <div align="right">
	         	<fieldset>
	 				<legend class="col-form-legend ">Veuillez fournir
												ici une pièce justificative (facture, fiche de paie.....)
												Cela nous permet de confirmer votre identité</legend>
					<div class="form-group form-row">
						<label class="control-label" for="nomFichier">Nom du fichier</label> 
						<input type="text" class="form-control col-sm-8"
								id="nomFichier" name="nomFichier"
								aria-describedby="sizing-addon1" required>
					</div>
					<div class="form-group form-row">
	              	<div class="form-check">
	          			<label class="form-check-label">
	                    <input type="file" name="file" id="file" class="input-large">
	                    </label>
	                 </div>
	                  </div>
				</fieldset>
	          </div>
	          </br>
	          <div>
                                <br/>
                                <p>Les champs (*) sont obligatoires</p>
                                <br/>
              </div>
	          <div align="right">
				<a><input type="submit" value="Etape Suivante"> </a>
			  </div>
	    </form>
</div>
			</div>
		
	</main>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      