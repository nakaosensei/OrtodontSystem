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
@Table(name = "procedimentododente")
@NamedQueries({
    @NamedQuery(name = "Procedimentododente.findAll", query = "SELECT p FROM Procedimentododente p"),
    @NamedQuery(name = "Procedimentododente.findById", query = "SELECT p FROM Procedimentododente p WHERE p.id = :id"),
    @NamedQuery(name = "Procedimentododente.findByDente", query = "SELECT p FROM Procedimentododente p WHERE p.dente = :dente"),
    @NamedQuery(name = "Procedimentododente.findByRegiao", query = "SELECT p FROM Procedimentododente p WHERE p.regiao = :regiao"),
    @NamedQuery(name = "Procedimentododente.findByFace", query = "SELECT p FROM Procedimentododente p WHERE p.face = :face"),
    @NamedQuery(name = "Procedimentododente.findByProcedimentoIndicado", query = "SELECT p FROM Procedimentododente p WHERE p.procedimentoIndicado = :procedimentoIndicado")})
public class Procedimentododente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dente")
    private Integer dente;
    @Column(name = "regiao")
    private Integer regiao;
    @Column(name = "face")
    private Integer face;
    @Column(name = "procedimentoIndicado")
    private String procedimentoIndicado;
    @JoinColumn(name = "idTratamento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tratamento idTratamento;

    public Procedimentododente() {
    }

    public Procedimentododente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDente() {
        return dente;
    }

    public void setDente(Integer dente) {
        this.dente = dente;
    }

    public Integer getRegiao() {
        return regiao;
    }

    public void setRegiao(Integer regiao) {
        this.regiao = regiao;
    }

    public Integer getFace() {
        return face;
    }

    public void setFace(Integer face) {
        this.face = face;
    }

    public String getProcedimentoIndicado() {
        return procedimentoIndicado;
    }

    public void setProcedimentoIndicado(String procedimentoIndicado) {
        this.procedimentoIndicado = procedimentoIndicado;
    }

    public Tratamento getIdTratamento() {
        return idTratamento;
    }

    public void setIdTratamento(Tratamento idTratamento) {
        this.idTratamento = idTratamento;
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
        if (!(object instanceof Procedimentododente)) {
            return false;
        }
        Procedimentododente other = (Procedimentododente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.bd.Procedimentododente[ id=" + id + " ]";
    }
    
}
