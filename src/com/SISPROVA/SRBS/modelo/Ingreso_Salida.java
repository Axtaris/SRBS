/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.modelo;

/**
 *
 * @author Master
 */
public class Ingreso_Salida {
    private int id;
    private String fecha_hora_ingreso;
    private String fecha_hora_salida;
    private int idusuario;
    private int idequipo;
    private int idvehiculo;
    private int operadoringreso;
    private int operadorsalida;

    public int getId() {
        return id;
    }

    public Ingreso_Salida(String fecha_hora_ingreso, int idusuario, int idequipo, int idvehiculo, int operadoringreso) {
        this.fecha_hora_ingreso = fecha_hora_ingreso;
        this.idusuario = idusuario;
        this.idequipo = idequipo;
        this.idvehiculo = idvehiculo;
        this.operadoringreso = operadoringreso;

    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_hora_ingreso() {
        return fecha_hora_ingreso;
    }

    public void setFecha_hora_ingreso(String fecha_hora_ingreso) {
        this.fecha_hora_ingreso = fecha_hora_ingreso;
    }

    public String getFecha_hora_salida() {
        return fecha_hora_salida;
    }

    public void setFecha_hora_salida(String fecha_hora_salida) {
        this.fecha_hora_salida = fecha_hora_salida;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }

    public int getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(int idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public int getOperadoringreso() {
        return operadoringreso;
    }

    public void setOperadoringreso(int operadoringreso) {
        this.operadoringreso = operadoringreso;
    }

    public int getOperadorsalida() {
        return operadorsalida;
    }

    public void setOperadorsalida(int operadorsalida) {
        this.operadorsalida = operadorsalida;
    }
    
    
}
