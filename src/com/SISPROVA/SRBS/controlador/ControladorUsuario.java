/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.controlador;
import com.SISPROVA.SRBS.conexion.Conexion;
import com.SISPROVA.SRBS.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DIego
 */
public class ControladorUsuario {
    final private Conexion con = new Conexion();
    
    public ResultSet nombre(){
        return con.consultar("SELECT us.nombre  FROM usuario us");
    
    }
    
    public ResultSet selecionar(){
        return con.consultar(   "SELECT us.id,us.nombre,us.apellido,us.numero_identidad,td.abreviatura,us.NombreUsuario,tu.nombre tipous,ce.abreviatura centro,es.nombre estado "+
                                "FROM usuario us "+
                                "INNER JOIN centro ce ON us.idcentro = ce.id "+
                                "INNER JOIN tipo_usuario tu ON us.idtipo_usuario = tu.id "+
                                "INNER JOIN estado es ON us.idestado = es.id "+
                                "INNER JOIN tipo_documento td ON us.idtipo_documento = td.id;");
    }
    
    public ResultSet buscar(String src, String campo){
        String tabla = "us";
        switch (campo) {
            case "ESTADO":
                tabla = "es";
                campo = "nombre";
                break;
            case "DOCUMENTO":
                campo = "numero_identidad";
                break;
            case "USUARIO":
                campo = "login";
                break;
            case "CENTRO":
                tabla = "ce";
                campo = "abreviatura";
                break;
            case "ROL":
                tabla = "tu";
                campo = "nombre";
                break;
        }     
       
        return con.consultar(   "SELECT us.id,us.nombre,us.apellido,us.numero_identidad,td.abreviatura,us.NombreUsuario,tu.nombre tipous,ce.abreviatura centro,es.nombre estado "+
                                "FROM usuario us "+
                                "INNER JOIN centro ce ON us.idcentro = ce.id "+
                                "INNER JOIN tipo_usuario tu ON us.idtipo_usuario = tu.id "+
                                "INNER JOIN estado es ON us.idestado = es.id "+
                                "INNER JOIN tipo_documento td ON us.idtipo_documento = td.id "+
                                "WHERE "+tabla+"."+campo+" LIKE '"+src+"%';");
    }
    
    public boolean insertarDatos(Usuario obj){
        String nombre = obj.getNombre();
        String apellido = obj.getApellido();
        String documento = obj.getDocumento();
        String usuario = obj.getUsuario();
        String pass = obj.getPass();
        int centro = obj.getIdcentro();
        int tipousuario = obj.getIdtipo_usuario();
        int tipodocumento = obj.getIdtipo_documento();
        int estado = obj.getIdestado();
        return con.ejecutar("INSERT INTO usuario VALUES(null,"+"'"+nombre+"',"+"'"+apellido+"',"+"'"+documento+"',"+"null,"+"null,"+"'"+usuario+"',"+"'"+pass+"',"+""+centro+","+""+tipousuario+","+""+estado+","+""+tipodocumento+""+");");
    }
    
    public boolean editar(int id,Usuario obj){
        String nombre = obj.getNombre();
        String apellido = obj.getApellido();
        String documento = obj.getDocumento();
        String usuario = obj.getUsuario();
        String pass = obj.getPass();
        int centro = obj.getIdcentro();
        int tipousuario = obj.getIdtipo_usuario();
        int tipodocumento = obj.getIdtipo_documento();
        int estado = obj.getIdestado();
        System.out.println("UPDATE usuario SET nombre = "+"'"+nombre+"', apellido ="+"'"+apellido+"',idtipo_documento ="+"'"+tipodocumento+"', numero_identidad ="+"'"+documento+"',NombreUsuario ="+"'"+usuario+"',idcentro ="+"'"+centro+"',idtipo_usuario ="+"'"+tipousuario+"',idestado ="+"'"+estado+"' WHERE id ="+id+";");
        return con.ejecutar("UPDATE usuario SET nombre = "+"'"+nombre+"', apellido ="+"'"+apellido+"',idtipo_documento ="+"'"+tipodocumento+"', numero_identidad ="+"'"+documento+"',NombreUsuario ="+"'"+usuario+"',idcentro ="+"'"+centro+"',idtipo_usuario ="+"'"+tipousuario+"',idestado ="+"'"+estado+"' WHERE id ="+id+";");
    }
    
    public boolean eliminar(int id){
        return con.ejecutar("DELETE FROM usuario WHERE ID = "+id);
    }
    
    public ResultSet nombreusuario(){
        return con.consultar("SELECT nombre, apellido FROM usuario");
    }
    
    
    
    public int obtenerId(String nombre){
         ResultSet rsid;
         int id=0;
         rsid = con.consultar("SELECT id FROM usuario WHERE nombre="+"'"+nombre+"'");
        try {
            while(rsid.next()){
                id=rsid.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;   
    }
    
     public int obtenerId2(String nombre,String apellido){
         ResultSet rsid;
         int id=0;
         rsid = con.consultar("SELECT id FROM usuario WHERE nombre="+"'"+nombre+"' AND apellido='"+apellido+"'");
        try {
            while(rsid.next()){
                id=rsid.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;   
    }
     
     public int obtenerId3(String nombrecompleto){
         ResultSet rsid;
         int id=0;
         rsid = con.consultar("SELECT id FROM `usuario` WHERE CONCAT(nombre,' ',apellido)='"+nombrecompleto+"';");
        try {
            while(rsid.next()){
                id=rsid.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;   
    }
     
}
