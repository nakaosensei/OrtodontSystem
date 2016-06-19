/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bd;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
@Entity
@Table(name = "dentista")
@NamedQueries({
    @NamedQuery(name = "Dentista.findAll", query = "SELECT d FROM Dentista d"),
    @NamedQuery(name = "Dentista.findById", query = "SELECT d FROM Dentista d WHERE d.id = :id"),
    @NamedQuery(name = "Dentista.findByLogin", query = "SELECT d FROM Dentista d WHERE d.login = :login"),
    @NamedQuery(name = "Dentista.findByPasswd", query = "SELECT d FROM Dentista d WHERE d.passwd = :passwd"),
    @NamedQuery(name = "Dentista.findByNome", query = "SELECT d FROM Dentista d WHERE d.nome = :nome"),
    @NamedQuery(name = "Dentista.findByCpf", query = "SELECT d FROM Dentista d WHERE d.cpf = :cpf"),
    @NamedQuery(name = "Dentista.findByRg", query = "SELECT d FROM Dentista d WHERE d.rg = :rg"),
    @NamedQuery(name = "Dentista.findByTelfixo1", query = "SELECT d FROM Dentista d WHERE d.telfixo1 = :telfixo1"),
    @NamedQuery(name = "Dentista.findByTelfixo2", query = "SELECT d FROM Dentista d WHERE d.telfixo2 = :telfixo2"),
    @NamedQuery(name = "Dentista.findByTelcelular1", query = "SELECT d FROM Dentista d WHERE d.telcelular1 = :telcelular1"),
    @NamedQuery(name = "Dentista.findByTelcelular2", query = "SELECT d FROM Dentista d WHERE d.telcelular2 = :telcelular2"),
    @NamedQuery(name = "Dentista.findByRgorgaoexpedidor", query = "SELECT d FROM Dentista d WHERE d.rgorgaoexpedidor = :rgorgaoexpedidor"),
    @NamedQuery(name = "Dentista.findBySexo", query = "SELECT d FROM Dentista d WHERE d.sexo = :sexo"),
    @NamedQuery(name = "Dentista.findByEstadocivil", query = "SELECT d FROM Dentista d WHERE d.estadocivil = :estadocivil"),
    @NamedQuery(name = "Dentista.findByEmail", query = "SELECT d FROM Dentista d WHERE d.email = :email"),
    @NamedQuery(name = "Dentista.findByDatanascimento", query = "SELECT d FROM Dentista d WHERE d.datanascimento = :datanascimento")})
public class Dentista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "login")
    private String login;
    @Column(name = "passwd")
    private String passwd;
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
    @Column(name = "rgorgaoexpedidor")
    private String rgorgaoexpedidor;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "estadocivil")
    private Character estadocivil;
    @Column(name = "email")
    private String email;
    @Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    @OneToMany(mappedBy = "idEmitente")
    private List<Recibo> reciboList;
    @JoinColumn(name = "idAgenda", referencedColumnName = "id")
    @ManyToOne
    private Agenda idAgenda;
    @JoinColumn(name = "idEndereco", referencedColumnName = "id")
    @ManyToOne
    private Endereco idEndereco;

    public Dentista() {
    }

    public Dentista(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
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

    public String getRgorgaoexpedidor() {
        return rgorgaoexpedidor;
    }

    public void setRgorgaoexpedidor(String rgorgaoexpedidor) {
        this.rgorgaoexpedidor = rgorgaoexpedidor;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(Character estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public List<Recibo> getReciboList() {
        return reciboList;
    }

    public void setReciboList(List<Recibo> reciboList) {
        this.reciboList = reciboList;
    }

    public Agenda getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Agenda idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Endereco getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Endereco idEndereco) {
        this.idEndereco = idEndereco;
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
        if (!(object instanceof Dentista)) {
            return false;
        }
        Dentista other = (Dentista) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.bd.Dentista[ id=" + id + " ]";
    }
    
}
