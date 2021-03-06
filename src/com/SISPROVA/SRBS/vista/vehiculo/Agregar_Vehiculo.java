/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.vista.vehiculo;

import com.SISPROVA.SRBS.controlador.ControladorCentro;
import com.SISPROVA.SRBS.controlador.ControladorColor;
import com.SISPROVA.SRBS.controlador.ControladorMarca;
import com.SISPROVA.SRBS.controlador.ControladorTipo_Documento;
import com.SISPROVA.SRBS.controlador.ControladorTipo_Usuario;
import com.SISPROVA.SRBS.controlador.ControladorTipo_Vehiculo;
import com.SISPROVA.SRBS.controlador.ControladorUsuario;
import com.SISPROVA.SRBS.controlador.ControladorVehiculo;
import com.SISPROVA.SRBS.modelo.Usuario;
import com.SISPROVA.SRBS.modelo.Vehiculo;
import com.SISPROVA.SRBS.vista.usuario.Agregar_Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Penagos
 */
public class Agregar_Vehiculo extends javax.swing.JInternalFrame {
    ResultSet rscolor;
    ResultSet rsusuario;
    ResultSet rstipovehiculo;
    ResultSet rsmarca;
    /**
     * Creates new form Agregar_Vehiculo
     */
    public Agregar_Vehiculo() {
        initComponents();
         llenarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<String>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Vehiculo");

        jLabel2.setText("Matricula:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Color:");

        jLabel5.setText("Tipo Vehiculo:");

        jLabel6.setText("Usuario:");

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar y Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar y Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, 0, 189, Short.MAX_VALUE)
                                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String matricula = jTextField1.getText().toUpperCase();
        int marca = jComboBox4.getSelectedIndex()+1;
        int color = jComboBox1.getSelectedIndex()+1;
        int tipovehiculo = jComboBox2.getSelectedIndex()+1;
        int dueño = jComboBox3.getSelectedIndex()+1;
        System.out.println(dueño);
        System.out.println(tipovehiculo);
        System.out.println(color);
        System.out.println("ENTROOO");
        Vehiculo vehiculo = new Vehiculo( matricula,  marca,  color,  tipovehiculo,  1,  dueño);
        
        ControladorVehiculo control = new ControladorVehiculo();
        if(control.insertarDatos(vehiculo))JOptionPane.showMessageDialog(this, "Registro Agregado Correctamente");
        
        limpiar();
                                            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String matricula = jTextField1.getText().toUpperCase();
        int idmarca = jComboBox4.getSelectedIndex()+1;
        int color = jComboBox1.getSelectedIndex()+1;
        int tipovehiculo = jComboBox2.getSelectedIndex()+1;
        String dueño =(String) jComboBox3.getSelectedItem();
        ControladorUsuario us = new ControladorUsuario();
        int due = us.obtenerId(dueño);
        Vehiculo vehiculo = new Vehiculo( matricula,  idmarca,  color,  tipovehiculo,  1,  due);
        
        ControladorVehiculo control = new ControladorVehiculo();
        if(control.insertarDatos(vehiculo))JOptionPane.showMessageDialog(this, "Registro Agregado Correctamente");
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
 public void limpiar(){
        jTextField1.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
    }

 private void llenarComboBox(){
        ControladorColor ccolor = new ControladorColor();
        rscolor = ccolor.nombre();
        
        ControladorUsuario user = new ControladorUsuario();
        rsusuario = user.nombreusuario();
        
        ControladorTipo_Vehiculo tipoveh = new ControladorTipo_Vehiculo();
        rstipovehiculo = tipoveh.nombre();
        
        ControladorMarca marca = new ControladorMarca();
        rsmarca = marca.nombre();
        try {
            while(rscolor.next()){
                jComboBox1.addItem(rscolor.getString("nombre_color"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            while(rstipovehiculo.next()){
                jComboBox2.addItem(rstipovehiculo.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {              
            while(rsusuario.next()){
                jComboBox3.addItem(rsusuario.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {              
            while(rsmarca.next()){
                jComboBox4.addItem(rsmarca.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
