/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.vista.ingreso_salida;
import com.SISPROVA.SRBS.controlador.ControladorCentro;
import com.SISPROVA.SRBS.controlador.ControladorIngreso_Salida;
import com.SISPROVA.SRBS.controlador.ControladorColor;
import com.SISPROVA.SRBS.controlador.ControladorEstado;
import com.SISPROVA.SRBS.controlador.ControladorTipo_Documento;
import com.SISPROVA.SRBS.controlador.ControladorTipo_Usuario;
import com.SISPROVA.SRBS.controlador.ControladorUsuario;
import com.SISPROVA.SRBS.controlador.ControladorVehiculo;
import com.SISPROVA.SRBS.modelo.Usuario;
import com.SISPROVA.SRBS.vista.MainVista;
import com.SISPROVA.SRBS.vista.usuario.Vista_Usuario;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Penagos
 */
public class Vista_Ingreso_Salida extends javax.swing.JInternalFrame {

    JTable tabla;
    ResultSet rsingresos;
    DefaultTableModel dfm;
    public Vista_Ingreso_Salida() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DOCUMENTO", "NOMBRE", "APELLIDO", "ENTRADA", "OPERARIO ENTRADA", "SALIDA", "OPERARIO SALIDA"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SISPROVA/SRBS/recursos/ic_add_circle_black_48dp.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SISPROVA/SRBS/recursos/ic_create_black_48dp.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SISPROVA/SRBS/recursos/ic_clear_black_48dp.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SISPROVA/SRBS/recursos/ic_loop_black_48dp.png"))); // NOI18N
        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por...");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USUARIO", "INGRESOS", "SALIDA", "OPERADOR ENTRADA", "OPERADOR SALIDA" }));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SISPROVA/SRBS/recursos/ic_search_black_18dp.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        reiniciarJTable(tabla);
        llenarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel tm = (DefaultTableModel) tabla.getModel();
        int id = Integer.parseInt(String.valueOf(tm.getValueAt(tabla.getSelectedRow(),0)));
        if(id != 0){
            int res = JOptionPane.showConfirmDialog(this, "Esta Seguro de Eliminar este Registro?");
            if(JOptionPane.YES_OPTION == res){
               ControladorIngreso_Salida control = new ControladorIngreso_Salida();
               control.eliminar(id);
               reiniciarJTable(tabla);
               llenarTabla(); 
            }       
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        reiniciarJTable(tabla);
        buscar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Agregar_Ingreso_Salida vista = new Agregar_Ingreso_Salida();
       MainVista.escritorio.add(vista);
       vista.show();
    }//GEN-LAST:event_jButton1ActionPerformed

     public void llenarTabla(){
        tabla.setModel(dfm);
         
        dfm.setColumnIdentifiers(new Object[]{"ID","DOCUMENTO","NOMBRE","APELLIDO","ENTRADA","OPERARIO ENTRADA","SALIDA","OPERARIO SALIDA"});
        
        
        
        ControladorIngreso_Salida control = new ControladorIngreso_Salida();
        rsingresos = control.seleccionarIngresos();
        try {
            while(rsingresos.next()){
                dfm.addRow(new Object[]{rsingresos.getInt("id"),rsingresos.getString("numero_identidad"),rsingresos.getString("nombre"),rsingresos.getString("apellido"),rsingresos.getString("fecha_hora_ingreso"),rsingresos.getString("operador1"),rsingresos.getString("fecha_hora_salida"),rsingresos.getString("operador2")});
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
 
     
    }
     
      private static void reiniciarJTable(javax.swing.JTable Tabla){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
 
        TableColumnModel modCol = Tabla.getColumnModel();
        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
    }

      private void buscar(){
        String campo = (String)jComboBox1.getSelectedItem();
        String src = jTextField1.getText().toUpperCase();
        
        tabla.setModel(dfm);
         
        dfm.setColumnIdentifiers(new Object[]{"ID","DOCUMENTO","NOMBRE","APELLIDO","ENTRADA","OPERARIO ENTRADA","SALIDA","OPERARIO SALIDA"});
        
        
        
        ControladorIngreso_Salida control = new ControladorIngreso_Salida();
        rsingresos = control.buscarIngresos(src, campo);
        try {
            while(rsingresos.next()){
                dfm.addRow(new Object[]{rsingresos.getInt("id"),rsingresos.getString("numero_identidad"),rsingresos.getString("nombre"),rsingresos.getString("apellido"),rsingresos.getString("fecha_hora_ingreso"),rsingresos.getString("operador1"),rsingresos.getString("fecha_hora_salida"),rsingresos.getString("operador2")});
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
