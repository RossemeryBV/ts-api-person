package com.person.entity;

import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rel_empr_pers")
@IdClass(value = RelEmprPersKey.class)

public class RelEmprPers implements Serializable{

    @Id    
    @Column(name = "id_empresa")
    private java.lang.Integer idEmpresa;
    @Id    
    @Column(name = "id_pers_natu")
    private java.lang.Integer idPersNatu;
    
    
    @Column(name = "ind_resp")
    private java.lang.String indResp;

    public  RelEmprPers(){

    }
    public java.lang.Integer getIdEmpresa(){
        return this.idEmpresa;
    }
    public void setIdEmpresa(java.lang.Integer idEmpresa){
        this.idEmpresa = idEmpresa;
    }
    public java.lang.Integer getIdPersNatu(){
        return this.idPersNatu;
    }
    public void setIdPersNatu(java.lang.Integer idPersNatu){
        this.idPersNatu = idPersNatu;
    }
    public java.lang.String getIndResp(){
        return this.indResp;
    }
    public void setIndResp(java.lang.String indResp){
        this.indResp = indResp;
    }
}