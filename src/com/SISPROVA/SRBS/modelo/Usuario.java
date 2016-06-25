/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.modelo;
/**
 *
 * @author DIego
 */
public class Usuario {
    
    private String nombre;
    private String Apellido;
    private String documento;
    private int idtipo_documento;
    private String usuario;
    private String pass;
    private int idcentro;
    private int idtipo_usuario;
    private int idestado;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, String Apellido, String documento, int idtipo_documento, String usuario, String pass, int idcentro, int idtipo_usuario, int idestado) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.documento = documento;
        this.idtipo_documento = idtipo_documento;
        this.usuario = usuario;
        this.pass = pass;
        this.idcentro = idcentro;
        this.idtipo_usuario = idtipo_usuario;
        this.idestado = idestado;
    }
    
     public Usuario(String nombre, String Apellido, String documento, int idtipo_documento, String usuario,  int idcentro, int idtipo_usuario, int idestado) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.documento = documento;
        this.idtipo_documento = idtipo_documento;
        this.usuario = usuario;
        this.idcentro = idcentro;
        this.idtipo_usuario = idtipo_usuario;
        this.idestado = idestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdtipo_documento() {
        return idtipo_documento;
    }

    public void setIdtipo_documento(int idtipo_documento) {
        this.idtipo_documento = idtipo_documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIdcentro() {
        return idcentro;
    }

    public void setIdcentro(int idcentro) {
        this.idcentro = idcentro;
    }

    public int getIdtipo_usuario() {
        return idtipo_usuario;
    }

    public void setIdtipo_usuario(int idtipo_usuario) {
        this.idtipo_usuario = idtipo_usuario;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }
    
    
    
}
