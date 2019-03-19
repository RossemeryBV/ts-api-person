package com.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.person.entity.MaeEmpr;


public interface MaeEmprService{

    public abstract List<MaeEmpr> listAll();

    public abstract MaeEmpr add(MaeEmpr maeEmpr);

    public abstract int remove(int id);

    public abstract MaeEmpr update(MaeEmpr maeEmpr);

    public abstract MaeEmpr findOne(java.lang.Integer idEmpresa);

    public abstract List<MaeEmpr> findByRuc(java.lang.String ruc);

    public abstract List<MaeEmpr> findByRazonSocial(java.lang.String razonSocial);

    public abstract List<MaeEmpr> findByDireccion(java.lang.String direccion);

    public abstract List<MaeEmpr> findByTipoEmpr(java.lang.String tipoEmpr);

    public abstract List<MaeEmpr> findByCoordenada(java.lang.String coordenada);

}