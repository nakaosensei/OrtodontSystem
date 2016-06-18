/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.util;

import javax.swing.JComboBox;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class JCBState {
    private JComboBox<String> estados = new JComboBox<>();
    
    public JCBState(){
        estados.addItem("AC");
        estados.addItem("AL");
        estados.addItem("AP");
        estados.addItem("AM");
        estados.addItem("BA");
        estados.addItem("CE");
        estados.addItem("DF");
        estados.addItem("ES");
        estados.addItem("GO");
        estados.addItem("MA");
        estados.addItem("MT");
        estados.addItem("MS");
        estados.addItem("MG");
        estados.addItem("PA");
        estados.addItem("PB");
        estados.addItem("PR");
        estados.addItem("PE");
        estados.addItem("PI");
        estados.addItem("RJ");
        estados.addItem("RN");
        estados.addItem("RS");
        estados.addItem("RO");
        estados.addItem("RR");
        estados.addItem("SC");
        estados.addItem("SP");
        estados.addItem("SE");
        estados.addItem("TO");
       
    }
}
