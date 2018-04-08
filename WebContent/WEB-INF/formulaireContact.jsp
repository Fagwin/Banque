<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/header_fr.jsp"%>

		<div class="cover-container d-flex h-100 p-3 mx-auto flex-column">
			<main role="main" class="inner cover">
          
            <div class=" panel panel-default ">
             	<table id="table" class="table table-hover" style="color:white;" >
				  <thead>
				    <tr>
				      <th style="font-size: 20px;">Demande de renseignement</th>
				    </tr>
				  </thead>
				 </table>

				 <div class="panel-body">
				     <form  action="/Banque/fr/contact" method="POST" class="formCompte">

								<legend class="col-form-legend col-sm-2">Civilité</legend>
								<div class="form-group form-row">
									<div class="form-check">
										<label class="form-check-label"> <label class="custom-control custom-radio"> 
										<input id="radio1" name="civilite" value=" Monsieur" type="radio"
												class="custom-control-input"> 
												<span class="custom-control-indicator"></span> 
												<span class="custom-control-description">Monsieur</span> 
										</label>
										<label class="custom-control custom-radio"> 
										<input id="radio2" name="civilite" value=" Madame" type="radio" class="custom-control-input"> 
											<span class="custom-control-indicator"></span> 
											<span class="custom-control-description">Madame</span>
										</label>
										<label class="custom-control custom-radio"> 
										<input id="radio3" name="civilite" value="Mademoiselle" type="radio" class="custom-control-input"> 
										<span class="custom-control-indicator"></span> 
										<span class="custom-control-description">Mademoiselle</span>
										</label>
									</div>
								</div>

									<div class="form-group form-row">
										<label class="col-sm-4" for="nom"> Nom </label> <input
											type="text" class="form-control col-sm-8" placeholder="nom" id="nom"
											name="nom" aria-describedby="sizing-addon1" value=" "
											required>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4" for="prenom"> Prénom</label> <input
											type="text" class="form-control col-sm-8" placeholder="Prénom"
											id="prenom" name="prenom" aria-describedby="sizing-addon1"
											value="    " required>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4" for="adresse"> Adresse</label> <input
											type="text" class="form-control col-sm-8" placeholder="Votre adresse"
											id="adresse" name="adresse" aria-describedby="sizing-addon1"
											value="   " required>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4" for="email"> Email</label> <input
											type="text" class="form-control col-sm-8" id="email" name="email"
											aria-describedby="sizing-addon1" value="   " required>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4" for="telephone"> Numéro
											de Téléphone</label> <input type="text" class="form-control col-sm-8"
											id="telephone" name="telephone"
											aria-describedby="sizing-addon1" value="   " required>
									</div>


									<legend class="col-form-legend ">Par quels moyens
										sohitez vous etre contacté par la banque?</legend>

									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" id="inlineCheckbox1"
											name="mail1" value="mail"> Mail
										</label>
									</div>
									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" id="inlineCheckbox2"
											name="mail1" value="telephone"> Téléphone
										</label>
									</div>
									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" id="inlineCheckbox3"
											name="mail1" value="courier"> Courrier
										</label>
									</div>

									<div class="form-check form-check-inline ">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" id="inlineCheckbox3"
											name="mail1" value="sms"> SMS
										</label>
									</div>
									>


									<div class="form-group form-row">
										<label class="col-sm-4" for="objet"> Quel est
											l'objet de votre message? </label> <input type="text"
											class="form-control col-sm-8" placeholder="Sujet" id="objet"
											name="objet" aria-describedby="sizing-addon1" value=" "
											required>
									</div>

									<div class="form-group form-row">
										<label for="exampleFormControlTextarea1">Veuillez
											expliciter votre demande ici</label>
										<textarea class="form-control col-sm-8" name="message"
											placeholder="Message" id="message" rows="5"></textarea>
									</div>




									<div align="right">
										<b> Vos informations restent confidentielles. Elles ne
											nous serviront qu'à vous contacter dans le cadre de votre
											requete.</b> <input type="submit" value="Soumettre le formulaire">
									</div>
						</form>



					</div>
				</div>

			</div>

			</main>