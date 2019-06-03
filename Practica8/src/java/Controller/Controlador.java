/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp1tb
 */
public class Controlador extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String variable = request.getParameter("varcontrol");
            if ("1".equals(variable)){
                String name = request.getParameter("name");
                String ap1 = request.getParameter("lastname1");
                String ap2 = request.getParameter("lastname2");
                String cumple = request.getParameter("brtdy");
                String correo = request.getParameter("mail");
                String pass = request.getParameter("pass");
                Registro r = new Registro();
                r.setName(name);
                r.setLastname1(ap1);
                r.setLastname2(ap2);
                r.setBrtdy(cumple);
                r.setMail(correo);
                r.setPass(pass);  
                String url = "jjdbc:derby://localhost:8080/DB1560020"; 
                int control = 0;
                String quer2 = "select * from ROOT.UNTITLED";
                String query = "INSERT INTO ROOT.UNTITLED (ID, NOMBRE, APELLIDOPAT, APELLIDOMAT, CUMPLE, CORREO, CONTRASEÑA)"; 
                try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con = DriverManager.getConnection(url,"root","root");
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(quer2);
                while(rs.next()) { 
                    int id = rs.getInt("ID");
                    if (id != 10){
                        control = control + 1;
                    } 
                }
                        stmt.executeUpdate(query + "VALUES ( "+ control + ",'" + r.getName() + "','" + ap1 +"', '"+ ap2 +"', '"+ cumple +"', '"+ correo +"', '"+ pass +"')");
                        
                                         
                
                }catch (SQLException e) { 
                        out.println("ERROR: " + e); 
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Controlador</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<fieldset><legend>Su Informacion:</legend><h1>Su nombre es: " + r.getName() + " " + r.getLastname1() + r.getLastname2()+ "</h1>");
                out.println("<h1>Su fecha de nacimiento es: " + r.getBrtdy()+ "</h1>");
                out.println("<h1>Su correo: " + r.getMail()+ "</h1>");
                out.println("<h1>Su password: " + r.getPass() + "</h1>");
                out.println("</fieldset><a href='Login.jsp'>Iniciar Session</a></body>");
                out.println("</html>");
            
            }else{
                
                String url = "jdbc:derby://localhost:1527/practica"; 
                String query = "select * from ROOT.UNTITLED"; 
                String corre = request.getParameter("correo");
                String contra = request.getParameter("contra");
                Validador v = new Validador();
                v.setPass(contra);
                v.setCorreo(corre);
                String nombre1 = null;
                try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con = DriverManager.getConnection(url,"root","root");
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(query);
                        
                while(rs.next()) { 
                    String vcorreo = rs.getString("CORREO");
                    String vpass = rs.getString("CONTRASEÑA");
                    String nombre = rs.getString("NOMBRE");
                    if (vcorreo.equals(corre) && vpass.equals(contra)){
                        v.setVcorreo(vcorreo);
                        v.setVpass(vpass);
                        nombre1= nombre;
                    }
                    } 
                }catch (SQLException e) { 
                        out.println("ERROR: " + e); 
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                v.validar();
                    if (v.getCheck()){
                        Cookie micookie = new Cookie("Login","Sucess");
                        micookie.setMaxAge(60*60*24);
                        out.println("Bienvenido " + nombre1);
                        out.println("<br>Cookie: <br>" );
                        out.println(micookie.getName() + ":" + micookie.getValue());
                        out.println("<br><a href='index.html'>Cerrar Session</a>");
                        micookie.setMaxAge(0);
                    } else { 
                        out.println("Correo o Contraseña Incorrecto" + " <br> <a href='Login.jsp'>Intentalo de nuevo</a>"); 
                    }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
    