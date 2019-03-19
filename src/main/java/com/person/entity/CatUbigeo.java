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
@Table(name = "cat_ubigeo")
public class CatUbigeo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ubigeo")
    private java.lang.Integer idUbigeo;
    
    @Column(name = "cod_depa")
    private java.lang.String codDepa;
    
    @Column(name = "cod_prov")
    private java.lang.String codProv;
    
    @Column(name = "cod_dist")
    private java.lang.String codDist;
    
    @Column(name = "cod_ubigeo")
    private java.lang.String codUbigeo;
    
    @Column(name = "nombre")
    private java.lang.String nombre;
    
 
    public  CatUbigeo(){

    }
    public java.lang.Integer getIdUbigeo(){
        return this.idUbigeo;
    }
    public void setIdUbigeo(java.lang.Integer idUbigeo){
        this.idUbigeo = idUbigeo;
    }
    public java.lang.String getCodDepa(){
        return this.codDepa;
    }
    public void setCodDepa(java.lang.String codDepa){
        this.codDepa = codDepa;
    }
    public java.lang.String getCodProv(){
        return this.codProv;
    }
    public void setCodProv(java.lang.String codProv){
        this.codProv = codProv;
    }
    public java.lang.String getCodDist(){
        return this.codDist;
    }
    public void setCodDist(java.lang.String codDist){
        this.codDist = codDist;
    }
    public java.lang.String getCodUbigeo(){
        return this.codUbigeo;
    }
    public void setCodUbigeo(java.lang.String codUbigeo){
        this.codUbigeo = codUbigeo;
    }
	public java.lang.String getNombre() {
		return nombre;
	}
	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}
}