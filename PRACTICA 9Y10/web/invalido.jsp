<html>
    <head>
        <title>ERROR </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        <link rel="stylesheet" type="text/css" href="styles.css"/>
    </head>
    <body>
        <section class ="cabeza">
            <header>
                <nav>
                    <ul>
                        <li><a href="index.html"> Inicio </a></li>
                        <li><a href="#"> About </a></li>
                        <li><a href="login.jsp"> Registrar Usuario </a></li>
                    </ul>
                </nav>
            </header>
        </section>    
            <section class="login">
                <h2>Usuario o Password Incorrectos <br> Intentelo de nuevo</h2> <br>
            
            <form action="LoginControlador" method="post">
                <label>Usuario:<input type="text" name="usuario" id="usuario"></label> <br>
                <label>Contraseña:<input type="password" name="password" id="password"></label> <br>
                <input type="hidden"  name="accion" value="Entrar">
                <br>
                <input type="submit" value="Entrar">
                <br>
            </form>
        </section>
        <section class="footer">
            <img src="1bef251de00335ecac32024aba98185cfc609589_hq.jpg" alt=""/>
            
        </section>
    </body>
</html>

