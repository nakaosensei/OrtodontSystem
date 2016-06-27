/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller.DAO;

import static br.com.controller.DAO.DAOGenerico.em;
import br.com.model.bd.Endereco;
import javax.persistence.Query;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class DAOEndereco extends DAOGenerico<Endereco>{
    
    public DAOEndereco() {
        super(Endereco.class);
    }

    public Endereco getInsertingIfNecessary(Endereco e){
        Query q =em.createQuery("SELECT e FROM Endereco e WHERE e.rua= :rua AND e.numero = :numero AND e.cidade = :cidade AND e.cep = :cep AND e.estado = :estado AND e.bairro = :bairro AND e.complemento = :complemento");
        q.setParameter("rua", e.getRua());
        q.setParameter("numero", e.getNumero());
        q.setParameter("cidade", e.getCidade());
        q.setParameter("cep", e.getCep());
        q.setParameter("estado", e.getEstado());
        q.setParameter("bairro", e.getBairro());
        q.setParameter("complemento", e.getComplemento());
        if(!q.getResultList().isEmpty()){
            return (Endereco)q.getResultList().get(0);
        }else{
            this.inserir(e);
            return this.getInsertingIfNecessary(e);
        }
        
    }
    
}
