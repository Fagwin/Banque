<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<%@include file="/WEB-INF/header_fr.jsp"%>








<div class="container-fluid">
	<div class="row">
		<br> <br> <br> <br>
		<main role="main" class="col-sm-9 ml-sm-auto col-md-10 pt-3">
		<div class="container spacer col-md-8 col-xs-12 col-md-offset-12">
			<div class=" panel panel-default ">

				<br> <br> <br>
				<table class="table table-bordered  ">
					<thead>
						<tr>

							<th>Modifications données personnelles</th>


						</tr>
					</thead>
				</table>





				<div class="panel-body">
					<form class="form horizontal " method="GET"
						action=" http://localhost:8085/ProjetS8/InfoPerso">
						<div class="form-group">



							<legend class="col-form-legend col-sm-2">Civilité</legend>
							<div class="col-sm-10">
								<div>
									<input type="radio" id="contactChoice1" name="sexe"
										value="Homme"> <label for="contactChoice1">Monsieur</label>

									<input type="radio" id="contactChoice2" name="sexe"
										value="Femme"> <label for="contactChoice2">Madame</label>

								</div>


								<div class="form-group">
									<label class="control-label" for="nom"> Nom </label> <input
										type="text" class="form-control" placeholder="nom" id="nom"
										name="nom" aria-describedby="sizing-addon1" required>
								</div>

								<div class="form-group">
									<label class="control-label" for="prenom"> Prénom</label> <input
										type="text" class="form-control" placeholder="Prénom"
										id="prenom" name="prenom" aria-describedby="sizing-addon1"
										required>
								</div>

								<div class="form-group">
									<label class="control-label" for="adresse"> Adresse</label> <input
										type="text" class="form-control" placeholder="Votre adresse"
										id="adresse" name="adresse" aria-describedby="sizing-addon1"
										required>
								</div>

								<div class="form-group">
									<label class="control-label" for="email"> Email</label> <input
										type="email" class="form-control" id="email" name="email"
										aria-describedby="sizing-addon1" required>
								</div>

								<div class="form-group">
									<label class="control-label" for="telephone"> Numéro de
										Téléphone</label> <input type="tel" class="form-control" id="tel"
										name="tel" aria-describedby="sizing-addon1" required>
								</div>

								<div class="form-group">
									<label class="control-label" for="telephone"> Date de
										naissance</label> <input type="date" class="form-control" id="date"
										name="anniv" aria-describedby="sizing-addon1" required>
								</div>








								<div align="right">
									<b> Vos informations restent confidentielles.</b> <input
										type="submit" value="Modifier">
								</div>
							
							</div>
						</div>
					</form>



				</div>
			</div>

		</div>
	</div>

	</main>
</div>


</body>
</html>