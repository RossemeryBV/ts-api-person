package com.jk.person.entity;

import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "mae_clie")
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@DynamicUpdate
public class MaeClie implements Serializable{

    @Id
    @Column(name = "id_clie")
    private java.lang.Integer idClie;
    
    @ManyToOne
    @JoinColumn(name = "zona")
    private CatUbigeo catUbigeo; 
    
    @ManyToOne
    @JoinColumn(name = "id_cali_clien")
    private CatCaliClien catCaliClien;
    
    @Column(name = "direccion")
    private java.lang.String direccion;
    
    @Column(name = "coordenada")
    private java.lang.String coordenada;
    
    
    @Column(name = "ind_activo", insertable=false)
    private java.lang.String indActivo;
    
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL) // cascade ALL, para q funcione el update. y actualize persnatu
    @JoinColumn(name = "idClie")
    private MaePersNatu maePersNatu;

    public  MaeClie(){
    	super();
    }
    
    public java.lang.Integer getIdClie(){
        return this.idClie;
    }
    public void setIdClie(java.lang.Integer idClie){
        this.idClie = idClie;
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
    public java.lang.String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(java.lang.String direccion){
        this.direccion = direccion;
    }
    public java.lang.String getCoordenada(){
        return this.coordenada;
    }
    public void setCoordenada(java.lang.String coordenada){
        this.coordenada = coordenada;
    }
	public MaePersNatu getMaePersNatu() {
		return maePersNatu;
	}
	public void setMaePersNatu(MaePersNatu maePersNatu) {
		this.maePersNatu = maePersNatu;
	}

	public java.lang.String getIndActivo() {
		return indActivo;
	}

	public void setIndActivo(java.lang.String indActivo) {
		this.indActivo = indActivo;
	}
    
	
    
}