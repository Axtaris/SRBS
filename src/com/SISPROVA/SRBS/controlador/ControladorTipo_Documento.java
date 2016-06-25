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
 * @author DIego
 */
public class ControladorTipo_Documento {
    final private Conexion con = new Conexion();
    
    public ResultSet nombre(){
        return con.consultar("SELECT td.abreviatura FROM tipo_documento td");
    }
    
    public int retornarId(String abreviatura){
        int id=0;
        ResultSet rsid;
        System.out.println("SELECT id FROM tipo_documento WHERE abreviatura='"+abreviatura+"';");
        rsid = con.consultar("SELECT id FROM tipo_documento WHERE abreviatura='"+abreviatura+"'");
        try {
            while(rsid.next()){
                id = rsid.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTipo_Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return id;
    }
}
