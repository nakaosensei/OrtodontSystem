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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
@Entity
@Table(name = "odontograma")
@NamedQueries({
    @NamedQuery(name = "Odontograma.findAll", query = "SELECT o FROM Odontograma o"),
    @NamedQuery(name = "Odontograma.findById", query = "SELECT o FROM Odontograma o WHERE o.id = :id"),
    @NamedQuery(name = "Odontograma.findByD0", query = "SELECT o FROM Odontograma o WHERE o.d0 = :d0"),
    @NamedQuery(name = "Odontograma.findByD1", query = "SELECT o FROM Odontograma o WHERE o.d1 = :d1"),
    @NamedQuery(name = "Odontograma.findByD2", query = "SELECT o FROM Odontograma o WHERE o.d2 = :d2"),
    @NamedQuery(name = "Odontograma.findByD3", query = "SELECT o FROM Odontograma o WHERE o.d3 = :d3"),
    @NamedQuery(name = "Odontograma.findByD4", query = "SELECT o FROM Odontograma o WHERE o.d4 = :d4"),
    @NamedQuery(name = "Odontograma.findByD5", query = "SELECT o FROM Odontograma o WHERE o.d5 = :d5"),
    @NamedQuery(name = "Odontograma.findByD6", query = "SELECT o FROM Odontograma o WHERE o.d6 = :d6"),
    @NamedQuery(name = "Odontograma.findByD7", query = "SELECT o FROM Odontograma o WHERE o.d7 = :d7"),
    @NamedQuery(name = "Odontograma.findByD8", query = "SELECT o FROM Odontograma o WHERE o.d8 = :d8"),
    @NamedQuery(name = "Odontograma.findByD9", query = "SELECT o FROM Odontograma o WHERE o.d9 = :d9"),
    @NamedQuery(name = "Odontograma.findByD10", query = "SELECT o FROM Odontograma o WHERE o.d10 = :d10"),
    @NamedQuery(name = "Odontograma.findByD11", query = "SELECT o FROM Odontograma o WHERE o.d11 = :d11"),
    @NamedQuery(name = "Odontograma.findByD12", query = "SELECT o FROM Odontograma o WHERE o.d12 = :d12"),
    @NamedQuery(name = "Odontograma.findByD13", query = "SELECT o FROM Odontograma o WHERE o.d13 = :d13"),
    @NamedQuery(name = "Odontograma.findByD14", query = "SELECT o FROM Odontograma o WHERE o.d14 = :d14"),
    @NamedQuery(name = "Odontograma.findByD15", query = "SELECT o FROM Odontograma o WHERE o.d15 = :d15"),
    @NamedQuery(name = "Odontograma.findByD16", query = "SELECT o FROM Odontograma o WHERE o.d16 = :d16"),
    @NamedQuery(name = "Odontograma.findByD17", query = "SELECT o FROM Odontograma o WHERE o.d17 = :d17"),
    @NamedQuery(name = "Odontograma.findByD18", query = "SELECT o FROM Odontograma o WHERE o.d18 = :d18"),
    @NamedQuery(name = "Odontograma.findByD19", query = "SELECT o FROM Odontograma o WHERE o.d19 = :d19"),
    @NamedQuery(name = "Odontograma.findByD20", query = "SELECT o FROM Odontograma o WHERE o.d20 = :d20"),
    @NamedQuery(name = "Odontograma.findByD21", query = "SELECT o FROM Odontograma o WHERE o.d21 = :d21"),
    @NamedQuery(name = "Odontograma.findByD22", query = "SELECT o FROM Odontograma o WHERE o.d22 = :d22"),
    @NamedQuery(name = "Odontograma.findByD23", query = "SELECT o FROM Odontograma o WHERE o.d23 = :d23"),
    @NamedQuery(name = "Odontograma.findByD24", query = "SELECT o FROM Odontograma o WHERE o.d24 = :d24"),
    @NamedQuery(name = "Odontograma.findByD25", query = "SELECT o FROM Odontograma o WHERE o.d25 = :d25"),
    @NamedQuery(name = "Odontograma.findByD26", query = "SELECT o FROM Odontograma o WHERE o.d26 = :d26"),
    @NamedQuery(name = "Odontograma.findByD27", query = "SELECT o FROM Odontograma o WHERE o.d27 = :d27"),
    @NamedQuery(name = "Odontograma.findByD28", query = "SELECT o FROM Odontograma o WHERE o.d28 = :d28"),
    @NamedQuery(name = "Odontograma.findByD29", query = "SELECT o FROM Odontograma o WHERE o.d29 = :d29"),
    @NamedQuery(name = "Odontograma.findByD30", query = "SELECT o FROM Odontograma o WHERE o.d30 = :d30"),
    @NamedQuery(name = "Odontograma.findByS0", query = "SELECT o FROM Odontograma o WHERE o.s0 = :s0"),
    @NamedQuery(name = "Odontograma.findByS1", query = "SELECT o FROM Odontograma o WHERE o.s1 = :s1"),
    @NamedQuery(name = "Odontograma.findByS2", query = "SELECT o FROM Odontograma o WHERE o.s2 = :s2"),
    @NamedQuery(name = "Odontograma.findByS3", query = "SELECT o FROM Odontograma o WHERE o.s3 = :s3"),
    @NamedQuery(name = "Odontograma.findByS4", query = "SELECT o FROM Odontograma o WHERE o.s4 = :s4"),
    @NamedQuery(name = "Odontograma.findByS5", query = "SELECT o FROM Odontograma o WHERE o.s5 = :s5"),
    @NamedQuery(name = "Odontograma.findByS6", query = "SELECT o FROM Odontograma o WHERE o.s6 = :s6"),
    @NamedQuery(name = "Odontograma.findByS7", query = "SELECT o FROM Odontograma o WHERE o.s7 = :s7"),
    @NamedQuery(name = "Odontograma.findByS8", query = "SELECT o FROM Odontograma o WHERE o.s8 = :s8"),
    @NamedQuery(name = "Odontograma.findByS9", query = "SELECT o FROM Odontograma o WHERE o.s9 = :s9"),
    @NamedQuery(name = "Odontograma.findByS10", query = "SELECT o FROM Odontograma o WHERE o.s10 = :s10"),
    @NamedQuery(name = "Odontograma.findByS11", query = "SELECT o FROM Odontograma o WHERE o.s11 = :s11"),
    @NamedQuery(name = "Odontograma.findByS12", query = "SELECT o FROM Odontograma o WHERE o.s12 = :s12"),
    @NamedQuery(name = "Odontograma.findByS13", query = "SELECT o FROM Odontograma o WHERE o.s13 = :s13"),
    @NamedQuery(name = "Odontograma.findByS14", query = "SELECT o FROM Odontograma o WHERE o.s14 = :s14"),
    @NamedQuery(name = "Odontograma.findByS15", query = "SELECT o FROM Odontograma o WHERE o.s15 = :s15"),
    @NamedQuery(name = "Odontograma.findByS16", query = "SELECT o FROM Odontograma o WHERE o.s16 = :s16"),
    @NamedQuery(name = "Odontograma.findByS17", query = "SELECT o FROM Odontograma o WHERE o.s17 = :s17"),
    @NamedQuery(name = "Odontograma.findByS18", query = "SELECT o FROM Odontograma o WHERE o.s18 = :s18"),
    @NamedQuery(name = "Odontograma.findByS19", query = "SELECT o FROM Odontograma o WHERE o.s19 = :s19"),
    @NamedQuery(name = "Odontograma.findByS20", query = "SELECT o FROM Odontograma o WHERE o.s20 = :s20"),
    @NamedQuery(name = "Odontograma.findByS21", query = "SELECT o FROM Odontograma o WHERE o.s21 = :s21"),
    @NamedQuery(name = "Odontograma.findByS22", query = "SELECT o FROM Odontograma o WHERE o.s22 = :s22"),
    @NamedQuery(name = "Odontograma.findByS23", query = "SELECT o FROM Odontograma o WHERE o.s23 = :s23"),
    @NamedQuery(name = "Odontograma.findByS24", query = "SELECT o FROM Odontograma o WHERE o.s24 = :s24"),
    @NamedQuery(name = "Odontograma.findByS25", query = "SELECT o FROM Odontograma o WHERE o.s25 = :s25"),
    @NamedQuery(name = "Odontograma.findByS26", query = "SELECT o FROM Odontograma o WHERE o.s26 = :s26"),
    @NamedQuery(name = "Odontograma.findByS27", query = "SELECT o FROM Odontograma o WHERE o.s27 = :s27"),
    @NamedQuery(name = "Odontograma.findByS28", query = "SELECT o FROM Odontograma o WHERE o.s28 = :s28"),
    @NamedQuery(name = "Odontograma.findByS29", query = "SELECT o FROM Odontograma o WHERE o.s29 = :s29"),
    @NamedQuery(name = "Odontograma.findByS30", query = "SELECT o FROM Odontograma o WHERE o.s30 = :s30")})
