<%-- 
    Document   : Registrarse
    Created on : 7/11/2018, 01:36:50 AM
    Author     : AA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        <title>Registrarse</title>
    </head>
    <body>
        <section class ="cabeza">
            <header>
                <nav>
                    <ul>
                        <li><a href="bienvenido.jsp"> Home </a></li>                        
                        <li><a href="index.html"> Cerrar Sesion </a></li>
                    </ul>
                </nav>
            </header>
        </section>
        <section class="contenido">
            <h2>Datos nuevo usuario</h2> <br>
            
            <form action="LoginControlador" method="post">
                <section class="Formulario">
                <label>Id Usuario:<input type="text" name="id_usuario" id="id_usuario"></label> <br>
                <label>Usuario:<input type="text" name="usuario" id="usuario"></label> <br>
                <label>Contraseña:<input type="text" name="password" id="password"></label> <br>
                <label>Correo: <input type="text" name="correo" id="correo"></label> <br>
                <label>Telefono: <input type="text" name="telefono" id="telefono"></label> <br>
                <input type="hidden" name="accion" value="Registrar">
                <br>
                <input type="submit" value="Registrate">
                </section>
                <br>
            </form>
        </section>
        <section class="footer">
            <img src="1bef251de00335ecac32024aba98185cfc609589_hq.jpg" alt=""/>
        </section>
    </body>
</html>