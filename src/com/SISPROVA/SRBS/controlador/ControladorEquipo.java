/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.controlador;

import com.SISPROVA.SRBS.conexion.Conexion;
import com.SISPROVA.SRBS.modelo.Equipo;
import java.sql.ResultSet;

/**
 *
 * @author Penagos
 */
public class ControladorEquipo {
    final private Conexion con = new Conexion();
    
    public ResultSet traerEquipos(int id){
        return con.consultar("SELECT eq.id as id,eq.nombre as equipo FROM equipo eq INNER JOIN usuario usu "
                + "ON eq.idusuario = usu.id "
                + "WHERE eq.idusuario="+id);
    }
    public ResultSet selecionar() {
            return con.consultar("SELECT eq.id,eq.nombre,eq.descripcion,eq.idcolor color,tip.nombre,us.nombre,es.nombre " +
                                    "FROM equipo eq INNER JOIN tipo_equipo tip " +
                                    "ON eq.idtipo_equipo =  tip.id " +
                                    "INNER JOIN usuario us " +
                                    "ON eq.idusuario = us.id " +
                                    "INNER JOIN estado es " +
                                    "ON eq.idestado = es.id");
        }

        public ResultSet buscar(String src, String campo) {
            String tabla = "eq";
            switch (campo) {
                case "ID":
                    tabla = "eq";
                    campo = "id";
                    break;
                case "NOMBRE":
                    tabla = "eq";
                    campo = "id";
                    break;
                
                case "TIPO_EQUIPO":
                    tabla = "tip";
                    campo = "nombre";
                    break;
                case "ID_USUARIO":
                    tabla ="us";
                    campo = "numero_identidad";
                    break;
                case "ID_ESTADO":
                    tabla = "es";
                    campo = "nombre";
                    break;
                
            }

            return con.consultar("SELECT eq.id,eq.nombre,eq.descripcion,eq.color,td.idtipo_equipo,us.idusuario,es.idestado "
                    + "FROM equipo equ "
                    + "INNER JOIN tipo_equipo tip ON equ.idtipo_equipo = tip.id "
                    +"INNER JOIN usuario us ON equ.idusuario = us.id"
                    + "INNER JOIN estado es ON equ.idestado = es.id"
                    + "WHERE " + tabla + "." + campo + " LIKE '" + src + "%';");
        }

        public boolean insertarDatos(Equipo obj) {
        
            String nombre = obj.getNombre();
            String descripcion = obj.getDescripcion();
            String color = obj.getColor();
            int idtipoEquipo = obj.getIdEquipo();
            int idUsuario = obj.getIdUsuario();
            int idEstado = obj.getIdEstado();

            return con.ejecutar("INSERT INTO equipo  VALUES(null," + "'" + nombre + "'," + "'" + descripcion + "'," + "'" + color + "'," + "'" + idtipoEquipo + "'," + "'" + idUsuario + "'," + "'" + idEstado + "')");
        }

        public boolean editar(int id, Equipo obj) {
           
            String nombre = obj.getNombre();
            String descripcion = obj.getDescripcion();
            String color = obj.getColor();
            int idtipoEquipo = obj.getIdEquipo();
            int idUsuario = obj.getIdUsuario();
            int idEstado = obj.getIdEstado();

            System.out.println("UPDATE usuario SET nombre = " + "'" + nombre + "';");
            return con.ejecutar("UPDATE usuario SET nombre = " + "'" + nombre + "',descripcion = " + "'" + descripcion + "',color = " + "'" + color + "',idtipo_equipo = " + "'" + idtipoEquipo + "',idusuario = " + "'" + idUsuario + "',idestado = " + "'" + idEstado + "'WHERE id =" + id + ";");
        }

        public boolean eliminar(int id) {
            return con.ejecutar("DELETE FROM equipo WHERE ID = " + id);
        }
}