public class Odontograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "d0")
    private Integer d0;
    @Column(name = "d1")
    private Integer d1;
    @Column(name = "d2")
    private Integer d2;
    @Column(name = "d3")
    private Integer d3;
    @Column(name = "d4")
    private Integer d4;
    @Column(name = "d5")
    private Integer d5;
    @Column(name = "d6")
    private Integer d6;
    @Column(name = "d7")
    private Integer d7;
    @Column(name = "d8")
    private Integer d8;
    @Column(name = "d9")
    private Integer d9;
    @Column(name = "d10")
    private Integer d10;
    @Column(name = "d11")
    private Integer d11;
    @Column(name = "d12")
    private Integer d12;
    @Column(name = "d13")
    private Integer d13;
    @Column(name = "d14")
    private Integer d14;
    @Column(name = "d15")
    private Integer d15;
    @Column(name = "d16")
    private Integer d16;
    @Column(name = "d17")
    private Integer d17;
    @Column(name = "d18")
    private Integer d18;
    @Column(name = "d19")
    private Integer d19;
    @Column(name = "d20")
    private Integer d20;
    @Column(name = "d21")
    private Integer d21;
    @Column(name = "d22")
    private Integer d22;
    @Column(name = "d23")
    private Integer d23;
    @Column(name = "d24")
    private Integer d24;
    @Column(name = "d25")
    private Integer d25;
    @Column(name = "d26")
    private Integer d26;
    @Column(name = "d27")
    private Integer d27;
    @Column(name = "d28")
    private Integer d28;
    @Column(name = "d29")
    private Integer d29;
    @Column(name = "d30")
    private Integer d30;
    @Column(name = "s0")
    private Integer s0;
    @Column(name = "s1")
    private Integer s1;
    @Column(name = "s2")
    private Integer s2;
    @Column(name = "s3")
    private Integer s3;
    @Column(name = "s4")
    private Integer s4;
    @Column(name = "s5")
    private Integer s5;
    @Column(name = "s6")
    private Integer s6;
    @Column(name = "s7")
    private Integer s7;
    @Column(name = "s8")
    private Integer s8;
    @Column(name = "s9")
    private Integer s9;
    @Column(name = "s10")
    private Integer s10;
    @Column(name = "s11")
    private Integer s11;
    @Column(name = "s12")
    private Integer s12;
    @Column(name = "s13")
    private Integer s13;
    @Column(name = "s14")
    private Integer s14;
    @Column(name = "s15")
    private Integer s15;
    @Column(name = "s16")
    private Integer s16;
    @Column(name = "s17")
    private Integer s17;
    @Column(name = "s18")
    private Integer s18;
    @Column(name = "s19")
    private Integer s19;
    @Column(name = "s20")
    private Integer s20;
    @Column(name = "s21")
    private Integer s21;
    @Column(name = "s22")
    private Integer s22;
    @Column(name = "s23")
    private Integer s23;
    @Column(name = "s24")
    private Integer s24;
    @Column(name = "s25")
    private Integer s25;
    @Column(name = "s26")
    private Integer s26;
    @Column(name = "s27")
    private Integer s27;
    @Column(name = "s28")
    private Integer s28;
    @Column(name = "s29")
    private Integer s29;
    @Column(name = "s30")
    private Integer s30;

    public Odontograma() {
    }

    public Odontograma(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getD0() {
        return d0;
    }

    public void setD0(Integer d0) {
        this.d0 = d0;
    }

    public Integer getD1() {
        return d1;
    }

    public void setD1(Integer d1) {
        this.d1 = d1;
    }

    public Integer getD2() {
        return d2;
    }

    public void setD2(Integer d2) {
        this.d2 = d2;
    }

    public Integer getD3() {
        return d3;
    }

    public void setD3(Integer d3) {
        this.d3 = d3;
    }

    public Integer getD4() {
        return d4;
    }

    public void setD4(Integer d4) {
        this.d4 = d4;
    }

    public Integer getD5() {
        return d5;
    }

    public void setD5(Integer d5) {
        this.d5 = d5;
    }

    public Integer getD6() {
        return d6;
    }

    public void setD6(Integer d6) {
        this.d6 = d6;
    }

    public Integer getD7() {
        return d7;
    }

    public void setD7(Integer d7) {
        this.d7 = d7;
    }

    public Integer getD8() {
        return d8;
    }

    public void setD8(Integer d8) {
        this.d8 = d8;
    }

    public Integer getD9() {
        return d9;
    }

    public void setD9(Integer d9) {
        this.d9 = d9;
    }

    public Integer getD10() {
        return d10;
    }

    public void setD10(Integer d10) {
        this.d10 = d10;
    }

    public Integer getD11() {
        return d11;
    }

    public void setD11(Integer d11) {
        this.d11 = d11;
    }

    public Integer getD12() {
        return d12;
    }

    public void setD12(Integer d12) {
        this.d12 = d12;
    }

    public Integer getD13() {
        return d13;
    }

    public void setD13(Integer d13) {
        this.d13 = d13;
    }

    public Integer getD14() {
        return d14;
    }

    public void setD14(Integer d14) {
        this.d14 = d14;
    }

    public Integer getD15() {
        return d15;
    }

    public void setD15(Integer d15) {
        this.d15 = d15;
    }

    public Integer getD16() {
        return d16;
    }

    public void setD16(Integer d16) {
        this.d16 = d16;
    }

    public Integer getD17() {
        return d17;
    }

    public void setD17(Integer d17) {
        this.d17 = d17;
    }

    public Integer getD18() {
        return d18;
    }

    public void setD18(Integer d18) {
        this.d18 = d18;
    }

    public Integer getD19() {
        return d19;
    }

    public void setD19(Integer d19) {
        this.d19 = d19;
    }

    public Integer getD20() {
        return d20;
    }

    public void setD20(Integer d20) {
        this.d20 = d20;
    }

    public Integer getD21() {
        return d21;
    }

    public void setD21(Integer d21) {
        this.d21 = d21;
    }

    public Integer getD22() {
        return d22;
    }

    public void setD22(Integer d22) {
        this.d22 = d22;
    }

    public Integer getD23() {
        return d23;
    }

    public void setD23(Integer d23) {
        this.d23 = d23;
    }

    public Integer getD24() {
        return d24;
    }

    public void setD24(Integer d24) {
        this.d24 = d24;
    }

    public Integer getD25() {
        return d25;
    }

    public void setD25(Integer d25) {
        this.d25 = d25;
    }

    public Integer getD26() {
        return d26;
    }

    public void setD26(Integer d26) {
        this.d26 = d26;
    }

    public Integer getD27() {
        return d27;
    }

    public void setD27(Integer d27) {
        this.d27 = d27;
    }

    public Integer getD28() {
        return d28;
    }

    public void setD28(Integer d28) {
        this.d28 = d28;
    }

    public Integer getD29() {
        return d29;
    }

    public void setD29(Integer d29) {
        this.d29 = d29;
    }

    public Integer getD30() {
        return d30;
    }

    public void setD30(Integer d30) {
        this.d30 = d30;
    }

    public Integer getS0() {
        return s0;
    }

    public void setS0(Integer s0) {
        this.s0 = s0;
    }

    public Integer getS1() {
        return s1;
    }

    public void setS1(Integer s1) {
        this.s1 = s1;
    }

    public Integer getS2() {
        return s2;
    }

    public void setS2(Integer s2) {
        this.s2 = s2;
    }

    public Integer getS3() {
        return s3;
    }

    public void setS3(Integer s3) {
        this.s3 = s3;
    }

    public Integer getS4() {
        return s4;
    }

    public void setS4(Integer s4) {
        this.s4 = s4;
    }

    public Integer getS5() {
        return s5;
    }

    public void setS5(Integer s5) {
        this.s5 = s5;
    }

    public Integer getS6() {
        return s6;
    }

    public void setS6(Integer s6) {
        this.s6 = s6;
    }

    public Integer getS7() {
        return s7;
    }

    public void setS7(Integer s7) {
        this.s7 = s7;
    }

    public Integer getS8() {
        return s8;
    }

    public void setS8(Integer s8) {
        this.s8 = s8;
    }

    public Integer getS9() {
        return s9;
    }

    public void setS9(Integer s9) {
        this.s9 = s9;
    }

    public Integer getS10() {
        return s10;
    }

    public void setS10(Integer s10) {
        this.s10 = s10;
    }

    public Integer getS11() {
        return s11;
    }

    public void setS11(Integer s11) {
        this.s11 = s11;
    }

    public Integer getS12() {
        return s12;
    }

    public void setS12(Integer s12) {
        this.s12 = s12;
    }

    public Integer getS13() {
        return s13;
    }

    public void setS13(Integer s13) {
        this.s13 = s13;
    }

    public Integer getS14() {
        return s14;
    }

    public void setS14(Integer s14) {
        this.s14 = s14;
    }

    public Integer getS15() {
        return s15;
    }

    public void setS15(Integer s15) {
        this.s15 = s15;
    }

    public Integer getS16() {
        return s16;
    }

    public void setS16(Integer s16) {
        this.s16 = s16;
    }

    public Integer getS17() {
        return s17;
    }

    public void setS17(Integer s17) {
        this.s17 = s17;
    }

    public Integer getS18() {
        return s18;
    }

    public void setS18(Integer s18) {
        this.s18 = s18;
    }

    public Integer getS19() {
        return s19;
    }

    public void setS19(Integer s19) {
        this.s19 = s19;
    }

    public Integer getS20() {
        return s20;
    }

    public void setS20(Integer s20) {
        this.s20 = s20;
    }

    public Integer getS21() {
        return s21;
    }

    public void setS21(Integer s21) {
        this.s21 = s21;
    }

    public Integer getS22() {
        return s22;
    }

    public void setS22(Integer s22) {
        this.s22 = s22;
    }

    public Integer getS23() {
        return s23;
    }

    public void setS23(Integer s23) {
        this.s23 = s23;
    }

    public Integer getS24() {
        return s24;
    }

    public void setS24(Integer s24) {
        this.s24 = s24;
    }

    public Integer getS25() {
        return s25;
    }

    public void setS25(Integer s25) {
        this.s25 = s25;
    }

    public Integer getS26() {
        return s26;
    }

    public void setS26(Integer s26) {
        this.s26 = s26;
    }

    public Integer getS27() {
        return s27;
    }

    public void setS27(Integer s27) {
        this.s27 = s27;
    }

    public Integer getS28() {
        return s28;
    }

    public void setS28(Integer s28) {
        this.s28 = s28;
    }

    public Integer getS29() {
        return s29;
    }

    public void setS29(Integer s29) {
        this.s29 = s29;
    }

    public Integer getS30() {
        return s30;
    }

    public void setS30(Integer s30) {
        this.s30 = s30;
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
        if (!(object instanceof Odontograma)) {
            return false;
        }
        Odontograma other = (Odontograma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.model.Odontograma[ id=" + id + " ]";
    }
    
}
