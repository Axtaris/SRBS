/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.controlador;

import com.SISPROVA.SRBS.conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Penagos
 */
public class ControladorColor {
    final private Conexion con = new Conexion();
    
    public ResultSet nombre(){
        return con.consultar("SELECT nombre as nombre_color  FROM color;");
    }
    
     public int idMarca(String src){
        ResultSet rs;
        int id=0;
         rs = con.consultar("SELECT id  FROM color WHERE nombre='"+src+"'");
         try {
             while(rs.next()){
                 id = rs.getInt("id");
             }
         } catch (SQLException ex) {
             Logger.getLogger(ControladorMarca.class.getName()).log(Level.SEVERE, null, ex);
         }
         return id;
    }
}
