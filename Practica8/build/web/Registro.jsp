

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <title>Practica 8: Solicitud</title>
    </head>
    <body style="background-color:#00FFFF;">
        <div id="form">
            <form action="Controlador" id="form" method="post" > 
            <fieldset>
                <legend>Informacion Personal:</legend>
                Nombre:<br>
                <input size="50" type="text" name="name">
                <br>
                Primer Apellido:<br>
                <input size="50" type="text" name="lastname1">
                <br>
                Segundo Apellido:<br>
                <input size="50" type="text" name="lastname2">
                <br>
                Fecha de Nacimiento:<br>
                <input size="50" type="date" name="brtdy">
                <br>
                Correo:<br>
                <input size="50" type="email" name="mail">
                <br>
                Contraseña:<br>
                <input size="50" type="password" name="pass">
                <input size="50" type="hidden" name="varcontrol" value="1">
                <br>
                <br>
                <input type="submit" value="Registrar" > 
            </fieldset>
        </form>
      </div>
        <img src="1bef251de00335ecac32024aba98185cfc609589_hq.jpg" alt=""/>
    </body>
</html>

