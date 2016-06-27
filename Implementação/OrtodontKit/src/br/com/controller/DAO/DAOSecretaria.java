/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller.DAO;

import static br.com.controller.DAO.DAOGenerico.em;
import br.com.model.bd.Secretaria;
import javax.persistence.Query;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAOSecretaria extends DAOGenerico<Secretaria>{
    
    public DAOSecretaria() {
        super(Secretaria.class);
    }

    public Secretaria getIfIsRegistered(String login,String password) {
        Query q =em.createQuery("SELECT e FROM Secretaria e WHERE e.login= :log AND e.passwd = :senha");
        q.setParameter("log", login);
        q.setParameter("senha", password);
        if(q.getResultList().isEmpty()){
            return null;
        }else{
            return (Secretaria)q.getResultList().get(0);
        }       
    }

    
}
