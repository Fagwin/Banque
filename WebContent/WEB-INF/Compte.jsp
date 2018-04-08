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
				      <th style="font-size: 20px;">2-Votre Compte</th>
				    </tr>
				  </thead>
				 </table>

					<div class="panel-body">
						<form  action="/Banque/fr/controleur-compte" method="POST" class="formCompte">
							<div class="form-group form-row">
								<input type="hidden" name="action2" value="AjouterUnCompte">

								<legend class="col-form-legend ">Quel type de compte
									souhaitez vous créer?</legend>

								<div class="form-check">
									<label class="form-check-label"> <input
										class="form-check-input" type="radio" name="type"
										id="type" value="courant" checked> Compte
										Courant
									</label>
								</div>
								
								<div class="form-check">
									<label class="form-check-label"> <input
										class="form-check-input" type="radio" name="type"
										id="type" value="epargne"> Compte Epargne
									</label>
								</div>
								<div class="form-check">
									<label class="form-check-label"> <input
										class="form-check-input" type="radio" name="type"
										id="type" value="titre"> Compte Titre
									</label>
								</div>
								</div>
								</br>
								<div class="form-group form-row">

									<legend class="col-form-legend ">Quel type de carte
										désirez vous?</legend>

									<select class="custom-select" id="typeCarte" name="typeCarte">
										<option selected>Cliquez pour choisir</option>
										<option value="visa classique">Carte Visa Classique</option>
										<option value="visa premier">Carte Visa Premier</option>
										<option value="v pay">Carte VPay</option>
										<option value="master">Master Card</option>
									</select>
								</div>
								</br>
								<div class="form-group form-row">

										<legend class="col-form-legend ">Quels services
											désirez vous?</legend>
								<div class="form-check form-check">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" name="service"
											id="service" value="paiement sans contact"> Paiement
											Sans Contact
										</label>
									</div>
									<div class="form-check form-check">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" name="service"
											id="service" value="e-carte bleue"> E-Carte Bleue
										</label>
									</div>
									<div class="form-check form-check">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" name="service"
											id="service" value="assurance"> Assurance*
										</label>
									</div>
								</div>
								</br>
								<div class="form-group form-row">
								<legend class="col-form-legend ">Voulez vous commander
										un chequier?</legend>

									<div class="form-check">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" name="chequier"
											id="chequier" value="oui" checked> Oui
										</label>
									</div>
									<div class="form-check">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" name="chequier"
											id="chequier" value="non"> Non
										</label>
									</div>
									</div>
									</br>
								<div class="form-group form-row">
									<legend class="col-form-legend ">Voulez vous recevoir
										vos relevés de compte mensuels en ligne?</legend>

									<div class="form-check">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" name="releve"
											id="releve" value="oui" checked> Oui
										</label>
									</div>
									<div class="form-check">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" name="releve"
											id="releve" value="non"> Non
										</label>
									</div>

									</div>

									</br>
								<div class="form-group form-row">
									<legend class="col-form-legend ">Voulez vous recevoir
										des alertes sur votre compte ?</legend>

									<div class="form-check">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" name="alerte"
											id="alerte" value="oui" checked> Oui
										</label>
									</div>
									<div class="form-check">
										<label class="form-check-label"> <input
											class="form-check-input" type="radio" name="alerte"
											id="alerte" value="non"> Non
										</label>
									</div>
									</div>

									</br>
								
									<legend class="col-form-legend ">Par quels moyens
										souhaitez vous être contacté par votre banque?</legend>

									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" name="moyen"
											id="moyen" value="mail"> Mail
										</label>
									</div>
									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" name="moyen"
											id="moyen" value="telephone"> Téléphone
										</label>
									</div>
									<div class="form-check form-check-inline">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" name="moyen"
											id="moyen" value="courrier"> Courrier
										</label>
									</div>

									<div class="form-check form-check-inline ">
										<label class="form-check-label"> <input
											class="form-check-input" type="checkbox" name="moyen"
											id="moyen" value="sms"> SMS
										</label>
									</div>
									</br></br>
								<a> <input style="float: center;" type="submit" value="Terminer">
								</a>


						</form>
						</div>
			
	<a> * L'assurance des moyens de paiement , permet de vous protéger
		en cas de perte ou de vol de votre carte ou de votre chéquier. Vous
		pouvez la résilier à tout moment.</a>

	</div>
	</main>
	
</body>
</html>

