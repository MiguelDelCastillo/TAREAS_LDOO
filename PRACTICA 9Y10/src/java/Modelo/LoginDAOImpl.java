/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author osnap
 */
public class LoginDAOImpl implements LoginDAO{
    
    private Connection miConexion;
    
    private void abrirConexion() throws SQLException, InstantiationException, IllegalAccessException{
        try{
    Class.forName("DB1560020").newInstance();
    String dbURL ="jdbc:derby://localhost:1527/DB1560020";
    
    String username = "DB1560020";
    String password = "1560020";
    miConexion = DriverManager.getConnection(dbURL, username,password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    private void cerrarConexion() throws SQLException{
    miConexion.close();
    }

    @Override
    public boolean autenticar(LoginDTO user) {
        try {
            abrirConexion();
            PreparedStatement ps = miConexion.prepareStatement("Select * from users where nombre=? and password=?");
            ps.setString(1,user.getUsuario());
            ps.setString(2,user.getPassword());
            ResultSet rs=ps.executeQuery();
            cerrarConexion();
            return rs.next();
            
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(LoginDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void insertar(LoginDTO dtouser) {
        try{
            abrirConexion();
        String SQL = "insert into users values ("+ dtouser.getId_usuario()+",'"+ dtouser.getUsuario()+ "','"+ dtouser.getPassword()+"','"+ dtouser.getCorreo()+ "','"+dtouser.getTelefono()+"')";
            Statement stmt = miConexion.createStatement();
            stmt.executeUpdate(SQL);
            cerrarConexion();
        }catch(Exception e){
        e.printStackTrace();
        }
    }
}
