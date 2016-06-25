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
@Table(name = "tratamento")
@NamedQueries({
    @NamedQuery(name = "Tratamento.findAll", query = "SELECT t FROM Tratamento t"),
    @NamedQuery(name = "Tratamento.findById", query = "SELECT t FROM Tratamento t WHERE t.id = :id"),
    @NamedQuery(name = "Tratamento.findByNrProtocolo", query = "SELECT t FROM Tratamento t WHERE t.nrProtocolo = :nrProtocolo"),
    @NamedQuery(name = "Tratamento.findByValorCombinadoTratamento", query = "SELECT t FROM Tratamento t WHERE t.valorCombinadoTratamento = :valorCombinadoTratamento"),
    @NamedQuery(name = "Tratamento.findByValorCombinadoPecas", query = "SELECT t FROM Tratamento t WHERE t.valorCombinadoPecas = :valorCombinadoPecas"),
    @NamedQuery(name = "Tratamento.findByDataInicioDia", query = "SELECT t FROM Tratamento t WHERE t.dataInicioDia = :dataInicioDia"),
    @NamedQuery(name = "Tratamento.findByDataInicioMes", query = "SELECT t FROM Tratamento t WHERE t.dataInicioMes = :dataInicioMes"),
    @NamedQuery(name = "Tratamento.findByDataInicioAno", query = "SELECT t FROM Tratamento t WHERE t.dataInicioAno = :dataInicioAno")})
public class Tratamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nrProtocolo")
    private int nrProtocolo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorCombinadoTratamento")
    private Double valorCombinadoTratamento;
    @Column(name = "valorCombinadoPecas")
    private Double valorCombinadoPecas;
    @Column(name = "dataInicioDia")
    private String dataInicioDia;
    @Column(name = "dataInicioMes")
    private String dataInicioMes;
    @Column(name = "dataInicioAno")
    private String dataInicioAno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTratamento")
    private List<Procedimentododente> procedimentododenteList;
    @JoinColumn(name = "idFichaAnamnese", referencedColumnName = "id")
    @ManyToOne
    private Fichaanamnese idFichaAnamnese;
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    @ManyToOne
    private Cliente idCliente;
    @JoinColumn(name = "idOdontograma", referencedColumnName = "id")
    @ManyToOne
    private Odontograma idOdontograma;

    public Tratamento() {
    }

    public Tratamento(Integer id) {
        this.id = id;
    }

    public Tratamento(Integer id, int nrProtocolo) {
        this.id = id;
        this.nrProtocolo = nrProtocolo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNrProtocolo() {
        return nrProtocolo;
    }

    public void setNrProtocolo(int nrProtocolo) {
        this.nrProtocolo = nrProtocolo;
    }

    public Double getValorCombinadoTratamento() {
        return valorCombinadoTratamento;
    }

    public void setValorCombinadoTratamento(Double valorCombinadoTratamento) {
        this.valorCombinadoTratamento = valorCombinadoTratamento;
    }

    public Double getValorCombinadoPecas() {
        return valorCombinadoPecas;
    }

    public void setValorCombinadoPecas(Double valorCombinadoPecas) {
        this.valorCombinadoPecas = valorCombinadoPecas;
    }

    public String getDataInicioDia() {
        return dataInicioDia;
    }

    public void setDataInicioDia(String dataInicioDia) {
        this.dataInicioDia = dataInicioDia;
    }

    public String getDataInicioMes() {
        return dataInicioMes;
    }

    public void setDataInicioMes(String dataInicioMes) {
        this.dataInicioMes = dataInicioMes;
    }

    public String getDataInicioAno() {
        return dataInicioAno;
    }

    public void setDataInicioAno(String dataInicioAno) {
        this.dataInicioAno = dataInicioAno;
    }

    public List<Procedimentododente> getProcedimentododenteList() {
        return procedimentododenteList;
    }

    public void setProcedimentododenteList(List<Procedimentododente> procedimentododenteList) {
        this.procedimentododenteList = procedimentododenteList;
    }

    public Fichaanamnese getIdFichaAnamnese() {
        return idFichaAnamnese;
    }

    public void setIdFichaAnamnese(Fichaanamnese idFichaAnamnese) {
        this.idFichaAnamnese = idFichaAnamnese;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Odontograma getIdOdontograma() {
        return idOdontograma;
    }

    public void setIdOdontograma(Odontograma idOdontograma) {
        this.idOdontograma = idOdontograma;
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
        if (!(object instanceof Tratamento)) {
            return false;
        }
        Tratamento other = (Tratamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.bd.Tratamento[ id=" + id + " ]";
    }
    
}
