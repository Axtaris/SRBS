/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.modelo;

/**
 *
 * @author Penagos
 */
public class Vehiculo {
    private int id;
    private String matricula;
    private int idmarca;
    private int idcolor;
    private int idtipo_vehiculo;
    private int idestado;
    private int idusuario;

    public Vehiculo(String matricula, int idmarca, int idcolor, int idtipo_vehiculo, int idestado, int idusuario) {
        this.matricula = matricula;
        this.idmarca = idmarca;
        this.idcolor = idcolor;
        this.idtipo_vehiculo = idtipo_vehiculo;
        this.idestado = idestado;
        this.idusuario = idusuario;
    }

    
    
    public Vehiculo( String matricula, int idmarca, int idcolor, int idestado, int idusuario) {
    
        this.matricula = matricula;
        this.idmarca = idmarca;
        this.idcolor = idcolor;
        this.idestado = idestado;
        this.idusuario = idusuario;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

  

    public int getIdcolor() {
        return idcolor;
    }

    public void setIdcolor(int idcolor) {
        this.idcolor = idcolor;
    }

    public int getIdtipo_vehiculo() {
        return idtipo_vehiculo;
    }

    public void setIdtipo_vehiculo(int idtipo_vehiculo) {
        this.idtipo_vehiculo = idtipo_vehiculo;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    
}
