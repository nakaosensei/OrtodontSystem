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
 * @author nakao<nakaosensei@gmail.com>
 */
@Entity
@Table(name = "procedimentoDoDente")
@NamedQueries({
    @NamedQuery(name = "ProcedimentoDoDente.findAll", query = "SELECT p FROM ProcedimentoDoDente p"),
    @NamedQuery(name = "ProcedimentoDoDente.findById", query = "SELECT p FROM ProcedimentoDoDente p WHERE p.id = :id"),
    @NamedQuery(name = "ProcedimentoDoDente.findByDente", query = "SELECT p FROM ProcedimentoDoDente p WHERE p.dente = :dente"),
    @NamedQuery(name = "ProcedimentoDoDente.findByRegiao", query = "SELECT p FROM ProcedimentoDoDente p WHERE p.regiao = :regiao"),
    @NamedQuery(name = "ProcedimentoDoDente.findByFace", query = "SELECT p FROM ProcedimentoDoDente p WHERE p.face = :face"),
    @NamedQuery(name = "ProcedimentoDoDente.findByProcedimentoIndicado", query = "SELECT p FROM ProcedimentoDoDente p WHERE p.procedimentoIndicado = :procedimentoIndicado")})
public class ProcedimentoDoDente implements Serializable {

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

    public ProcedimentoDoDente() {
    }

    public ProcedimentoDoDente(Integer id) {
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
        if (!(object instanceof ProcedimentoDoDente)) {
            return false;
        }
        ProcedimentoDoDente other = (ProcedimentoDoDente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.tables.bd.ProcedimentoDoDente[ id=" + id + " ]";
    }
    
}
