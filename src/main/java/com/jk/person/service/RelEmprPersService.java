package com.jk.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.jk.person.entity.RelEmprPers;


public interface RelEmprPersService{

    public abstract List<RelEmprPers> listAll();

    public abstract RelEmprPers add(RelEmprPers relEmprPers);

    public abstract int remove(int id);

    public abstract RelEmprPers update(RelEmprPers relEmprPers);

    public abstract RelEmprPers findOne(java.lang.Integer idEmpresa);

    public abstract List<RelEmprPers> findByIndResp(java.lang.String indResp);

}