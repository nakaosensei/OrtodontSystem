/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import static br.com.DAO.DAOGenerico.em;
import br.com.model.Secretaria;
import javax.persistence.Query;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAOSecretaria extends DAOGenerico<Secretaria>{
    
    public DAOSecretaria() {
        super(Secretaria.class);
    }

    public boolean isRegistered(String login,String password) {
        Query q =em.createQuery("SELECT e FROM Secretaria e WHERE e.login= :log AND e.passwd = :senha");
        q.setParameter("log", login);
        q.setParameter("senha", password);
        if(q.getResultList().isEmpty()){
            return false;
        }else{
            return true;
        }       
    }

    
}
