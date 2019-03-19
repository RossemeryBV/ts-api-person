package com.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.person.entity.CatTipoDocuIden;


public interface CatTipoDocuIdenService{

    public abstract List<CatTipoDocuIden> listAll();

    public abstract CatTipoDocuIden add(CatTipoDocuIden catTipoDocuIden);

    public abstract int remove(int id);

    public abstract CatTipoDocuIden update(CatTipoDocuIden catTipoDocuIden);

    public abstract CatTipoDocuIden findOne(java.lang.Integer idTipoDocuIden);

    public abstract List<CatTipoDocuIden> findByCodTipoDocuIden(java.lang.String codTipoDocuIden);

    public abstract List<CatTipoDocuIden> findByDescTipoDocuIden(java.lang.String descTipoDocuIden);

    public abstract List<CatTipoDocuIden> findByIndActivo(java.lang.String indActivo);

}