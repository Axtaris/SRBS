/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.controlador;

import com.SISPROVA.SRBS.conexion.Conexion;
import com.SISPROVA.SRBS.modelo.Usuario;
import com.SISPROVA.SRBS.modelo.Vehiculo;
import java.sql.ResultSet;

/**
 *
 * @author Penagos
 */
public class ControladorVehiculo {
    final private Conexion con = new Conexion();
    
    public ResultSet selecionarVehiculo(){
        return con.consultar(   "SELECT veh.id,veh.matricula,mar.nombre,col.nombre as nombre_color,us.nombre usuario,us.apellido,us.numero_identidad,tu.nombre tipous,es.nombre estado "+
                                "FROM vehiculo veh "+
                                "INNER JOIN usuario us ON us.id = veh.idusuario "+
                                "INNER JOIN tipo_usuario tu ON us.idtipo_usuario = tu.id "+
                                "INNER JOIN estado es ON veh.idestado = es.id "+
                                "INNER JOIN marca mar ON mar.id = veh.idmarca "+
                                "INNER JOIN color col ON veh.idcolor = col.id;");
    }
    
    public ResultSet buscarVehiculo(String src, String campo){
        String tabla = "us";
        switch (campo) {
            case "ESTADO":
                tabla = "es";
                campo = "nombre";
                break;
            case "COLOR":
                tabla ="col";
                campo = "nombre";
                break;
            case "TIPO VEHICULO":
                tabla = "tipoveh";
                campo = "nombre";
                break;
            case "NOMBRE":
                tabla = "us";
                campo = "nombre";
                break;
            case "MARCA":
                tabla = "mar";
                campo = "nombre";
                break;
            case "USUARIO":
                tabla = "us";
                campo = "apellido";
                break;
        }     
       
        return con.consultar(   "SELECT veh.id,veh.matricula,mar.nombre,col.nombre as nombre_color,us.nombre,us.apellido,us.numero_identidad,tu.nombre tipous,es.nombre estado "+
                                "FROM vehiculo veh "+
                                "INNER JOIN usuario us ON us.id = veh.idusuario "+
                                "INNER JOIN tipo_usuario tu ON us.idtipo_usuario = tu.id "+
                                "INNER JOIN estado es ON veh.idestado = es.id "+
                                "INNER JOIN color col ON col.id = veh.idcolor "+
                                "INNER JOIN marca mar ON mar.id = veh.idmarca "+
                                "WHERE "+tabla+"."+campo+" LIKE '"+src+"%';");
    }
    
    public boolean insertarDatos(Vehiculo obj){
         int id=obj.getId();
         String matricula=obj.getMatricula();
         int idmarca=obj.getIdmarca();
         int idcolor=obj.getIdcolor();
         int idtipo_vehiculo=obj.getIdtipo_vehiculo();
         int idestado=obj.getIdestado();
         int idusuario=obj.getIdusuario();
        return con.ejecutar("INSERT INTO vehiculo VALUES(null,"+"'"+matricula+"',"+""+idtipo_vehiculo+","+""+idestado+","+""+idusuario+","+idmarca+","+idcolor+");");
    }
    
    public boolean editar(int id,Vehiculo obj){
         
         String matricula=obj.getMatricula();
         int idmarca=obj.getIdmarca();
         int idcolor=obj.getIdcolor();
         int idestado=obj.getIdestado();
         int idusuario=obj.getIdusuario();
       System.out.println("UPDATE vehiculo SET matricula ="+"'"+matricula+"', idmarca ="+"'"+idmarca+"', idcolor ="+"'"+idcolor+"',idestado ="+"'"+idestado+"',idusuario ="+"'"+idusuario+"'  WHERE  id ="+id+";");
        return con.ejecutar("UPDATE vehiculo SET matricula ="+"'"+matricula+"', idmarca ="+""+idmarca+", idcolor ="+""+idcolor+",idestado ="+""+idestado+",idusuario ="+""+idusuario+"  WHERE  id ="+id+";");
    }
    
    public boolean eliminar(int id){
        return con.ejecutar("DELETE FROM vehiculo WHERE id = "+id);
    }
    
    public ResultSet traerVehiculos(int id){
        return con.consultar("SELECT veh.id as id,veh.matricula as vehiculo FROM vehiculo veh INNER JOIN usuario usu "
                + "ON veh.idusuario = usu.id "
                + "WHERE veh.idusuario="+id);
    }
}
