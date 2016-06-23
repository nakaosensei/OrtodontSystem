/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.model.bd.Dentista;
import br.com.model.bd.Evento;

/**
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAOEvento extends DAOGenerico<Evento>{
    
    public DAOEvento() {
        super(Evento.class);
    }
    
    public void deletaAllWithThatDateFromThatDentist(String ano,String mes,String dia,Dentista dentista){
        
        
    }
    
}
