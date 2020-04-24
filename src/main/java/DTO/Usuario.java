/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;

/**
 *
 * @author stive
 */
public class Usuario implements Serializable{
    
    private String usuario;
    private String clave;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;

    public Usuario() {
    }

    
    public Usuario(String usuario, String clave, String nombre, String direccion, String telefono, String correo) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usario) {
        this.usuario = usario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}

