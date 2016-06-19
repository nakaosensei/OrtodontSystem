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
import javax.swing.text.NavigationFilter.FilterBypass;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class NKValidator {
     private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
     
    public static boolean isValidCPF(String cpf) {
        try {
            Integer cpfint = Integer.parseInt(cpf);
        } catch (Exception e) {
           return false;
        }
        if ((cpf==null) || (cpf.length()!=11)) return false;
        Integer digito1 = calcularDigito(cpf.substring(0,9), pesoCPF);
        Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1, pesoCPF);
        return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
   }
    
   private static int calcularDigito(String str, int[] peso) {
      int soma = 0;
      for (int indice=str.length()-1, digito; indice >= 0; indice-- ) {
         digito = Integer.parseInt(str.substring(indice,indice+1));
         soma += digito*peso[peso.length-str.length()+indice];
      }
      soma = 11 - soma % 11;
      return soma > 9 ? 0 : soma;
   } 

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
   
   public String unmaskCPF(String cpf){
       cpf=cpf.replaceAll("\\.", "");
       cpf=cpf.replace("-", "");
       return cpf;
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
