package com.jk.person.entity;

import javax.persistence.GenerationType;
import javax.persistence.CascadeType;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Set;
import javax.persistence.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mae_empr")
public class MaeEmpr implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empresa")
    private java.lang.Integer idEmpresa;
    @ManyToOne
    @JoinColumn(name = "zona")
    private CatUbigeo catUbigeo;
    @ManyToOne
    @JoinColumn(name = "id_cali")
    private CatCaliClien catCaliClien;
    @Column(name = "ruc")
    private java.lang.String ruc;
    @Column(name = "razon_social")
    private java.lang.String razonSocial;
    @Column(name = "direccion")
    private java.lang.String direccion;
    @Column(name = "tipo_empr")
    private java.lang.String tipoEmpr;
    @Column(name = "coordenada")
    private java.lang.String coordenada;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "relEmprPerss")
    private Set<RelEmprPers> relEmprPerss;
    
    @Column(name = "ind_activo", insertable=false)
    private java.lang.String indActivo;

    public  MaeEmpr(){

    }
    public java.lang.Integer getIdEmpresa(){
        return this.idEmpresa;
    }
    public void setIdEmpresa(java.lang.Integer idEmpresa){
        this.idEmpresa = idEmpresa;
    }
    public CatUbigeo getCatUbigeo(){
        return this.catUbigeo;
    }
    public void setCatUbigeo(CatUbigeo catUbigeo){
        this.catUbigeo = catUbigeo;
    }
    public CatCaliClien getCatCaliClien(){
        return this.catCaliClien;
    }
    public void setCatCaliClien(CatCaliClien catCaliClien){
        this.catCaliClien = catCaliClien;
    }
    public java.lang.String getRuc(){
        return this.ruc;
    }
    public void setRuc(java.lang.String ruc){
        this.ruc = ruc;
    }
    public java.lang.String getRazonSocial(){
        return this.razonSocial;
    }
    public void setRazonSocial(java.lang.String razonSocial){
        this.razonSocial = razonSocial;
    }
    public java.lang.String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(java.lang.String direccion){
        this.direccion = direccion;
    }
    public java.lang.String getTipoEmpr(){
        return this.tipoEmpr;
    }
    public void setTipoEmpr(java.lang.String tipoEmpr){
        this.tipoEmpr = tipoEmpr;
    }
    public java.lang.String getCoordenada(){
        return this.coordenada;
    }
    public void setCoordenada(java.lang.String coordenada){
        this.coordenada = coordenada;
    }
    public Set<RelEmprPers> getRelEmprPerss(){
        return this.relEmprPerss;
    }
    public void setRelEmprPerss(Set<RelEmprPers> relEmprPerss){
        this.relEmprPerss = relEmprPerss;
    }
	public java.lang.String getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(java.lang.String indActivo) {
		this.indActivo = indActivo;
	}
    
    
}