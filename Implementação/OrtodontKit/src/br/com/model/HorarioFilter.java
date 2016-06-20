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
public class HorarioFilter {
    private int idDentista;
    
    private String data;
    private String horario;   
    private String nomeCliente;
    private String foneFixoCliente;
    private String foneCelularCliente;
    private String dia;
    private String mes;
    private String ano;
    private String hora;
    private String minuto;
    private int idCliente;
    public int getIdDentista() {
        return idDentista;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public void setIdDentista(int idDentista) {
        this.idDentista = idDentista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFoneFixoCliente() {
        return foneFixoCliente;
    }

    public void setFoneFixoCliente(String foneFixoCliente) {
        this.foneFixoCliente = foneFixoCliente;
    }

    public String getFoneCelularCliente() {
        return foneCelularCliente;
    }

    public void setFoneCelularCliente(String foneCelularCliente) {
        this.foneCelularCliente = foneCelularCliente;
    }
    
}
