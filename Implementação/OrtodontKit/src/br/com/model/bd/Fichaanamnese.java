/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bd;

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
@Table(name = "fichaanamnese")
@NamedQueries({
    @NamedQuery(name = "Fichaanamnese.findAll", query = "SELECT f FROM Fichaanamnese f"),
    @NamedQuery(name = "Fichaanamnese.findById", query = "SELECT f FROM Fichaanamnese f WHERE f.id = :id"),
    @NamedQuery(name = "Fichaanamnese.findByQueixaPrincipal", query = "SELECT f FROM Fichaanamnese f WHERE f.queixaPrincipal = :queixaPrincipal"),
    @NamedQuery(name = "Fichaanamnese.findByDoencaAtual", query = "SELECT f FROM Fichaanamnese f WHERE f.doencaAtual = :doencaAtual"),
    @NamedQuery(name = "Fichaanamnese.findByEstatratamentoMedico", query = "SELECT f FROM Fichaanamnese f WHERE f.estatratamentoMedico = :estatratamentoMedico"),
    @NamedQuery(name = "Fichaanamnese.findByNomeMedicoAssistente", query = "SELECT f FROM Fichaanamnese f WHERE f.nomeMedicoAssistente = :nomeMedicoAssistente"),
    @NamedQuery(name = "Fichaanamnese.findByTelefoneMedicoAssistente", query = "SELECT f FROM Fichaanamnese f WHERE f.telefoneMedicoAssistente = :telefoneMedicoAssistente"),
    @NamedQuery(name = "Fichaanamnese.findByUsaMedicacao", query = "SELECT f FROM Fichaanamnese f WHERE f.usaMedicacao = :usaMedicacao"),
    @NamedQuery(name = "Fichaanamnese.findByHasAlergia", query = "SELECT f FROM Fichaanamnese f WHERE f.hasAlergia = :hasAlergia"),
    @NamedQuery(name = "Fichaanamnese.findByHasAnemia", query = "SELECT f FROM Fichaanamnese f WHERE f.hasAnemia = :hasAnemia"),
    @NamedQuery(name = "Fichaanamnese.findByHasHepatite", query = "SELECT f FROM Fichaanamnese f WHERE f.hasHepatite = :hasHepatite"),
    @NamedQuery(name = "Fichaanamnese.findByHasSifilis", query = "SELECT f FROM Fichaanamnese f WHERE f.hasSifilis = :hasSifilis"),
    @NamedQuery(name = "Fichaanamnese.findByHasHiv", query = "SELECT f FROM Fichaanamnese f WHERE f.hasHiv = :hasHiv"),
    @NamedQuery(name = "Fichaanamnese.findByHasTuberculose", query = "SELECT f FROM Fichaanamnese f WHERE f.hasTuberculose = :hasTuberculose"),
    @NamedQuery(name = "Fichaanamnese.findByHasAsma", query = "SELECT f FROM Fichaanamnese f WHERE f.hasAsma = :hasAsma"),
    @NamedQuery(name = "Fichaanamnese.findByIsfUmante", query = "SELECT f FROM Fichaanamnese f WHERE f.isfUmante = :isfUmante"),
    @NamedQuery(name = "Fichaanamnese.findByHasHormonios", query = "SELECT f FROM Fichaanamnese f WHERE f.hasHormonios = :hasHormonios"),
    @NamedQuery(name = "Fichaanamnese.findByIsAlcoolista", query = "SELECT f FROM Fichaanamnese f WHERE f.isAlcoolista = :isAlcoolista"),
    @NamedQuery(name = "Fichaanamnese.findByHasHerpes", query = "SELECT f FROM Fichaanamnese f WHERE f.hasHerpes = :hasHerpes"),
    @NamedQuery(name = "Fichaanamnese.findByHasGravidez", query = "SELECT f FROM Fichaanamnese f WHERE f.hasGravidez = :hasGravidez"),
    @NamedQuery(name = "Fichaanamnese.findByHasDesmaios", query = "SELECT f FROM Fichaanamnese f WHERE f.hasDesmaios = :hasDesmaios"),
    @NamedQuery(name = "Fichaanamnese.findByHasFebrereumatica", query = "SELECT f FROM Fichaanamnese f WHERE f.hasFebrereumatica = :hasFebrereumatica"),
    @NamedQuery(name = "Fichaanamnese.findByHasDiabetes", query = "SELECT f FROM Fichaanamnese f WHERE f.hasDiabetes = :hasDiabetes"),
    @NamedQuery(name = "Fichaanamnese.findByHasEpilepsia", query = "SELECT f FROM Fichaanamnese f WHERE f.hasEpilepsia = :hasEpilepsia"),
    @NamedQuery(name = "Fichaanamnese.findByHasCicatrizacaoruim", query = "SELECT f FROM Fichaanamnese f WHERE f.hasCicatrizacaoruim = :hasCicatrizacaoruim"),
    @NamedQuery(name = "Fichaanamnese.findByHasDisturbiopsicologico", query = "SELECT f FROM Fichaanamnese f WHERE f.hasDisturbiopsicologico = :hasDisturbiopsicologico"),
    @NamedQuery(name = "Fichaanamnese.findByHasEndocarditebacteriana", query = "SELECT f FROM Fichaanamnese f WHERE f.hasEndocarditebacteriana = :hasEndocarditebacteriana"),
    @NamedQuery(name = "Fichaanamnese.findByHasProblemahepatico", query = "SELECT f FROM Fichaanamnese f WHERE f.hasProblemahepatico = :hasProblemahepatico"),
    @NamedQuery(name = "Fichaanamnese.findByHasProblemarenal", query = "SELECT f FROM Fichaanamnese f WHERE f.hasProblemarenal = :hasProblemarenal"),
    @NamedQuery(name = "Fichaanamnese.findByHasProblemacardiaco", query = "SELECT f FROM Fichaanamnese f WHERE f.hasProblemacardiaco = :hasProblemacardiaco"),
    @NamedQuery(name = "Fichaanamnese.findByHasProblemasarticularesreumaticos", query = "SELECT f FROM Fichaanamnese f WHERE f.hasProblemasarticularesreumaticos = :hasProblemasarticularesreumaticos"),
    @NamedQuery(name = "Fichaanamnese.findByHasTensaoarterial", query = "SELECT f FROM Fichaanamnese f WHERE f.hasTensaoarterial = :hasTensaoarterial"),
    @NamedQuery(name = "Fichaanamnese.findByHasCirurgiacominternacaohospilar", query = "SELECT f FROM Fichaanamnese f WHERE f.hasCirurgiacominternacaohospilar = :hasCirurgiacominternacaohospilar"),
    @NamedQuery(name = "Fichaanamnese.findByDoencaInfectocontagiosa", query = "SELECT f FROM Fichaanamnese f WHERE f.doencaInfectocontagiosa = :doencaInfectocontagiosa")})
