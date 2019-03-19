package com.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.person.entity.CatTipoComp;


public interface CatTipoCompService{

    public abstract List<CatTipoComp> listAll();

    public abstract CatTipoComp add(CatTipoComp catTipoComp);

    public abstract int remove(int id);

    public abstract CatTipoComp update(CatTipoComp catTipoComp);

    public abstract CatTipoComp findOne(java.lang.Integer idTipoComp);

    public abstract List<CatTipoComp> findByCodTipoComp(java.lang.String codTipoComp);

    public abstract List<CatTipoComp> findByDescComp(java.lang.String descComp);

    public abstract List<CatTipoComp> findByIndActivo(java.lang.String indActivo);

}