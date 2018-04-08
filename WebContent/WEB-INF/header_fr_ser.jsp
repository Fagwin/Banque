<%@ page pageEncoding="UTF-8"%>

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap-theme.min.css"></script>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.0/css/mdb.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.0/css/mdb.min.css"
	rel="stylesheet">

<style type="text/css">
<%@ include file="/WEB-INF/style.css"%>
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body>


	<%-- <div class="fond">
    	<p> Bienvenu(e) dans votre banque</p>
 	</div>
 --%>
	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		<a class="navbar-brand" href="/accueil.jsp">BANQUE EN LIGNE </a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">

				<li class="nav-item"><a class="nav-link" href="#">ACCUEIL</a></li>
				<li class="nav-item active"><a class="nav-link" href="/Banque/fr/Service">NOS
						SERVICES</a><span
						class="sr-only">(current)</span></li>
				<li class="nav-item"><a class="nav-link"
					href="/Banque/fr/Actualite">NOS ACTUALITES</a></li>
				<li class="nav-item"><a class="nav-link" href="#">NOUS
						CONTACTER</a></li>

			</ul>

			<ul class="nav navbar-nav navbar-right">
				<li class="nav-item"><a class="nav-link" href="/Banque/fr/authentification">Déjà inscrit? </a></li>
				<li class="nav-item"><a class="nav-link" href="/Banque/en">EN</a></li>

			</ul>

		</div>
	</nav>