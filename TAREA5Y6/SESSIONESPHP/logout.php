<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Cerrar session</title>
	<script>
		function cerrar(){
			alert("Vuelva pronto :D, Adios!");
			window.location = "login.html";
		}

	</script>>
</head>
<body>
	<?php

		session_start();

		unset($_SESSION["usuario"]);

		echo "<script>cerrar()</script>";

	?>
</body>
</html>