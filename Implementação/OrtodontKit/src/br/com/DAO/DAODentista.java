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
    public boolean checkIfDentistaHasSecretaria(int id){
        Query q = em.createQuery("SELECT t FROM Secretaria t where t.idDentistaPatrao.id=:id");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            return true;
        }
        return false;
    }
    public boolean checkIfDentistaHasEvento(int id){
        Query q = em.createQuery("SELECT t FROM Evento t where t.idDentista.id=:id");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            return true;
        }
        return false;
    }
    public boolean checkIfDentistaHasRecibo(int id){
        Query q = em.createQuery("SELECT t FROM Recibo t where t.idEmitente.id=:id");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            return true;
        }
        return false;
    }
}
