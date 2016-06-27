/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller.DAO;

import br.com.model.bd.Procedimentododente;
import javax.persistence.Query;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAOProcedimento extends DAOGenerico<Procedimentododente>{
    
    public DAOProcedimento(){
        super(Procedimentododente.class);
    }
    
    public void removeAllFromTratamento(int idTratamento){
        em.getTransaction().begin();
        Query q = em.createQuery("DELETE from Procedimentododente pd where pd.idTratamento.id=:id");
        q.setParameter("id", idTratamento);
        q.executeUpdate();
        em.getTransaction().commit();
    }
}
