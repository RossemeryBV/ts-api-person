package com.jk.person.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mae_pers_natu")
public class MaePersNatu implements Serializable{

    @Id    
    @Column(name = "id_pers")
    private java.lang.Integer idPers;
    
    @Column(name = "nombre")
    private java.lang.String nombre;
    @Column(name = "ape_mat")
    private java.lang.String apeMat;
    @Column(name = "ape_pat")
    private java.lang.String apePat;
    
    @Column(name = "num_docu")
    private java.lang.String numDocu;
    
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPers")
    private MaePers maePers;
    
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_doc_iden")
    private CatTipoDocuIden catTipoDocuIden; 
    
    /*
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "relEmprPerss")    
    private Set<RelEmprPers> relEmprPerss;*/
    
    @Column(name = "ind_activo", insertable=false)
    private java.lang.String indActivo;
        
    public  MaePersNatu(){

    }
    public java.lang.Integer getIdPers(){
        return this.idPers;
    }
    public void setIdPers(java.lang.Integer idPers){
        this.idPers = idPers;
    }
    public java.lang.String getNombre(){
        return this.nombre;
    }
    public void setNombre(java.lang.String nombre){
        this.nombre = nombre;
    }
    public java.lang.String getApeMat(){
        return this.apeMat;
    }
    public void setApeMat(java.lang.String apeMat){
        this.apeMat = apeMat;
    }
    public java.lang.String getApePat(){
        return this.apePat;
    }
    public void setApePat(java.lang.String apePat){
        this.apePat = apePat;
    }
    
    /*public Set<RelEmprPers> getRelEmprPerss(){
        return this.relEmprPerss;
    }
    public void setRelEmprPerss(Set<RelEmprPers> relEmprPerss){
        this.relEmprPerss = relEmprPerss;
    }
    public Set<RelPersNatuDocuIden> getRelPersNatuDocuIdens(){
        return this.relPersNatuDocuIdens;
    }
    public void setRelPersNatuDocuIdens(Set<RelPersNatuDocuIden> relPersNatuDocuIdens){
        this.relPersNatuDocuIdens = relPersNatuDocuIdens;
    }*/
    
	public MaePers getMaePers() {
		return maePers;
	}
	public void setMaePers(MaePers maePers) {
		this.maePers = maePers;
	}
	
	public CatTipoDocuIden getCatTipoDocuIden() {
		return catTipoDocuIden;
	}
	public void setCatTipoDocuIden(CatTipoDocuIden catTipoDocuIden) {
		this.catTipoDocuIden = catTipoDocuIden;
	}
	public java.lang.String getNumDocu() {
		return numDocu;
	}
	public void setNumDocu(java.lang.String numDocu) {
		this.numDocu = numDocu;
	}
	public java.lang.String getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(java.lang.String indActivo) {
		this.indActivo = indActivo;
	}
	
}