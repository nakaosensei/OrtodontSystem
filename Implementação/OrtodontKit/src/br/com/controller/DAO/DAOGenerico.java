/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
public class DAOGenerico<T> {
    public static EntityManager em  = Persistence.createEntityManagerFactory("OrtodontKitPU").createEntityManager();
    private Class clazz;
    public DAOGenerico(Class clazz) {
        this.clazz = clazz;
    }
   
    public void inserir(T e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }
    
    public void atualizar(T e) {
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();
    }
    public void remover(Integer id) {
        T e = obter(id);
        if (e != null) {
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();
        }
    }
    public T obter(Integer id) {
        return (T) em.find(clazz, id);
        
    }
    public List<T> listAll() {
        return em.createQuery("SELECT e FROM "+clazz.getSimpleName() + " e").getResultList();
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
   
    
   
}
