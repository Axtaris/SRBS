/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.controlador;

import com.SISPROVA.SRBS.conexion.Conexion;
import com.SISPROVA.SRBS.modelo.Ingreso_Salida;
import com.SISPROVA.SRBS.modelo.Usuario;
import java.sql.ResultSet;
/**
 *
 * @author Master
 */
public class ControladorIngreso_Salida {
    final private Conexion con = new Conexion();
    String tabla = "ingreso_salida";
    
    public ResultSet seleccionarOperadores(){
       return con.consultar("SELECT  operador.nombre nombre,operador.apellido apellido " +
                        "FROM ingreso_salida " +
                        "INNER JOIN usuario " +
                        "ON ingreso_salida.idusuario = usuario.id " +
                        "INNER JOIN usuario operador " +
                        "ON ingreso_salida.idoperadoringreso = operador.id " +
                        "INNER JOIN usuario operador2 " +
                        "ON ingreso_salida.idoperadorsalida = operador2.id;");
    }
    
    public ResultSet seleccionarIngresos(){
       return con.consultar("SELECT ingreso_salida.id,usuario.numero_identidad , usuario.nombre ,usuario.apellido, ingreso_salida.fecha_hora_ingreso, operador1.nombre operador1, " +
                        "ingreso_salida.fecha_hora_salida , operador2.nombre  operador2 " +
                        "FROM ingreso_salida " +
                        "INNER JOIN usuario " +
                        "ON ingreso_salida.idusuario = usuario.id " +
                        "INNER JOIN usuario operador1 " +
                        "ON ingreso_salida.idoperadoringreso = operador1.id " +
                        "INNER JOIN usuario operador2 " +
                        "ON ingreso_salida.idoperadorsalida = operador2.id;");
    }
    
    
    public ResultSet buscarIngresos(String src, String campo){   
        switch (campo) {
            case "USUARIO":
                tabla = "usuario";
                campo = "nombre";
                break;
            case "INGRESOS":
                tabla ="ingreso_salida";
                campo = "fecha_hora_ingreso";
                break;
            case "SALIDA":
               tabla ="ingreso_salida";
                campo = "fecha_hora_salida";
                break;
            case "OPERADOR ENTRADA":
                tabla = "operador1";
                campo = "nombre";
                break;
            case "OPERADOR SALIDA":
                tabla = "operador2";
                campo = "nombre";
                break;
            
        }     
       return con.consultar("SELECT ingreso_salida.id,usuario.numero_identidad , usuario.nombre ,usuario.apellido, ingreso_salida.fecha_hora_ingreso, operador1.nombre operador1, " +
                        "ingreso_salida.fecha_hora_salida , operador2.nombre  operador2 " +
                        "FROM ingreso_salida " +
                        "INNER JOIN usuario " +
                        "ON ingreso_salida.idusuario = usuario.id " +
                        "INNER JOIN usuario operador1 " +
                        "ON ingreso_salida.idoperadoringreso = operador1.id " +
                        "INNER JOIN usuario operador2 " +
                        "ON ingreso_salida.idoperadorsalida = operador2.id "+
                        "WHERE "+tabla+"."+campo+" LIKE '"+src+"%' "+
                        "OR YEAR(fecha_hora_ingreso)="+Integer.parseInt(src)+" "+
                        "OR MONTH(fecha_hora_ingreso)="+Integer.parseInt(src)+" "+
                        "OR DAY(fecha_hora_ingreso)="+Integer.parseInt(src)+" "+
                        "OR YEAR(fecha_hora_salida)="+Integer.parseInt(src)+" "+
                        "OR MONTH(fecha_hora_salida)="+Integer.parseInt(src)+" "+
                        "OR DAY(fecha_hora_salida)="+Integer.parseInt(src)+";");
    }
    
  
    
     public boolean eliminar(int id){
        return con.ejecutar("DELETE FROM ingreso_salida WHERE id = "+id);
    }
     
     public boolean registrarIngresos(Ingreso_Salida obj){
         String fechaing=obj.getFecha_hora_ingreso();
         int opein=obj.getOperadoringreso();
         int idequipo = obj.getIdequipo();
         int idvehiculo = obj.getIdvehiculo();
         int idusuario=obj.getIdusuario();
         int idoperadorentrada = obj.getOperadoringreso();
        
         return con.ejecutar("INSERT INTO ingreso_salida VALUES(null,'"+fechaing+"',null,"+idusuario+","+idequipo+","+idvehiculo+","+idoperadorentrada+",null)");
     }
     
     public ResultSet traerEquipos(int id){
         return con.consultar("SELECT id,nombre FROM equipo WHERE idusuario="+id+";");
     }
     
     
}
