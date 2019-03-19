package com.person.entity;

import javax.persistence.GenerationType;
import javax.persistence.CascadeType;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cat_cali_clien")
public class CatCaliClien implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cali_clien")
    private java.lang.Integer idCaliClien;
    @Column(name = "cod_cali_clien")
    private java.lang.String codCaliClien;
    @Column(name = "desc_cali_clien")
    private java.lang.String descCaliClien;
    
    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "maeClies")
    private Set<MaeClie> maeClies;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "maeEmprs")
    private Set<MaeEmpr> maeEmprs;
*/
    
    public  CatCaliClien(){

    }
    
    public  CatCaliClien(Integer idCaliClien){
    	this.idCaliClien = idCaliClien;
    }
    
    public java.lang.Integer getIdCaliClien(){
        return this.idCaliClien;
    }
    public void setIdCaliClien(java.lang.Integer idCaliClien){
        this.idCaliClien = idCaliClien;
    }
    public java.lang.String getCodCaliClien(){
        return this.codCaliClien;
    }
    public void setCodCaliClien(java.lang.String codCaliClien){
        this.codCaliClien = codCaliClien;
    }
    public java.lang.String getDescCaliClien(){
        return this.descCaliClien;
    }
    public void setDescCaliClien(java.lang.String descCaliClien){
        this.descCaliClien = descCaliClien;
    }
    
    /*public Set<MaeClie> getMaeClies(){
        return this.maeClies;
    }
    public void setMaeClies(Set<MaeClie> maeClies){
        this.maeClies = maeClies;
    }
    public Set<MaeEmpr> getMaeEmprs(){
        return this.maeEmprs;
    }
    public void setMaeEmprs(Set<MaeEmpr> maeEmprs){
        this.maeEmprs = maeEmprs;
    }*/
}