<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Portal Seguraco</title>
	<script>
		function gologin(){
			alert("No ha iniciado session");
			window.location = "login.html";
		}

	</script>
</head>
<body>
	<?php

		session_start();

		if (isset($_SESSION["usuario"])) {
			echo "Bienvenido usuario: ".$_SESSION["usuario"]."<br>";
			echo "<a href = 'logout.php'>logout</a>";
		}
		else{

			echo "<script>gologin()</script>";

		}


	?>
</body>
</html>>