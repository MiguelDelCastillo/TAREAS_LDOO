<!DOCTYPE html>

<head>
	<meta charset="utf-8">
	<title>Validar el usuario</title>
	<script> 
		function iraportal(){
			window.location="portal.php";


		}

	</script>>
</head>

		<?php

			session_start();

			$us = $_POST["txtUser"];
			$ps = $_POST["txtPass"];

			if ($us === 'admin' && $ps === "123"){

					$_SESSION["usuario"] = $us;
					echo "<script>iraportal()</script>";

			}
			else{
				echo "El usuario no existe <br>";
				echo "<a href ='login.html'>Voler a login mushasho</a>";
			}


		



