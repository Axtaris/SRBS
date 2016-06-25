/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.vista.centro;

import com.SISPROVA.SRBS.controlador.ControladorCentro;
import com.SISPROVA.SRBS.controlador.ControladorComplejo;
import com.SISPROVA.SRBS.controlador.ControladorEstado;
import com.SISPROVA.SRBS.controlador.ControladorTipo_Equipo;
import com.SISPROVA.SRBS.controlador.ControladorUsuario;
import com.SISPROVA.SRBS.modelo.Centro;
import com.SISPROVA.SRBS.vista.usuario.Agregar_Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author G40-80
 */
public class Agregar_Centro extends javax.swing.JInternalFrame {
    
    ResultSet rscomplejo;
    /**
     * Creates new form Agregar_Centro
     */
    public Agregar_Centro() {
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

        jLabel4 = new javax.swing.JLabel();
        guardar_salir = new javax.swing.JButton();
        guardar_continuar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        abreviatura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        complejos = new javax.swing.JComboBox();
        cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("Abreviatura");
        jLabel4.setToolTipText("");

        guardar_salir.setText("Guargar y Salir");
        guardar_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_salirActionPerformed(evt);
            }
        });

        guardar_continuar.setText("Guardar y Continuar");
        guardar_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_continuarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.setToolTipText("");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Complejo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Centro");

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel5.setText("Descripción");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(complejos, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abreviatura, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(limpiar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(guardar_continuar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(guardar_salir)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cancelar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel6)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(abreviatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(complejos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(189, 189, 189)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(guardar_continuar)
                        .addComponent(guardar_salir)
                        .addComponent(cancelar)
                        .addComponent(limpiar))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_salirActionPerformed
        String nom = nombre.getText().toUpperCase();
        String abrev = abreviatura.getText().toUpperCase();
        String desc = descripcion.getText().toUpperCase();
        int com = complejos.getSelectedIndex()+1;
     

        Centro equi = new Centro( nom, abrev, desc, com);

        ControladorCentro control = new ControladorCentro();
        if(control.insertarDatos(equi))JOptionPane.showMessageDialog(this, "Registro Agregado Correctamente");
        this.dispose();
    }//GEN-LAST:event_guardar_salirActionPerformed

    private void guardar_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_continuarActionPerformed
        String nom = nombre.getText().toUpperCase();
        String abrev = abreviatura.getText().toUpperCase();
        String desc = descripcion.getText().toUpperCase();
        int com = complejos.getSelectedIndex()+1;

        Centro equi = new Centro(nom, desc, abrev, com );

        ControladorCentro cen = new ControladorCentro();

        if(cen.insertarDatos(equi))JOptionPane.showMessageDialog(this, "Registro Agregado Correctamente");

        Limpiar();
    }//GEN-LAST:event_guardar_continuarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

        private void llenarComboBox(){
       ControladorComplejo comp = new ControladorComplejo();
        rscomplejo = comp.nombre();
        
        try {
            while(rscomplejo.next()){
                complejos.addItem(rscomplejo.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Centro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void Limpiar(){
        

        nombre.setText("");
        abreviatura.setText("");
        descripcion.setText("");
        complejos.setSelectedIndex(0);        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abreviatura;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox complejos;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton guardar_continuar;
    private javax.swing.JButton guardar_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}