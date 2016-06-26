/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.model.bd.Odontograma;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAOOdontograma extends DAOGenerico<Odontograma>{
    
    public DAOOdontograma(){
        super(Odontograma.class);
    }
    
    public void removeAll(){
       em.getTransaction().begin();
       
    }
    
}

