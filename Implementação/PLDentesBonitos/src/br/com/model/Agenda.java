/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Nakao
 */
public class Agenda {
    List<Consulta> consultas;
    Dentista owner;
    
    void agendar(Date data,Dentista dentista,Cliente cliente){
        consultas.add(new Consulta(data,dentista,cliente));
    }
    void desagendar(Date data,Dentista dentista,Cliente cliente){
        
    }
    
}
