/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.controlador;

import com.SISPROVA.SRBS.conexion.Conexion;
import java.sql.ResultSet;

/**
 *
 * @author G40-80
 */
public class ControladorTipo_Equipo {
  

  
    final private Conexion con = new Conexion();
    
    public ResultSet nombre(){
        return con.consultar("SELECT tip.nombre  FROM tipo_equipo tip");
    
    }
    
}

    

