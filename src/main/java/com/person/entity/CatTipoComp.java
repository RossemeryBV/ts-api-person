package com.person.entity;

import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cat_tipo_comp")
public class CatTipoComp implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_comp")
    private java.lang.Integer idTipoComp;
    @Column(name = "cod_tipo_comp")
    private java.lang.String codTipoComp;
    @Column(name = "desc_comp")
    private java.lang.String descComp;
    @Column(name = "ind_activo")
    private java.lang.String indActivo;

    public  CatTipoComp(){

    }
    public java.lang.Integer getIdTipoComp(){
        return this.idTipoComp;
    }
    public void setIdTipoComp(java.lang.Integer idTipoComp){
        this.idTipoComp = idTipoComp;
    }
    public java.lang.String getCodTipoComp(){
        return this.codTipoComp;
    }
    public void setCodTipoComp(java.lang.String codTipoComp){
        this.codTipoComp = codTipoComp;
    }
    public java.lang.String getDescComp(){
        return this.descComp;
    }
    public void setDescComp(java.lang.String descComp){
        this.descComp = descComp;
    }
    public java.lang.String getIndActivo(){
        return this.indActivo;
    }
    public void setIndActivo(java.lang.String indActivo){
        this.indActivo = indActivo;
    }
}