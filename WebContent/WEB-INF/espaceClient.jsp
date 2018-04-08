<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/header_en.jsp"%>
 	<main role="main" class="col-sm-9 ml-sm-auto col-md-10 pt-3">
          <div class="container spacer col-md-8 col-xs-12 col-md-offset-12" >
            <div class=" panel panel-default ">
  <div class="panel-body">
                    <form class ="form horizontal" action="ControleurClient" method="POST">
    <div class="form-group">
         <input type="hidden" name="action1" value="AjouterUnClient">
    
      
      
      <legend class="col-form-legend col-sm-2">Civilité</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <label class="form-check-label">
      
      
      
  <input id="radio1" name="civilite" type="radio" value="monsieur" class="custom-control-input">
  <span class="custom-control-indicator"></span>
  <span class="custom-control-description">Monsieur</span>
</label>
<label class="custom-control custom-radio">
  <input id="radio2" name="civilite" type="radio" value="madame" class="custom-control-input">
  <span class="custom-control-indicator"></span>
  <span class="custom-control-description">Madame</span>
</label>
<label class="custom-control custom-radio">
  <input id="radio3" name="civilite" type="radio" value="mademoiselle" class="custom-control-input">
  <span class="custom-control-indicator"></span>
  <span class="custom-control-description">Mademoiselle</span>
</label>
</div>                  
                       <div class="form-group">
                            <label class="control-label" for="nom"> Nom de naissance</label>
                            <input type="text" class="form-control" placeholder="nom" id="nom" name="nomNaissance" aria-describedby="sizing-addon1"  required >
                       </div>
                       <div class="form-group">
                            <label class="control-label" for="nomu"> Nom d'usage</label>
                            <input type="text" class="form-control" placeholder="nomu" id="nomu" name="nomUsage" aria-describedby="sizing-addon1"    required>
                       </div>
                                <div class="form-group">
                            <label class="control-label" for="prenom"> Prénom</label>
                            <input type="text" class="form-control" placeholder="Prénom" id="prenom" name="prenom" aria-describedby="sizing-addon1"  required>
                       </div>
                       <div class="form-group">
                            <label class="control-label" for="date">Date de naissance</label>
                            <input type="date" class="form-control" placeholder="Date de naissance" id="date" name="date" aria-describedby="sizing-addon1"  required>
                       </div>
                       
                       <div class="form-group">
                            <label class="control-label" for="Commune"> Commune de naissance</label>
                            <input type="text" class="form-control" placeholder="commune" id="commune" name="commune" aria-describedby="sizing-addon1"  required>
                       </div>
                       
                       <div class="form-group">
                            <label class="control-label" for="Pays"> Pays de naissance</label>
                            <input type="text" class="form-control"  id="pays" name="pays" aria-describedby="sizing-addon1"  required>
                       </div>
                       
                        <div class="form-group">
                            <label class="control-label" for="nation"> Nationalité</label>
                            <input type="text" class="form-control" id="nationalite" name="nationalite" aria-describedby="sizing-addon1"  required>
                       </div>
                       
                        
                       <div class="form-group">
                            <label class="control-label" for="adresse"> Adresse</label>
                            <input type="text" class="form-control" placeholder="Votre adresse" id="adresse" name="adresse" aria-describedby="sizing-addon1"  required>
                       </div>
                       
                       <div class="form-group">
                            <label class="control-label" for="email"> Email. Cet email sera votre identifiant de connexion</label>
                            <input type="text" class="form-control" id="email" name="email" aria-describedby="sizing-addon1"  required>
                       </div>
                       
                       <div class="form-group">
                            <label class="control-label" for="email"> Numéro de Téléphone</label>
                            <input type="number" class="form-control" id="telephone" name="telephone" aria-describedby="sizing-addon1"  required>
                       </div>
                              
                         <div class="form-group">
                            <label class="control-label" for="profession">Profession</label>
                            <input type="text" class="form-control"  id="profession" name="profession" aria-describedby="sizing-addon1"  required>
                       </div>
                       
                        <div class="form-group">
                            <label class="control-label" for="mdp">Mot de Passe</label>
                            <input type="text" class="form-control"  id="mdp" name="mdp" aria-describedby="sizing-addon1" required>
                       </div>
                          <div class="form-group">
                            <label class="control-label" for="mdp2">Veuillez confirmer votre mot de Passe</label>
                            <input type="text" class="form-control"  id="mdp2" name="mdp2" aria-describedby="sizing-addon1" required>
                       </div>
                         
                    <div align="right">
  
  <%--  <main role="main" class="col-sm-9 ml-sm-auto col-md-10 pt-3">
         
<form class="form-horizontal" action="   " method="post" name="upload_excel" enctype="multipart/form-data">  --%> 
                    <fieldset>
 
                    
                        
                          <legend class="col-form-legend ">Veuillez fournir ici une pièce justificative (facture, fiche de paie.....) Cela nous permet de confirmer votre identité</legend>
                          
                        
                      
                        
                        
                            <div class="form-check">
          <label class="form-check-label">
                                <input type="file" name="file" id="file" class="input-large">
                                </label>
                            </div>

                        <!-- Button -->
                     
                           
                           </fieldset>
                       </div>
          
                         
                       <div align="right">
                           
                 

<a><input type="submit" value="Etape Suivante"> </a>


 </div>
                         </form>
                   
                   
                   
                </div>
            </div>
        
        </div>

        </main>  

</body>
</html>