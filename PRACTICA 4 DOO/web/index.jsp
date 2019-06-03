<%-- 
    Document   : index
    Created on : 17/04/2019, 07:19:37 PM
    Author     : Miguee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>formulario</h1>
        <form action="procesar.do" method = "post">
            Nombre: <input type="text" name ="txtNombre"/> <br />
            Edad: <input type="text" name ="txtEdad" /> <br />
            Correo: <input type="text" name="txtCorreo"/> <br />
            Contraseña<input type="password" name="txtPassword"/><br />
            <input type ="submit" value="Enviar Datos">
        </form>
    </body>
</html>
