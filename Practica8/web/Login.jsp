<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
    

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Practica 8: Login</title>
       
    </head>
    <body style="background-color:YELLOW;">
        <form action="Controlador" id="form" method="post" > 
            <fieldset>
                <legend>Login</legend>
                Correo:<br>
                <input size="50" type="text" name="correo">
                <br>
                Contraseña:<br>
                <input size="50" type="password" name="contra">
                <br>
                <br>
                <input type="submit" value="Entrar" > 
                
            </fieldset>
        </form>
    </body>
</html>