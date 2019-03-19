package com.person.entity;

import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jk
 *
 */
@Entity
@Table(name = "mae_pers")
public class MaePers implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pers")
    private java.lang.Integer idPers;
    
    @OneToMany(mappedBy="idPers" ,cascade = CascadeType.ALL, orphanRemoval = true)   
    //@JoinColumn(name = "id_pers")    
    //private Set<RelPersMediCont> persMediConts;
    private List<RelPersMediCont> persMediConts;
    
    @Column(name = "ind_activo", insertable=false)
    private java.lang.String indActivo;

    public  MaePers(){

    }
    
    public java.lang.Integer getIdPers(){
        return this.idPers;
    }
    
    public void setIdPers(java.lang.Integer idPers){
        this.idPers = idPers;
    }
    
    public java.lang.String getIndActivo(){
        return this.indActivo;
    }
    public void setIndActivo(java.lang.String indActivo){
        this.indActivo = indActivo;
    }

	public List<RelPersMediCont> getPersMediConts() {
		return persMediConts;
	}

	public void setPersMediConts(List<RelPersMediCont> persMediConts) {
		this.persMediConts = persMediConts;
	}
	
    
    
    
}