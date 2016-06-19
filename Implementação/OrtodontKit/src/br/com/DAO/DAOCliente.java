/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.model.bd.Cliente;
import javax.persistence.Query;

/**
 *
 * @author Lucas
 */
public class DAOCliente extends DAOGenerico<Cliente>{
    public DAOCliente() {
        super(Cliente.class);
    }
    
    public Cliente getResponsavel(int idClienteResponsavel){
        Query q =em.createQuery("SELECT e FROM Cliente e WHERE e.id like :id");
        q.setParameter("id", idClienteResponsavel);
        if(q.getResultList().isEmpty()){
            return null;
        }else{
            return (Cliente)q.getResultList().get(0);
        }
    }
}

