<%-- 
    Document   : index
    Created on : 9/03/2019, 05:40:07 PM
    Author     : Miguee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id = "cuadro">
            <form action = "NewServlet" method ="post">
                    <p id = "titulo"> REGISTRO </p>
                    <hr>
                    <br/><br/>
                    <label id = "subtitulo1"> Nombre de Usuario </label>
                    <br/><br/>
                    <input type = "text" class = "entrada" name = "UserName"/>
                    <br/><br/>
                    <label id = "correo"> Correo </label>
                    <br/><br/>
                    <input type = "text" class = "entrada2" name = "UserEmail"/>
                    <br/><br/>
                    <label id = "fechas"> Fecha de Nacimiento </label>
                    <br/><br/>
                    <label id = "fechas"> //Dia </label>
                    <label id = "fechas"> //Mes </label>
                    <label id = "fechas"> //Año </label>
                    <br/><br/>
                    <input type = "text" class = "dd" name = "UserDate"/>
                    <input type = "text" class = "dd" name = "UserMonth"/>
                    <input type = "text" class = "dd" name = "UserYear"/>
                    <br/><br/>
                    <label id = "subtitulo2"> Contraseña </label>
                    <br/><br/>
                    <input type = "password" class = "entrada3" name = "Userpass"/>
                    <br/><br/>
                    <input type = "submit" value = "Registro" id = "botom" />
            </form>
            </br>
            
        </div>
    </body>
</html>
