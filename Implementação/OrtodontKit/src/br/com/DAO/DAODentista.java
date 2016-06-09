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
    
    public boolean isRegistered(String login,String password) {
        Query q =em.createQuery("SELECT e FROM Dentista e WHERE e.login= :log AND e.passwd = :senha");
        q.setParameter("log", login);
        q.setParameter("senha", password);
        if(q.getResultList().isEmpty()){
            return false;
        }else{
            return true;
        }       
    }
    
}
