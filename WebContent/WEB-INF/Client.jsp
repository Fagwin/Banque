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
				      <th style="font-size: 20px;">Connectez-vous!</th>
				    </tr>
				  </thead>
				 </table>

				 <div class="panel-body">
				     <form  action="/Banque/fr/client" method="POST" class="formCompte">

									<div class="form-group form-row">
										<label class="col-sm-4" for="email"> Email</label> 
										<input type="text" class="form-control col-sm-8"
											id="email" name="email"aria-describedby="sizing-addon1" value="" required>
									</div>
									
									<div class="form-group form-row">
										<label class="col-sm-4" for="mdp"> Mot de passe</label>
										 <input type="password" class="form-control col-sm-8"
											id="mdp" name="mdp" aria-describedby="sizing-addon1" value="" required>
									</div>


									<div align="right">
										<p> <button class="btn btn-info btn-rounded btn-lg" type="submit">Se connecter</button> </p>
									</div>
									
									
						</form>



					</div>
				</div>

			</div>

			</main>
			
	</body>
	</html>