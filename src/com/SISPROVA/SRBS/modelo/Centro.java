/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.modelo;
    



public class Centro {
    
    
    private String nombre;
    private String abreviatura;
    private String descripcion;
    private int idcomplejo;

    public Centro(String nombre, String abreviatura, String descripcion, int idcomplejo) {
        
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.descripcion = descripcion;
        this.idcomplejo = idcomplejo;
    }

    public Centro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdcomplejo() {
        return idcomplejo;
    }

    public void setIdcomplejo(int idcomplejo) {
        this.idcomplejo = idcomplejo;
    }
    
    
    
            
    
}
