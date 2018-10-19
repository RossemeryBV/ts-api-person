package com.jk.person.entity;

import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mae_usuario")
public class MaeUsuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pers")
    private java.lang.Integer idPers;
    @Column(name = "login")
    private java.lang.String login;
    @Column(name = "password")
    private java.lang.String password;

    public  MaeUsuario(){

    }
    public java.lang.Integer getIdPers(){
        return this.idPers;
    }
    public void setIdPers(java.lang.Integer idPers){
        this.idPers = idPers;
    }
    public java.lang.String getLogin(){
        return this.login;
    }
    public void setLogin(java.lang.String login){
        this.login = login;
    }
    public java.lang.String getPassword(){
        return this.password;
    }
    public void setPassword(java.lang.String password){
        this.password = password;
    }
}