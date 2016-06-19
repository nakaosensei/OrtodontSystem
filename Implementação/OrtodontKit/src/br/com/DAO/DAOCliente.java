/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.model.bd.Cliente;

/**
 *
 * @author Lucas
 */
public class DAOCliente extends DAOGenerico<Cliente>{
    public DAOCliente() {
        super(Cliente.class);
    }
}

