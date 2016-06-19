/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.tables;

import br.com.model.bd.Dentista;

/**
 *
 * @author Convidado
 */
public class ModelTabelaListDentista extends UsualTableModel<Dentista>{

    public ModelTabelaListDentista() {
        super(
            "nome=Nome",  
            "login=Login",
            "cpf=CPF",
            "rg=RG",
            "telfixo1=Telefone(Fixo)",
            "telCelular1=Telefone(Celular)",
            "rgorgaoexpedidor=RG(Orgão Expedidor)",
            "email=Email"
        );
    }
    
    
    
    
}
