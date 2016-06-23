package br.com.DAO;

import br.com.model.bd.Dentista;
import javax.persistence.Query;


/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAODentista extends DAOGenerico<Dentista> {
    
    public DAODentista() {
        super(Dentista.class);
    }
    
    public Dentista getIfIsRegistered(String login,String password) {
        Query q =em.createQuery("SELECT e FROM Dentista e WHERE e.login= :log AND e.passwd = :senha");
        q.setParameter("log", login);
        q.setParameter("senha", password);
        if(q.getResultList().isEmpty()){
            return null;
        }else{
            return (Dentista)q.getResultList().get(0);
        }       
    }
    
}
