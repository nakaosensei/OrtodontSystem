/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import br.com.model.bd.Cliente;
import br.com.model.bd.Tratamento;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class TratamentoFilter {
    private int id;
    private int nrProtocolo;
    private double valorCombinadoTratamento;
    private double valorCombinadoPecas;
    private String dia;
    private String mes;
    private String ano;
    private String data;
    Cliente cliente;
    private String clienteNome;
    private int clienteId;
    private String clienteTelefoneFixo;
    private String clienteTelefoneCel;
    private Tratamento tratamento;

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNrProtocolo() {
        return nrProtocolo;
    }

    public void setNrProtocolo(int nrProtocolo) {
        this.nrProtocolo = nrProtocolo;
    }

    public double getValorCombinadoTratamento() {
        return valorCombinadoTratamento;
    }

    public void setValorCombinadoTratamento(double valorCombinadoTratamento) {
        this.valorCombinadoTratamento = valorCombinadoTratamento;
    }

    public double getValorCombinadoPecas() {
        return valorCombinadoPecas;
    }

    public void setValorCombinadoPecas(double valorCombinadoPecas) {
        this.valorCombinadoPecas = valorCombinadoPecas;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getClienteTelefoneFixo() {
        return clienteTelefoneFixo;
    }

    public void setClienteTelefoneFixo(String clienteTelefoneFixo) {
        this.clienteTelefoneFixo = clienteTelefoneFixo;
    }

    public String getClienteTelefoneCel() {
        return clienteTelefoneCel;
    }

    public void setClienteTelefoneCel(String clienteTelefoneCel) {
        this.clienteTelefoneCel = clienteTelefoneCel;
    }

  
    

    
    
}
