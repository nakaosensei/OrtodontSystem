package br.com.controller;

import br.com.view.JFAgenda;
import br.com.view.JFLogin;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

/**
 *
 * @author a1061712
 */
public class main {
    public static void main(String[] args) {
        MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        JFLogin jf = new JFLogin();
        //JFAgenda jfa = new JFAgenda();
        //jfa.setVisible(true);
        jf.setVisible(true);   
        
        
    }
}
