/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
@Entity
@Table(name = "recibo")
@NamedQueries({
    @NamedQuery(name = "Recibo.findAll", query = "SELECT r FROM Recibo r"),
    @NamedQuery(name = "Recibo.findByNrRecibo", query = "SELECT r FROM Recibo r WHERE r.nrRecibo = :nrRecibo"),
    @NamedQuery(name = "Recibo.findByValor", query = "SELECT r FROM Recibo r WHERE r.valor = :valor"),
    @NamedQuery(name = "Recibo.findByDescricaoServico", query = "SELECT r FROM Recibo r WHERE r.descricaoServico = :descricaoServico"),
    @NamedQuery(name = "Recibo.findByData", query = "SELECT r FROM Recibo r WHERE r.data = :data")})
public class Recibo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nrRecibo")
    private Integer nrRecibo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Float valor;
    @Column(name = "descricaoServico")
    private String descricaoServico;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @JoinColumn(name = "idEmitente", referencedColumnName = "id")
    @ManyToOne
    private Dentista idEmitente;
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    @ManyToOne
    private Cliente idCliente;

    public Recibo() {
    }

    public Recibo(Integer nrRecibo) {
        this.nrRecibo = nrRecibo;
    }

    public Integer getNrRecibo() {
        return nrRecibo;
    }

    public void setNrRecibo(Integer nrRecibo) {
        this.nrRecibo = nrRecibo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Dentista getIdEmitente() {
        return idEmitente;
    }

    public void setIdEmitente(Dentista idEmitente) {
        this.idEmitente = idEmitente;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrRecibo != null ? nrRecibo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recibo)) {
            return false;
        }
        Recibo other = (Recibo) object;
        if ((this.nrRecibo == null && other.nrRecibo != null) || (this.nrRecibo != null && !this.nrRecibo.equals(other.nrRecibo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.Recibo[ nrRecibo=" + nrRecibo + " ]";
    }
    
}
