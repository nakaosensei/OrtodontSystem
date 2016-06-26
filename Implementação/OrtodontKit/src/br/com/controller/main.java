package br.com.controller;

import br.com.view.JFLogin;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author a1061712
 */
public class main {
    public static void main(String[] args) {
        //MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        int useNimbus=0;
        if(useNimbus==1){
            try {
                Class<? extends LookAndFeel> laf = (Class<? extends LookAndFeel>) Class.forName("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");           
                UIManager.setLookAndFeel(laf.newInstance());
            }
            catch (Exception e) {
                e.printStackTrace();
            }        
        }
        //JDCRUDDentista cd = new JDCRUDDentista(null, true);
        //cd.setVisible(true);
        JFLogin jf = new JFLogin();        
        jf.setVisible(true);
        
        
    }
}