public class Fichaanamnese implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "queixaPrincipal")
    private String queixaPrincipal;
    @Column(name = "doencaAtual")
    private String doencaAtual;
    @Column(name = "estatratamentoMedico")
    private Integer estatratamentoMedico;
    @Column(name = "nomeMedicoAssistente")
    private String nomeMedicoAssistente;
    @Column(name = "telefoneMedicoAssistente")
    private String telefoneMedicoAssistente;
    @Column(name = "usaMedicacao")
    private Integer usaMedicacao;
    @Column(name = "hasAlergia")
    private Integer hasAlergia;
    @Column(name = "hasAnemia")
    private Integer hasAnemia;
    @Column(name = "hasHepatite")
    private Integer hasHepatite;
    @Column(name = "hasSifilis")
    private Integer hasSifilis;
    @Column(name = "hasHiv")
    private Integer hasHiv;
    @Column(name = "hasTuberculose")
    private Integer hasTuberculose;
    @Column(name = "hasAsma")
    private Integer hasAsma;
    @Column(name = "isfUmante")
    private Integer isfUmante;
    @Column(name = "hasHormonios")
    private Integer hasHormonios;
    @Column(name = "isAlcoolista")
    private Integer isAlcoolista;
    @Column(name = "hasHerpes")
    private Integer hasHerpes;
    @Column(name = "hasGravidez")
    private Integer hasGravidez;
    @Column(name = "hasDesmaios")
    private Integer hasDesmaios;
    @Column(name = "hasFebrereumatica")
    private Integer hasFebrereumatica;
    @Column(name = "hasDiabetes")
    private Integer hasDiabetes;
    @Column(name = "hasEpilepsia")
    private Integer hasEpilepsia;
    @Column(name = "hasCicatrizacaoruim")
    private Integer hasCicatrizacaoruim;
    @Column(name = "hasDisturbiopsicologico")
    private Integer hasDisturbiopsicologico;
    @Column(name = "hasEndocarditebacteriana")
    private Integer hasEndocarditebacteriana;
    @Column(name = "hasProblemahepatico")
    private Integer hasProblemahepatico;
    @Column(name = "hasProblemarenal")
    private Integer hasProblemarenal;
    @Column(name = "hasProblemacardiaco")
    private Integer hasProblemacardiaco;
    @Column(name = "hasProblemasarticularesreumaticos")
    private Integer hasProblemasarticularesreumaticos;
    @Column(name = "hasTensaoarterial")
    private Integer hasTensaoarterial;
    @Column(name = "hasCirurgiacominternacaohospilar")
    private Integer hasCirurgiacominternacaohospilar;
    @Column(name = "doencaInfectocontagiosa")
    private String doencaInfectocontagiosa;
    @OneToMany(mappedBy = "idFichaAnamnese")
    private List<Tratamento> tratamentoList;

    public Fichaanamnese() {
    }

    public Fichaanamnese(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getDoencaAtual() {
        return doencaAtual;
    }

    public void setDoencaAtual(String doencaAtual) {
        this.doencaAtual = doencaAtual;
    }

    public Integer getEstatratamentoMedico() {
        return estatratamentoMedico;
    }

    public void setEstatratamentoMedico(Integer estatratamentoMedico) {
        this.estatratamentoMedico = estatratamentoMedico;
    }

    public String getNomeMedicoAssistente() {
        return nomeMedicoAssistente;
    }

    public void setNomeMedicoAssistente(String nomeMedicoAssistente) {
        this.nomeMedicoAssistente = nomeMedicoAssistente;
    }

    public String getTelefoneMedicoAssistente() {
        return telefoneMedicoAssistente;
    }

    public void setTelefoneMedicoAssistente(String telefoneMedicoAssistente) {
        this.telefoneMedicoAssistente = telefoneMedicoAssistente;
    }

    public Integer getUsaMedicacao() {
        return usaMedicacao;
    }

    public void setUsaMedicacao(Integer usaMedicacao) {
        this.usaMedicacao = usaMedicacao;
    }

    public Integer getHasAlergia() {
        return hasAlergia;
    }

    public void setHasAlergia(Integer hasAlergia) {
        this.hasAlergia = hasAlergia;
    }

    public Integer getHasAnemia() {
        return hasAnemia;
    }

    public void setHasAnemia(Integer hasAnemia) {
        this.hasAnemia = hasAnemia;
    }

    public Integer getHasHepatite() {
        return hasHepatite;
    }

    public void setHasHepatite(Integer hasHepatite) {
        this.hasHepatite = hasHepatite;
    }

    public Integer getHasSifilis() {
        return hasSifilis;
    }

    public void setHasSifilis(Integer hasSifilis) {
        this.hasSifilis = hasSifilis;
    }

    public Integer getHasHiv() {
        return hasHiv;
    }

    public void setHasHiv(Integer hasHiv) {
        this.hasHiv = hasHiv;
    }

    public Integer getHasTuberculose() {
        return hasTuberculose;
    }

    public void setHasTuberculose(Integer hasTuberculose) {
        this.hasTuberculose = hasTuberculose;
    }

    public Integer getHasAsma() {
        return hasAsma;
    }

    public void setHasAsma(Integer hasAsma) {
        this.hasAsma = hasAsma;
    }

    public Integer getIsfUmante() {
        return isfUmante;
    }

    public void setIsfUmante(Integer isfUmante) {
        this.isfUmante = isfUmante;
    }

    public Integer getHasHormonios() {
        return hasHormonios;
    }

    public void setHasHormonios(Integer hasHormonios) {
        this.hasHormonios = hasHormonios;
    }

    public Integer getIsAlcoolista() {
        return isAlcoolista;
    }

    public void setIsAlcoolista(Integer isAlcoolista) {
        this.isAlcoolista = isAlcoolista;
    }

    public Integer getHasHerpes() {
        return hasHerpes;
    }

    public void setHasHerpes(Integer hasHerpes) {
        this.hasHerpes = hasHerpes;
    }

    public Integer getHasGravidez() {
        return hasGravidez;
    }

    public void setHasGravidez(Integer hasGravidez) {
        this.hasGravidez = hasGravidez;
    }

    public Integer getHasDesmaios() {
        return hasDesmaios;
    }

    public void setHasDesmaios(Integer hasDesmaios) {
        this.hasDesmaios = hasDesmaios;
    }

    public Integer getHasFebrereumatica() {
        return hasFebrereumatica;
    }

    public void setHasFebrereumatica(Integer hasFebrereumatica) {
        this.hasFebrereumatica = hasFebrereumatica;
    }

    public Integer getHasDiabetes() {
        return hasDiabetes;
    }

    public void setHasDiabetes(Integer hasDiabetes) {
        this.hasDiabetes = hasDiabetes;
    }

    public Integer getHasEpilepsia() {
        return hasEpilepsia;
    }

    public void setHasEpilepsia(Integer hasEpilepsia) {
        this.hasEpilepsia = hasEpilepsia;
    }

    public Integer getHasCicatrizacaoruim() {
        return hasCicatrizacaoruim;
    }

    public void setHasCicatrizacaoruim(Integer hasCicatrizacaoruim) {
        this.hasCicatrizacaoruim = hasCicatrizacaoruim;
    }

    public Integer getHasDisturbiopsicologico() {
        return hasDisturbiopsicologico;
    }

    public void setHasDisturbiopsicologico(Integer hasDisturbiopsicologico) {
        this.hasDisturbiopsicologico = hasDisturbiopsicologico;
    }

    public Integer getHasEndocarditebacteriana() {
        return hasEndocarditebacteriana;
    }

    public void setHasEndocarditebacteriana(Integer hasEndocarditebacteriana) {
        this.hasEndocarditebacteriana = hasEndocarditebacteriana;
    }

    public Integer getHasProblemahepatico() {
        return hasProblemahepatico;
    }

    public void setHasProblemahepatico(Integer hasProblemahepatico) {
        this.hasProblemahepatico = hasProblemahepatico;
    }

    public Integer getHasProblemarenal() {
        return hasProblemarenal;
    }

    public void setHasProblemarenal(Integer hasProblemarenal) {
        this.hasProblemarenal = hasProblemarenal;
    }

    public Integer getHasProblemacardiaco() {
        return hasProblemacardiaco;
    }

    public void setHasProblemacardiaco(Integer hasProblemacardiaco) {
        this.hasProblemacardiaco = hasProblemacardiaco;
    }

    public Integer getHasProblemasarticularesreumaticos() {
        return hasProblemasarticularesreumaticos;
    }

    public void setHasProblemasarticularesreumaticos(Integer hasProblemasarticularesreumaticos) {
        this.hasProblemasarticularesreumaticos = hasProblemasarticularesreumaticos;
    }

    public Integer getHasTensaoarterial() {
        return hasTensaoarterial;
    }

    public void setHasTensaoarterial(Integer hasTensaoarterial) {
        this.hasTensaoarterial = hasTensaoarterial;
    }

    public Integer getHasCirurgiacominternacaohospilar() {
        return hasCirurgiacominternacaohospilar;
    }

    public void setHasCirurgiacominternacaohospilar(Integer hasCirurgiacominternacaohospilar) {
        this.hasCirurgiacominternacaohospilar = hasCirurgiacominternacaohospilar;
    }

    public String getDoencaInfectocontagiosa() {
        return doencaInfectocontagiosa;
    }

    public void setDoencaInfectocontagiosa(String doencaInfectocontagiosa) {
        this.doencaInfectocontagiosa = doencaInfectocontagiosa;
    }

    public List<Tratamento> getTratamentoList() {
        return tratamentoList;
    }

    public void setTratamentoList(List<Tratamento> tratamentoList) {
        this.tratamentoList = tratamentoList;
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
        if (!(object instanceof Fichaanamnese)) {
            return false;
        }
        Fichaanamnese other = (Fichaanamnese) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.bd.Fichaanamnese[ id=" + id + " ]";
    }
    
}
