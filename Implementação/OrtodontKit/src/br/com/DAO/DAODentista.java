/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.model.Dentista;
import javax.persistence.Query;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAODentista extends DAOGenerico<Dentista> {
    
    public DAODentista() {
        super(Dentista.class);
    }
    
    public boolean isRegistered(String nome,String password) {
        Query q =em.createQuery("SELECT e FROM Dentista e WHERE e.");
        return true;
    }
    
}
