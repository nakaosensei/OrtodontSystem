/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import static br.com.DAO.DAOGenerico.em;
import br.com.model.bd.Dentista;
import br.com.model.bd.Evento;
import java.util.List;
import javax.persistence.Query;

/**
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAOEvento extends DAOGenerico<Evento>{
    
    public DAOEvento() {
        super(Evento.class);
    }
    
    public void deleteAllWithThatDateFromThatDentist(String ano,String mes,String dia,Dentista dentista){
        em.getTransaction().begin();
        Query q =em.createQuery("DELETE FROM Evento e WHERE e.ano like :ano AND e.dia like :dia AND e.mes like :mes AND e.idDentista.id=:id");
        q.setParameter("id", dentista.getId());
        q.setParameter("ano", ano);
        q.setParameter("mes", mes);
        q.setParameter("dia", dia);
        q.executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Evento> getAllWithThatDateFromThatDentist(String ano,String mes,String dia,Dentista dentista){
        Query q =em.createQuery("SELECT e FROM Evento e WHERE e.ano like :ano AND e.dia like :dia AND e.mes like :mes AND e.idDentista.id=:id");
        q.setParameter("id", dentista.getId());
        q.setParameter("ano", ano);
        q.setParameter("mes", mes);
        q.setParameter("dia", dia);
        return (List<Evento>)q.getResultList();
    }
    
}
