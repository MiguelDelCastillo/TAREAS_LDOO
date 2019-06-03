/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author osnap
 */
public class LoginDTO {
    private int id_user;
    private String userd;
    private String password;
    private String correo;
    private String telefono;    


    /**
     * @return the usuario
     */
    public String getUserd() {
        return userd;
    }

    /**
     * @param userd the usuario to set
     */
    public void setUserd(String userd) {
        this.userd = userd;
    }

    /**
     * @return the id_usuario
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_usuario to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
