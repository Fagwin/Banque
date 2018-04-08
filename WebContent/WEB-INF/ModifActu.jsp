<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<%@include file="/WEB-INF/header_actuFr.jsp"%>








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

							<th>Ajouter une actualité</th>


						</tr>
					</thead>
				</table>





				<div class="panel-body">
					<form class="form horizontal " method="GET"
						action="/Banque/fr/modifier-actualite">
						<div class="form-group">





							<div class="form-group">
								<label class="control-label" for="titre"> Titre </label> <input
									type="text" class="form-control" placeholder="titre" id="titre"
									name="titre" aria-describedby="sizing-addon1" required>
							</div>

							<div class="form-group">
								<label class="control-label" for="texte"> Texte</label>
								<textarea name="texte" rows="10" cols="50">Vous pouvez écrire quelque chose ici.
							</textarea>
							</div>


							<div class="form-group">
								<label class="control-label" for="image"> Inserez une
									image</label> <input type="img" class="form-control" id="img"
									name="img" aria-describedby="sizing-addon1">
							</div>

							<div class="form-group">
								<label class="control-label" for="date"> Date de
									l'article</label> <input type="date" class="form-control" id="date"
									name="date" aria-describedby="sizing-addon1" required>
							</div>








							<div align="right">
								<b> Ajouter article</b> <input type="submit" value="Ajout">
							</div>

						</div>
					</form>
				</div>




			</div>
		</div>
	</div>
</div>

</main>
</div>


</body>
</html>