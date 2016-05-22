/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
@Entity
@Table(name = "endereco")
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e"),
    @NamedQuery(name = "Endereco.findById", query = "SELECT e FROM Endereco e WHERE e.id = :id"),
    @NamedQuery(name = "Endereco.findByRua", query = "SELECT e FROM Endereco e WHERE e.rua = :rua"),
    @NamedQuery(name = "Endereco.findByNumero", query = "SELECT e FROM Endereco e WHERE e.numero = :numero"),
    @NamedQuery(name = "Endereco.findByCidade", query = "SELECT e FROM Endereco e WHERE e.cidade = :cidade"),
    @NamedQuery(name = "Endereco.findByCep", query = "SELECT e FROM Endereco e WHERE e.cep = :cep"),
    @NamedQuery(name = "Endereco.findByEstado", query = "SELECT e FROM Endereco e WHERE e.estado = :estado"),
    @NamedQuery(name = "Endereco.findByBairro", query = "SELECT e FROM Endereco e WHERE e.bairro = :bairro"),
    @NamedQuery(name = "Endereco.findByComplemento", query = "SELECT e FROM Endereco e WHERE e.complemento = :complemento")})
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "cep")
    private Integer cep;
    @Column(name = "estado")
    private String estado;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "complemento")
    private String complemento;
    @OneToMany(mappedBy = "idEndereco")
    private List<Dentista> dentistaList;
    @OneToMany(mappedBy = "idEnderecoCasa")
    private List<Clientedependente> clientedependenteList;
    @OneToMany(mappedBy = "idEnderecoTrab")
    private List<Clientedependente> clientedependenteList1;
    @OneToMany(mappedBy = "idEnderecoCasa")
    private List<Cliente> clienteList;
    @OneToMany(mappedBy = "idEnderecoTrab")
    private List<Cliente> clienteList1;
    @OneToMany(mappedBy = "idEndereco")
    private List<Secretaria> secretariaList;

    public Endereco() {
    }

    public Endereco(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public List<Dentista> getDentistaList() {
        return dentistaList;
    }

    public void setDentistaList(List<Dentista> dentistaList) {
        this.dentistaList = dentistaList;
    }

    public List<Clientedependente> getClientedependenteList() {
        return clientedependenteList;
    }

    public void setClientedependenteList(List<Clientedependente> clientedependenteList) {
        this.clientedependenteList = clientedependenteList;
    }

    public List<Clientedependente> getClientedependenteList1() {
        return clientedependenteList1;
    }

    public void setClientedependenteList1(List<Clientedependente> clientedependenteList1) {
        this.clientedependenteList1 = clientedependenteList1;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public List<Cliente> getClienteList1() {
        return clienteList1;
    }

    public void setClienteList1(List<Cliente> clienteList1) {
        this.clienteList1 = clienteList1;
    }

    public List<Secretaria> getSecretariaList() {
        return secretariaList;
    }

    public void setSecretariaList(List<Secretaria> secretariaList) {
        this.secretariaList = secretariaList;
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
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.Endereco[ id=" + id + " ]";
    }
    
}
