/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.conexion;

import static com.SISPROVA.SRBS.conexion.Configuracion.CONNECTION_URL;
import static com.SISPROVA.SRBS.conexion.Configuracion.DRIVER;
import static com.SISPROVA.SRBS.conexion.Configuracion.PASSWORD;
import static com.SISPROVA.SRBS.conexion.Configuracion.USERNAME;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author DIego
 */
public class ComprovarConexion extends Thread implements Configuracion {

    private Conexion con;
    private JLabel label;

    public ComprovarConexion(Conexion con, JLabel label) {
        this.con = con;
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (conprovar() != null) {
                    label.setText("Conectado");
                } else {
                    label.setText("Imposible Conectar");
                }
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ComprovarConexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Connection conprovar() {
        return Conexion.getConnection();
    }

}
