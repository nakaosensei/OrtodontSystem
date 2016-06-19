/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bd;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findById", query = "SELECT c FROM Cliente c WHERE c.id = :id"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findByRg", query = "SELECT c FROM Cliente c WHERE c.rg = :rg"),
    @NamedQuery(name = "Cliente.findByTelfixo1", query = "SELECT c FROM Cliente c WHERE c.telfixo1 = :telfixo1"),
    @NamedQuery(name = "Cliente.findByTelfixo2", query = "SELECT c FROM Cliente c WHERE c.telfixo2 = :telfixo2"),
    @NamedQuery(name = "Cliente.findByTelcelular1", query = "SELECT c FROM Cliente c WHERE c.telcelular1 = :telcelular1"),
    @NamedQuery(name = "Cliente.findByTelcelular2", query = "SELECT c FROM Cliente c WHERE c.telcelular2 = :telcelular2")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Column(name = "telfixo1")
    private String telfixo1;
    @Column(name = "telfixo2")
    private String telfixo2;
    @Column(name = "telcelular1")
    private String telcelular1;
    @Column(name = "telcelular2")
    private String telcelular2;
    @OneToMany(mappedBy = "idCliente")
    private List<Recibo> reciboList;
    @OneToMany(mappedBy = "idCliente")
    private List<FichaClinica> fichaClinicaList;
    @OneToMany(mappedBy = "idClienteResponsavel")
    private List<FichaClinica> fichaClinicaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClienteResponsavel")
    private List<Clientedependente> clientedependenteList;
    @JoinColumn(name = "idEnderecoCasa", referencedColumnName = "id")
    @ManyToOne
    private Endereco idEnderecoCasa;
    @JoinColumn(name = "idEnderecoTrab", referencedColumnName = "id")
    @ManyToOne
    private Endereco idEnderecoTrab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private List<Evento> eventoList;

    public Cliente() {
    }

    public Cliente(Integer id) {
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelfixo1() {
        return telfixo1;
    }

    public void setTelfixo1(String telfixo1) {
        this.telfixo1 = telfixo1;
    }

    public String getTelfixo2() {
        return telfixo2;
    }

    public void setTelfixo2(String telfixo2) {
        this.telfixo2 = telfixo2;
    }

    public String getTelcelular1() {
        return telcelular1;
    }

    public void setTelcelular1(String telcelular1) {
        this.telcelular1 = telcelular1;
    }

    public String getTelcelular2() {
        return telcelular2;
    }

    public void setTelcelular2(String telcelular2) {
        this.telcelular2 = telcelular2;
    }

    public List<Recibo> getReciboList() {
        return reciboList;
    }

    public void setReciboList(List<Recibo> reciboList) {
        this.reciboList = reciboList;
    }

    public List<FichaClinica> getFichaClinicaList() {
        return fichaClinicaList;
    }

    public void setFichaClinicaList(List<FichaClinica> fichaClinicaList) {
        this.fichaClinicaList = fichaClinicaList;
    }

    public List<FichaClinica> getFichaClinicaList1() {
        return fichaClinicaList1;
    }

    public void setFichaClinicaList1(List<FichaClinica> fichaClinicaList1) {
        this.fichaClinicaList1 = fichaClinicaList1;
    }

    public List<Clientedependente> getClientedependenteList() {
        return clientedependenteList;
    }

    public void setClientedependenteList(List<Clientedependente> clientedependenteList) {
        this.clientedependenteList = clientedependenteList;
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

    public List<Evento> getEventoList() {
        return eventoList;
    }

    public void setEventoList(List<Evento> eventoList) {
        this.eventoList = eventoList;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.tables.bd.Cliente[ id=" + id + " ]";
    }
    
}
