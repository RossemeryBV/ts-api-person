package com.person.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rel_pers_medi_cont")
@IdClass(value = RelPersMediContKey.class)
public class RelPersMediCont implements Serializable{

	  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pers", insertable=false, updatable=false)
    private MaePers maePers;
    
	    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_medi_cont", insertable=false, updatable=false)
    private CatTipoMediCont catTipoMediCont;
    
	@Id    
    @Column(name = "valor_medio_contacto")
    private java.lang.String valorMedioContacto;
    
    @Id 
    @Column(name = "id_pers")
    private java.lang.Integer idPers;
    
    @Id
    @Column(name = "id_tipo_medi_cont")
    private java.lang.Integer idTipoMediCont;
    
    @Column(name = "ind_principal")
    private java.lang.String indPrincipal;
    
    @Column(name = "ind_activo", insertable=false)
    private java.lang.String indActivo;

    public  RelPersMediCont(){

    }
   
    
    public CatTipoMediCont getCatTipoMediCont() {
		return catTipoMediCont;
	}
	public void setCatTipoMediCont(CatTipoMediCont catTipoMediCont) {
		this.catTipoMediCont = catTipoMediCont;
	}
	
	public java.lang.String getValorMedioContacto(){
        return this.valorMedioContacto;
    }
    public void setValorMedioContacto(java.lang.String valorMedioContacto){
        this.valorMedioContacto = valorMedioContacto;
    }
    
    public java.lang.String getIndActivo(){
        return this.indActivo;
    }
    public void setIndActivo(java.lang.String indActivo){
        this.indActivo = indActivo;
    }
	public java.lang.String getIndPrincipal() {
		return indPrincipal;
	}
	public void setIndPrincipal(java.lang.String indPrincipal) {
		this.indPrincipal = indPrincipal;
	}

	public MaePers getMaePers() {
		return maePers;
	}

	public void setMaePers(MaePers maePers) {
		this.maePers = maePers;
	}


	public java.lang.Integer getIdPers() {
		return idPers;
	}


	public void setIdPers(java.lang.Integer idPers) {
		this.idPers = idPers;
	}


	public java.lang.Integer getIdTipoMediCont() {
		return idTipoMediCont;
	}


	public void setIdTipoMediCont(java.lang.Integer idTipoMediCont) {
		this.idTipoMediCont = idTipoMediCont;
	}

	
	
    
	
    
}