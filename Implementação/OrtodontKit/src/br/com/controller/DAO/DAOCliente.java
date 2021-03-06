/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller.DAO;

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
    
    public void removeAllDependenciesOfThatClientFromClient(int id){   
        em.getTransaction().begin();
        Query q =em.createQuery("UPDATE Cliente SET idClienteResponsavel = NULL,parentesco=NULL WHERE :id = idClienteResponsavel.id");
        int count=q.setParameter("id", id).executeUpdate();        
        em.getTransaction().commit();
    }
    
    public boolean checkIfClienteHasTratamento(int id){
        Query q = em.createQuery("SELECT t FROM Tratamento t where t.idCliente.id=:id");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            return true;
        }
        return false;
    }
    public boolean checkIfClienteHasRecibo(int id){
        Query q = em.createQuery("SELECT t FROM Recibo t where t.idCliente.id=:id");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            return true;
        }
        return false;
    }

    public boolean checkIfClienteHasEvento(int id){
        Query q = em.createQuery("SELECT t FROM Evento t where t.idCliente.id=:id");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            return true;
        }
        return false;
    }
}

