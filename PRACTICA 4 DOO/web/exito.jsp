<%-- 
    Document   : exito
    Created on : 17/04/2019, 07:45:26 PM
    Author     : Miguee
--%>
<%@page import="Modelo.Persona"%>
<% 

    Persona p1 = (Persona)request.getSession().getAttribute("personal");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos recibidos exitosamente</h1>
        
        <p>Nombre: <%= p1.getNombre()%> </p>
        <p>Edad: <%= p1.getEdad()%></p>
        <p>Correo: <%= p1.getCorreo()%> </p>
        <p>Contraseña: <%=p1.getContraseña()%> </p>
    </body>
</html>
