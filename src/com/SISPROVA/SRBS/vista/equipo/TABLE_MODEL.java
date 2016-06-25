/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.vista.equipo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author G40-80
 */
public class TABLE_MODEL extends DefaultTableModel{
        public static final String INITIAL_VALUE = "DATO 1";
        private static final long serialVersionUID = 1L;
        public TABLE_MODEL(){
            this.addColumn(COLUMN1);
            this.addColumn(COLUMN2);
            this.addColumn(COLUMN3);
        }
        public static final String COLUMN1="A";
        public static final String COLUMN2="B";
        public static final String COLUMN3="C";
        public void addData(String a,String b){
            final Object rowData[]={a,b,INITIAL_VALUE};
            this.addRow(rowData);
        }
    }