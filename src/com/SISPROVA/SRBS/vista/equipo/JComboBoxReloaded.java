/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SISPROVA.SRBS.vista.equipo;

import javax.swing.JComboBox;

/**
 *
 * @author G40-80
 */
public class JComboBoxReloaded extends JComboBox{
    
    @Override
    public String toString(){
        return this.getSelectedItem().toString();
    }
}
