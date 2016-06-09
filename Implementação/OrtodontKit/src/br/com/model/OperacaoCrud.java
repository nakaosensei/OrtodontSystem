/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public enum OperacaoCrud {
    ADICIONAR(0),
    EDITAR(1),
    REMOVER(2),
    LISTAR(3);
    public int valor;
    
    OperacaoCrud(int v){
        this.valor=v;
    }

    
}
