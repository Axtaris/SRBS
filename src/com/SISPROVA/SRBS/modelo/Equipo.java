
package com.SISPROVA.SRBS.modelo;


public class Equipo {
    
    private String nombre;
    private String descripcion;
    private String color;
    private int idEquipo;
    private int idUsuario;
    private int idEstado;

    public Equipo( String nombre, String descripcion, String color, int idEquipo, int idUsuario, int idEstado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.idEquipo = idEquipo;
        this.idUsuario = idUsuario;
        this.idEstado = idEstado;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    
    
    
    
    
    
}
