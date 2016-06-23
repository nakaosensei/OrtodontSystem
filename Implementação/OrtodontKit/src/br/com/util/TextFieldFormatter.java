/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class TextFieldFormatter {
      

   public JFormattedTextField getIntegerTextField(){
       
       JFormattedTextField jtf= new JFormattedTextField();
        ((AbstractDocument) jtf.getDocument()).setDocumentFilter(new DocumentFilter() {
            Pattern regEx = Pattern.compile("\\d+");
            
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                Matcher matcher = regEx.matcher(text);
                if (!matcher.matches()) {
                    return;
                }
                super.replace(fb, offset, length, text, attrs);
            }
        });       
       return jtf;
   }
   
   public JFormattedTextField getTelefoneTextField(){       
       JFormattedTextField jtf= new JFormattedTextField(setMascara("(##)########"));       
       return jtf;
   }
   
   public JFormattedTextField getCPFTextField(){       
       JFormattedTextField jtf= new JFormattedTextField(setMascara("###.###.###-##"));       
       return jtf;
   }
   
   public JFormattedTextField getCEPTextField(){       
       JFormattedTextField jtf= new JFormattedTextField(setMascara("##.###-###"));       
       return jtf;
   }
   
   public JFormattedTextField getTimeTextField(){       
       JFormattedTextField jtf= new JFormattedTextField(setMascara("##"));       
       return jtf;
   }
   
   public String unmaskCPF(String cpf){
       cpf=cpf.replaceAll("\\.", "");
       cpf=cpf.replace("-", "");
       return cpf;
   }
   
   public JFormattedTextField getDataNascimentoTextField(){       
       JFormattedTextField jtf= new JFormattedTextField(setMascara("##/##/####"));       
       return jtf;
   }
   
   
   public String unmaskCEP(String cpf){
       cpf=cpf.replace(".", "");
       cpf=cpf.replace("-", "");       
       return cpf;
   }
 
   public String unmaskTelefone(String telefone){
       telefone=telefone.replace("(", "");
       telefone=telefone.replace(")", "");
       return telefone;
   }
   private MaskFormatter setMascara(String mascara){  
        MaskFormatter mask = null;  
        try{  
            mask = new MaskFormatter(mascara);                      
            
            }catch(java.text.ParseException ex){}  
        return mask;  
    }  

}
