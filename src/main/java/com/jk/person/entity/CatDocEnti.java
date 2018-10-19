package com.jk.person.entity;

import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cat_doc_enti")
public class CatDocEnti implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_docu_enti")
    private java.lang.Integer idDocuEnti;
    @Column(name = "cat_docu_enti")
    private java.lang.String catDocuEnti;
    @Column(name = "desc_docu_enti")
    private java.lang.String descDocuEnti;
    @Column(name = "ind_activo")
    private java.lang.String indActivo;

    public  CatDocEnti(){

    }
    public java.lang.Integer getIdDocuEnti(){
        return this.idDocuEnti;
    }
    public void setIdDocuEnti(java.lang.Integer idDocuEnti){
        this.idDocuEnti = idDocuEnti;
    }
    public java.lang.String getCatDocuEnti(){
        return this.catDocuEnti;
    }
    public void setCatDocuEnti(java.lang.String catDocuEnti){
        this.catDocuEnti = catDocuEnti;
    }
    public java.lang.String getDescDocuEnti(){
        return this.descDocuEnti;
    }
    public void setDescDocuEnti(java.lang.String descDocuEnti){
        this.descDocuEnti = descDocuEnti;
    }
    public java.lang.String getIndActivo(){
        return this.indActivo;
    }
    public void setIndActivo(java.lang.String indActivo){
        this.indActivo = indActivo;
    }
}