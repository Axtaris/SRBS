/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.vista.centro;

import com.SISPROVA.SRBS.controlador.ControladorCentro;
import com.SISPROVA.SRBS.controlador.ControladorComplejo;
import com.SISPROVA.SRBS.controlador.ControladorEquipo;
import com.SISPROVA.SRBS.controlador.ControladorEstado;
import com.SISPROVA.SRBS.controlador.ControladorTipo_Equipo;
import com.SISPROVA.SRBS.controlador.ControladorUsuario;
import com.SISPROVA.SRBS.modelo.Centro;
import com.SISPROVA.SRBS.vista.MainVista;
import com.SISPROVA.SRBS.vista.equipo.JComboBoxReloaded;
import com.SISPROVA.SRBS.vista.equipo.Vista_Equipo;
import com.SISPROVA.SRBS.vista.usuario.Vista_Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;




/**
 *
 * @author G40-80
 */
public class Vista_Centro extends javax.swing.JInternalFrame {
    JTable tabla;
    ResultSet rs;
    ResultSet rscomplejo;
    
    DefaultTableModel dfm;
    /**
     * Creates new form Vista_Centro
     */
    public Vista_Centro() {
        initComponents();
        dfm = new DefaultTableModel();
        tabla = this.jTable1;
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar Por:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "ID", "NOMBRE", "APELLIDO", "DOCUMENTO", "USUARIO", "CENTRO", "ROL", "ESTADO" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "ABREVIATURA", "DESCRIPCION", "COMPLEJO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SISPROVA/SRBS/recursos/ic_loop_black_48dp.png"))); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SISPROVA/SRBS/recursos/ic_add_circle_black_48dp.png"))); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SISPROVA/SRBS/recursos/ic_create_black_48dp.png"))); // NOI18N
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SISPROVA/SRBS/recursos/ic_clear_black_48dp.png"))); // NOI18N
        jButton4.setText("Eliminar");
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
                .addGap(1267, 1267, 1267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(230, 230, 230))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(517, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reiniciarJTable(tabla);
        llenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Agregar_Centro agregar = new Agregar_Centro();
        MainVista.escritorio.add(agregar);
        agregar.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel tm = (DefaultTableModel) tabla.getModel();
        int id = Integer.parseInt(String.valueOf(tm.getValueAt(tabla.getSelectedRow(), 0)));
        if (id != 0) {
            int res = JOptionPane.showConfirmDialog(this, "Esta Seguro de Editar este Usuario");
            if (JOptionPane.YES_OPTION == res) {
                String ids = String.valueOf(tm.getValueAt(tabla.getSelectedRow(), 1));
                String nombre = String.valueOf(tm.getValueAt(tabla.getSelectedRow(), 2));
                String abreviatura = String.valueOf(tm.getValueAt(tabla.getSelectedRow(), 3));
                String descripcion = String.valueOf(tm.getValueAt(tabla.getSelectedRow(), 4));
                String comp = String.valueOf(tm.getValueAt(tabla.getSelectedRow(), 5));
                

                Centro centro = new Centro(nombre);
                ControladorCentro control = new ControladorCentro();

                control.editar(id, centro);
                reiniciarJTable(tabla);
                llenarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel tm = (DefaultTableModel) tabla.getModel();
        int id = Integer.parseInt(String.valueOf(tm.getValueAt(tabla.getSelectedRow(), 0)));
        if (id != 0) {
            int res = JOptionPane.showConfirmDialog(this, "Esta Seguro de Eliminar este Equipo");
            if (JOptionPane.YES_OPTION == res) {
                ControladorUsuario control = new ControladorUsuario();
                control.eliminar(id);
                reiniciarJTable(tabla);
                llenarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        }
    }//GEN-LAST:event_jButton4ActionPerformed
 //BORRAR TABLA 
    private static void reiniciarJTable(javax.swing.JTable Tabla) {
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        TableColumnModel modCol = Tabla.getColumnModel();
        while (modCol.getColumnCount() > 0) {
            modCol.removeColumn(modCol.getColumn(0));
        }
    }

    //LLENAR TABLA
    private void llenarTabla() {
        tabla.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"ID", "NOMBRE", "DESCRIPCION", "COLOR", "TIPO", "USUARIO", "ESTADO"});

        ControladorCentro control = new ControladorCentro();
        rs = control.selecionar();
        ControladorComplejo comple  = new ControladorComplejo();
        rscomplejo = comple.nombre();
        
        TableColumn complej = tabla.getColumnModel().getColumn(4);
       

        JComboBoxReloaded combo1 = new JComboBoxReloaded();

        try {
            while (rscomplejo.next()) {
                combo1.addItem(rscomplejo.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Centro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        complej.setCellEditor(new DefaultCellEditor(combo1));
        
        try {
            while (rs.next()) {

                dfm.addRow(new Object[]{rs.getInt("id"), rs.getString("centros"), rs.getString("abreviaturas"), rs.getString("descripcion"), rs.getString(4)});
       
            }
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Centro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void buscar() {
        String campo = (String) jComboBox1.getSelectedItem();
        String src = jTextField1.getText().toUpperCase();

        tabla.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"ID", "NOMBRE", "ABREVIATURA", "DESCRIPCION", "COMPLEJO"});

        ControladorCentro control = new ControladorCentro();

        rs = control.buscar(src, campo);

        try {
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("id"), rs.getString("centro"), rs.getString("abreviaturas"), rs.getString("descripcion"), rs.getString("complejo")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Equipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
