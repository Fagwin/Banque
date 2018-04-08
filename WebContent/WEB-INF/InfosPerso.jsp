<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html >
<html>
<%@include file="/WEB-INF/header_actuFr.jsp"%>


<div class="infoperso">
	<form class="form horizontal " method="POST"
		action="/FormulaireModifInfoPerso">
		<div>
			<br> <br> <br> <br>
			<div class="K0zRed">
				<div class="yzO83e ">
					<div class="K9yn1e"></div>
					<div class="JsdkBf">
						<div class="dLswc">
							<div class="cCS6xc">
								<h5 class="rdUUMc">A propos de moi</h5>
							</div>
							<div class="oJFOKe">
								<div class="X6ABof">${nom}</div>
								<div class="X6ABof">${prenom}</div>
								<div class="X6ABof">${profess}</div>

							</div>
						</div>

					</div>
				</div>
			</div>
			<br>
			<div class="K0zRed">
				<div class="yzO83e ">
					<div class="K9yn1e"></div>
					<div class="JsdkBf">
						<div class="dLswc">
							<div class="cCS6xc">
								<h5 class="rdUUMc">Adresse</h5>
							</div>
							<div class="oJFOKe">
								<div class="X6ABof">${adresse}</div>
								<div class="X6ABof">${natio}</div>
								<div class="X6ABof">${commune}</div>
								<div class="X6ABof">${pays}</div>

							</div>
						</div>

					</div>
				</div>
			</div>
			<br>
			<div class="K0zRed">
				<div class="yzO83e ">
					<div class="K9yn1e"></div>
					<div class="JsdkBf">
						<div class="dLswc">
							<div class="cCS6xc">
								<h5 class="rdUUMc">Adresses e-mail</h5>
							</div>
							<div class="oJFOKe">
								<div class="X6ABof">${email}</div>

							</div>
						</div>

					</div>
				</div>
			</div>
			<br>
			<div class="K0zRed">
				<div class="yzO83e ">
					<div class="JsdkBf">
						<div class="dLswc">
							<div class="cCS6xc">
								<h5 class="rdUUMc">Téléphone</h5>
							</div>
							<div class="oJFOKe">
								<div class="QFArGe">
									<div aria-label="Numéro de téléphone"></div>
									<div class="xm9RIe">${tel}</div>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
			<br>
			<div class="K0zRed">
				<div class="yzO83e ">
					<div class="K9yn1e"></div>
					<div class="JsdkBf">
						<div class="dLswc">
							<div class="cCS6xc">
								<h5 class="rdUUMc">Anniversaire</h5>
							</div>
							<div class="oJFOKe">${anniv}</div>
						</div>

					</div>
				</div>
			</div>
			<br>
			<div class="K0zRed">
				<div class="yzO83e ">
					<div class="K9yn1e"></div>
					<div class="JsdkBf">
						<div class="dLswc">
							<div class="cCS6xc">
								<h5 class="rdUUMc">Sexe</h5>
							</div>
							<div class="oJFOKe">${sexe}</div>
						</div>

					</div>
				</div>
			</div>
			<br>
			
			<div class="K0zRed">
				<div class="yzO83e ">
					<div class="K9yn1e"></div>
					<div class="JsdkBf">
						<div class="dLswc">
							<div class="cCS6xc">
								<h5 class="rdUUMc">Mes informations bancaire</h5>
							</div>
							<div class="oJFOKe">Voir mes informations bancaires</div>
						</div>

					</div>
				</div>
			</div>

			<br> <br>

			<div>
				<input type="submit" value="Modifier">

			</div>


		</div>
	</form>
</div>


</body>
</html>