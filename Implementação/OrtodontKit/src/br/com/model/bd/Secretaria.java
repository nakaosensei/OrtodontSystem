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
@Table(name = "secretaria")
@NamedQueries({
    @NamedQuery(name = "Secretaria.findAll", query = "SELECT s FROM Secretaria s"),
    @NamedQuery(name = "Secretaria.findById", query = "SELECT s FROM Secretaria s WHERE s.id = :id"),
    @NamedQuery(name = "Secretaria.findByNome", query = "SELECT s FROM Secretaria s WHERE s.nome = :nome"),
    @NamedQuery(name = "Secretaria.findByLogin", query = "SELECT s FROM Secretaria s WHERE s.login = :login"),
    @NamedQuery(name = "Secretaria.findByPasswd", query = "SELECT s FROM Secretaria s WHERE s.passwd = :passwd"),
    @NamedQuery(name = "Secretaria.findByCpf", query = "SELECT s FROM Secretaria s WHERE s.cpf = :cpf"),
    @NamedQuery(name = "Secretaria.findByRg", query = "SELECT s FROM Secretaria s WHERE s.rg = :rg"),
    @NamedQuery(name = "Secretaria.findByTelfixo1", query = "SELECT s FROM Secretaria s WHERE s.telfixo1 = :telfixo1"),
    @NamedQuery(name = "Secretaria.findByTelfixo2", query = "SELECT s FROM Secretaria s WHERE s.telfixo2 = :telfixo2"),
    @NamedQuery(name = "Secretaria.findByTelcelular1", query = "SELECT s FROM Secretaria s WHERE s.telcelular1 = :telcelular1"),
    @NamedQuery(name = "Secretaria.findByTelcelular2", query = "SELECT s FROM Secretaria s WHERE s.telcelular2 = :telcelular2"),
    @NamedQuery(name = "Secretaria.findByRgorgaoexpedidor", query = "SELECT s FROM Secretaria s WHERE s.rgorgaoexpedidor = :rgorgaoexpedidor"),
    @NamedQuery(name = "Secretaria.findBySexo", query = "SELECT s FROM Secretaria s WHERE s.sexo = :sexo"),
    @NamedQuery(name = "Secretaria.findByEstadocivil", query = "SELECT s FROM Secretaria s WHERE s.estadocivil = :estadocivil"),
    @NamedQuery(name = "Secretaria.findByEmail", query = "SELECT s FROM Secretaria s WHERE s.email = :email")})
public class Secretaria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "login")
    private String login;
    @Column(name = "passwd")
    private String passwd;
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
    private String estadocivil;
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "idEndereco", referencedColumnName = "id")
    @ManyToOne
    private Endereco idEndereco;
    @JoinColumn(name = "idDentistaPatrao", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Dentista idDentistaPatrao;

    public Secretaria() {
    }

    public Secretaria(Integer id) {
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

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Endereco idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Dentista getIdDentistaPatrao() {
        return idDentistaPatrao;
    }

    public void setIdDentistaPatrao(Dentista idDentistaPatrao) {
        this.idDentistaPatrao = idDentistaPatrao;
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
        if (!(object instanceof Secretaria)) {
            return false;
        }
        Secretaria other = (Secretaria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.bd.Secretaria[ id=" + id + " ]";
    }
    
}
