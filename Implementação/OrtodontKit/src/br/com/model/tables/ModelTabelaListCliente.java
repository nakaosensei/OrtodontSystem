/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.tables;

import br.com.model.Cliente;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class ModelTabelaListCliente extends UsualTableModel<Cliente>{
 
    public ModelTabelaListCliente(){
        super(
            "nome=Nome",
            "cpf=CPF",
            "telFixo=Telefone(Fixo)",
            "telCelular=Telefone(Celular)"
        );
    }
    
}
