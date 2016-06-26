/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.model.bd.Tratamento;
import javax.persistence.Query;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAOTratamento extends DAOGenerico<Tratamento>{
    
    public DAOTratamento(){
        super(Tratamento.class);
    }
   
    public int idLastInsert(){
        Query q = em.createQuery("SELECT MAX(t.id) from Tratamento t");
        if(q.getResultList()==null||q.getResultList().isEmpty()){
            return 0;
            
        }else{
            return (int)q.getResultList().get(0);
        }            
    }
    
}
