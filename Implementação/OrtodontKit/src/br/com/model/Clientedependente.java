/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

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
@Table(name = "clientedependente")
@NamedQueries({
    @NamedQuery(name = "Clientedependente.findAll", query = "SELECT c FROM Clientedependente c"),
    @NamedQuery(name = "Clientedependente.findByParentesco", query = "SELECT c FROM Clientedependente c WHERE c.parentesco = :parentesco"),
    @NamedQuery(name = "Clientedependente.findById", query = "SELECT c FROM Clientedependente c WHERE c.id = :id"),
    @NamedQuery(name = "Clientedependente.findByNome", query = "SELECT c FROM Clientedependente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Clientedependente.findByCpf", query = "SELECT c FROM Clientedependente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Clientedependente.findByRg", query = "SELECT c FROM Clientedependente c WHERE c.rg = :rg"),
    @NamedQuery(name = "Clientedependente.findByTelfixo1", query = "SELECT c FROM Clientedependente c WHERE c.telfixo1 = :telfixo1"),
    @NamedQuery(name = "Clientedependente.findByTelfixo2", query = "SELECT c FROM Clientedependente c WHERE c.telfixo2 = :telfixo2"),
    @NamedQuery(name = "Clientedependente.findByTelcelular1", query = "SELECT c FROM Clientedependente c WHERE c.telcelular1 = :telcelular1"),
    @NamedQuery(name = "Clientedependente.findByTelcelular2", query = "SELECT c FROM Clientedependente c WHERE c.telcelular2 = :telcelular2")})
public class Clientedependente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "parentesco")
    private String parentesco;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private Integer cpf;
    @Column(name = "rg")
    private Integer rg;
    @Column(name = "telfixo1")
    private Integer telfixo1;
    @Column(name = "telfixo2")
    private Integer telfixo2;
    @Column(name = "telcelular1")
    private Integer telcelular1;
    @Column(name = "telcelular2")
    private Integer telcelular2;
    @JoinColumn(name = "idEnderecoCasa", referencedColumnName = "id")
    @ManyToOne
    private Endereco idEnderecoCasa;
    @JoinColumn(name = "idEnderecoTrab", referencedColumnName = "id")
    @ManyToOne
    private Endereco idEnderecoTrab;
    @JoinColumn(name = "idClienteResponsavel", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente idClienteResponsavel;

    public Clientedependente() {
    }

    public Clientedependente(Integer id) {
        this.id = id;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Integer getTelfixo1() {
        return telfixo1;
    }

    public void setTelfixo1(Integer telfixo1) {
        this.telfixo1 = telfixo1;
    }

    public Integer getTelfixo2() {
        return telfixo2;
    }

    public void setTelfixo2(Integer telfixo2) {
        this.telfixo2 = telfixo2;
    }

    public Integer getTelcelular1() {
        return telcelular1;
    }

    public void setTelcelular1(Integer telcelular1) {
        this.telcelular1 = telcelular1;
    }

    public Integer getTelcelular2() {
        return telcelular2;
    }

    public void setTelcelular2(Integer telcelular2) {
        this.telcelular2 = telcelular2;
    }

    public Endereco getIdEnderecoCasa() {
        return idEnderecoCasa;
    }

    public void setIdEnderecoCasa(Endereco idEnderecoCasa) {
        this.idEnderecoCasa = idEnderecoCasa;
    }

    public Endereco getIdEnderecoTrab() {
        return idEnderecoTrab;
    }

    public void setIdEnderecoTrab(Endereco idEnderecoTrab) {
        this.idEnderecoTrab = idEnderecoTrab;
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
        if (!(object instanceof Clientedependente)) {
            return false;
        }
        Clientedependente other = (Clientedependente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.Clientedependente[ id=" + id + " ]";
    }
    
}
