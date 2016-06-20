/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.tables;

import br.com.model.HorarioFilter;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class ModelTabelaAgenda extends UsualTableModel<HorarioFilter> {
   public ModelTabelaAgenda(){
       super("data=Data"
             ,"horario=Horario"
             ,"nomeCliente=Cliente"
             ,"foneFixoCliente=Fone(Fixo)"
             ,"foneCelularCliente=Fone(Celular)"
       );       
        
   }
}
