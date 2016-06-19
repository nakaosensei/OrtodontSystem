/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import static br.com.DAO.DAOGenerico.em;
import br.com.model.bd.Cliente;
import br.com.model.bd.Clientedependente;
import javax.persistence.Query;

/**
 *
 * @author Lucas
 */
public class DAOClientedependente extends DAOGenerico<Clientedependente>{
    public DAOClientedependente() {
        super(Clientedependente.class);
    }
    
    public Cliente getResponsavel(int idClienteResponsavel){
        Query q =em.createQuery("SELECT e FROM cliente e WHERE e.id= :id");
        q.setParameter("id", idClienteResponsavel);
        if(q.getResultList().isEmpty()){
            return null;
        }else{
            return (Cliente)q.getResultList().get(0);
        }
    }
}

