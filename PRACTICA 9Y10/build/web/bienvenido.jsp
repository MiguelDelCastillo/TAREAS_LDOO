<%@page import="Modelo.LoginDTO"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%
    LoginDTO userHome = (LoginDTO)session.getAttribute("user");
%>
<html>
    <head>
        <title> Bienvenido</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="styles.css"/>
    </head>
    <body>
        <section class ="cabeza">
            <header>
                <nav>
                    <ul>
                        <li><a href="bienvenido.jsp"> Inicio </a></li>                        
                        <li><a href="index.html"> Cerrar Sesion </a></li>
                    </ul>
                </nav>
            </header>
        </section>
        <section class="contenido">
            <h1>Bienvenido <%= userHome.getUserd() %></h1>
            
            <br>
            
        </section>        
        <section class="footer">
            <p> Bienvenido, aqui encontraras breves ilustraciones de las profesiones <P>
            <br> <img src="archer2.png" alt=""/>
           <br> <img src="espada.png" alt=""/>
            
          <br> <img src="sorcerer.gif" alt=""/><br><br>
          
        </section>    
    </body>
</html>
