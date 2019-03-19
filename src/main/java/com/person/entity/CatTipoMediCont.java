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

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cat_tipo_medi_cont")
public class CatTipoMediCont implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(name = "id_tipo_medi_cont")
    private java.lang.Integer idTipoMediCont;
    
    @Column(name = "cod_tipo_medi_cont")
    private java.lang.String codTipoMediCont;
    
    @Column(name = "desc_tipo_medi_cont")
    private java.lang.String descTipoMediCont;
    
    @Column(name = "ind_activo")
    private java.lang.String indActivo;
    
    public  CatTipoMediCont(){

    }
    public java.lang.Integer getIdTipoMediCont(){
        return this.idTipoMediCont;
    }
    public void setIdTipoMediCont(java.lang.Integer idTipoMediCont){
        this.idTipoMediCont = idTipoMediCont;
    }
    public java.lang.String getCodTipoMediCont(){
        return this.codTipoMediCont;
    }
    public void setCodTipoMediCont(java.lang.String codTipoMediCont){
        this.codTipoMediCont = codTipoMediCont;
    }
    public java.lang.String getDescTipoMediCont(){
        return this.descTipoMediCont;
    }
    public void setDescTipoMediCont(java.lang.String descTipoMediCont){
        this.descTipoMediCont = descTipoMediCont;
    }
    public java.lang.String getIndActivo(){
        return this.indActivo;
    }
    public void setIndActivo(java.lang.String indActivo){
        this.indActivo = indActivo;
    }   
}