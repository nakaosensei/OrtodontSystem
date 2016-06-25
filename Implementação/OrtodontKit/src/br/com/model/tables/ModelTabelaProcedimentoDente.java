/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.tables;

import br.com.model.bd.Procedimentododente;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class ModelTabelaProcedimentoDente extends UsualTableModel<Procedimentododente>{
    
    public ModelTabelaProcedimentoDente(){
        super(
               "dente=Dente",
               "regiao=Região",
               "face=Face",
               "procedimentoIndicado=Procedimento Indicado"        
        );
    }
    
    
}
