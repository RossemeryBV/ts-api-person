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
@Table(name = "cat_tipo_docu_iden")
public class CatTipoDocuIden implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_docu_iden")
    private java.lang.Integer idTipoDocuIden;
    
    @Column(name = "cod_tipo_docu_iden")
    private java.lang.String codTipoDocuIden;
    
    @Column(name = "desc_tipo_docu_iden")
    private java.lang.String descTipoDocuIden;
    
    @Column(name = "ind_activo")
    private java.lang.String indActivo;
    
   
    public  CatTipoDocuIden(){

    }
    public java.lang.Integer getIdTipoDocuIden(){
        return this.idTipoDocuIden;
    }
    public void setIdTipoDocuIden(java.lang.Integer idTipoDocuIden){
        this.idTipoDocuIden = idTipoDocuIden;
    }
    public java.lang.String getCodTipoDocuIden(){
        return this.codTipoDocuIden;
    }
    public void setCodTipoDocuIden(java.lang.String codTipoDocuIden){
        this.codTipoDocuIden = codTipoDocuIden;
    }
    public java.lang.String getDescTipoDocuIden(){
        return this.descTipoDocuIden;
    }
    public void setDescTipoDocuIden(java.lang.String descTipoDocuIden){
        this.descTipoDocuIden = descTipoDocuIden;
    }
    public java.lang.String getIndActivo(){
        return this.indActivo;
    }
    public void setIndActivo(java.lang.String indActivo){
        this.indActivo = indActivo;
    }
  
}