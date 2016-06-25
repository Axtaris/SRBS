/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.controlador;

import com.SISPROVA.SRBS.conexion.Conexion;
import com.SISPROVA.SRBS.modelo.Centro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DIego
 */
public class ControladorCentro {
    final private Conexion con = new Conexion();
    
    public ResultSet nombre(){
        return con.consultar("SELECT abreviatura  FROM centro;");
    }
    
    public int retornarId(String centro){
        int id=0;
        ResultSet rsid;
        rsid = con.consultar("SELECT id FROM centro WHERE abreviatura='"+centro+"';");
        try {
            while(rsid.next()){
                id = rsid.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTipo_Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return id;
    }
    public ResultSet selecionar() {
            return con.consultar("select ce.id id,ce.nombre centros,ce.abreviatura abreviaturas,ce.descripcion descripcion,co.nombre complejos " +
                                  "FROM centro ce INNER JOIN complejo co " +
                                  "on ce.idcomplejo = co.id");
        }

        public ResultSet buscar(String src, String campo) {
            String tabla = "ce";
            switch (campo) {
                case "ID":
                    tabla = "ce";
                    campo = "ID";
                    break;
                case "NOMBRE":
                    tabla ="ce";
                    campo = "nombre";
                    break;
                case "ABREVIATURA":
                    tabla ="CE";
                    campo = "abreviatura";
                    break;
                case "DESCRIPCION":
                    tabla ="ce";
                    campo = "descripcion";
                    break;
                case "ID CENTRO":
                    tabla ="co";
                    campo = "idcomplejo";
                    break;
               
                
            }

            return con.consultar("select ce.id centros,ce.abreviatura abreviaturas,ce.descripcion descripcion,co.nombre\n" +
                                  "FROM centro ce INNER JOIN complejo co " +
                                  "on ce.idcomplejo = co.id "+
                                  "WHERE " + tabla + "." + campo + " LIKE '" + src + "%';");
        }

        public boolean insertarDatos(Centro obj) {
        
            String nombre = obj.getNombre();
            String abreviatura = obj.getAbreviatura();
            String descripcion = obj.getDescripcion();
            int idcomplejo = obj.getIdcomplejo();
           

            return con.ejecutar("INSERT INTO equipo  VALUES(null," + "'" + nombre + "'," + "'" + abreviatura + "'," + "'" + descripcion + "'," + "'" + idcomplejo + "')");
        }

        public boolean editar(int id, Centro obj) {
           
            String nombre = obj.getNombre();
            String abreviatura = obj.getAbreviatura();
            String descripcion = obj.getDescripcion();
            int idcomplejo = obj.getIdcomplejo();
     

            System.out.println("UPDATE usuario SET nombre = " + "'" + nombre + "';");
            return con.ejecutar("UPDATE usuario SET nombre = " + "'" + nombre + "',abreviatura = " + "'" + abreviatura + "',descripcion = " + "'" + descripcion + "',idcomplejo = " + "'" + idcomplejo + "' " + "WHERE id =" + id + ";");
        }

        public boolean eliminar(int id) {
            return con.ejecutar("DELETE FROM centro WHERE ID = " + id);
        }
}
