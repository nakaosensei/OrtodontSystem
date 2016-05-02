/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nakao
 */
public class Agenda {
    List<Agendamento> agendamentos;
    Dentista owner;
    
    public Agenda(Dentista owner){
        this.owner=owner;
        agendamentos = new ArrayList<>();
    }
    
    void agendar(Date data,Dentista dentista,Cliente cliente){
        agendamentos.add(new Agendamento(data,dentista,cliente));
    }
    void desagendar(Date data,Dentista dentista,Cliente cliente){
        
    }
    
}
