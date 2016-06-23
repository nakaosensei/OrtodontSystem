/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Convidado
 */
@Entity
@Table(name = "fichaclinica")
@NamedQueries({
    @NamedQuery(name = "Fichaclinica.findAll", query = "SELECT f FROM Fichaclinica f"),
    @NamedQuery(name = "Fichaclinica.findById", query = "SELECT f FROM Fichaclinica f WHERE f.id = :id"),
    @NamedQuery(name = "Fichaclinica.findByIndica\u00e7ao", query = "SELECT f FROM Fichaclinica f WHERE f.indica\u00e7ao = :indica\u00e7ao"),
    @NamedQuery(name = "Fichaclinica.findByAtendimentoinicial", query = "SELECT f FROM Fichaclinica f WHERE f.atendimentoinicial = :atendimentoinicial"),
    @NamedQuery(name = "Fichaclinica.findByNumeroprotocolo", query = "SELECT f FROM Fichaclinica f WHERE f.numeroprotocolo = :numeroprotocolo")})
public class Fichaclinica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "indica\u00e7ao")
    private String indicaçao;
    @Column(name = "atendimentoinicial")
    private String atendimentoinicial;
    @Column(name = "numeroprotocolo")
    private Integer numeroprotocolo;
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    @ManyToOne
    private Cliente idCliente;
    @JoinColumn(name = "idClienteResponsavel", referencedColumnName = "id")
    @ManyToOne
    private Cliente idClienteResponsavel;

    public Fichaclinica() {
    }

    public Fichaclinica(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndicaçao() {
        return indicaçao;
    }

    public void setIndicaçao(String indicaçao) {
        this.indicaçao = indicaçao;
    }

    public String getAtendimentoinicial() {
        return atendimentoinicial;
    }

    public void setAtendimentoinicial(String atendimentoinicial) {
        this.atendimentoinicial = atendimentoinicial;
    }

    public Integer getNumeroprotocolo() {
        return numeroprotocolo;
    }

    public void setNumeroprotocolo(Integer numeroprotocolo) {
        this.numeroprotocolo = numeroprotocolo;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente getIdClienteResponsavel() {
        return idClienteResponsavel;
    }

    public void setIdClienteResponsavel(Cliente idClienteResponsavel) {
        this.idClienteResponsavel = idClienteResponsavel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fichaclinica)) {
            return false;
        }
        Fichaclinica other = (Fichaclinica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.bd.Fichaclinica[ id=" + id + " ]";
    }
    
}
