package com.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.person.entity.CatUbigeo;


public interface CatUbigeoService{

    public abstract List<CatUbigeo> listAll();

    public abstract CatUbigeo add(CatUbigeo catUbigeo);

    public abstract int remove(int id);

    public abstract CatUbigeo update(CatUbigeo catUbigeo);

    public abstract CatUbigeo findOne(java.lang.Integer idUbigeo);

    public abstract List<CatUbigeo> findByCodDepa(java.lang.String codDepa);

    public abstract List<CatUbigeo> findByCodProv(java.lang.String codProv);

    public abstract List<CatUbigeo> findByCodDist(java.lang.String codDist);

    public abstract List<CatUbigeo> findByCodUbigeo(java.lang.String codUbigeo);

}