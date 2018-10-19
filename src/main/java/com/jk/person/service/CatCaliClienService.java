package com.jk.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.jk.person.entity.CatCaliClien;


public interface CatCaliClienService{

    public abstract List<CatCaliClien> listAll();

    public abstract CatCaliClien add(CatCaliClien catCaliClien);

    public abstract int remove(CatCaliClien id);

    public abstract CatCaliClien update(CatCaliClien catCaliClien);

    public abstract CatCaliClien findOne(java.lang.Integer idCaliClien);

    public abstract List<CatCaliClien> findByCodCaliClien(java.lang.String codCaliClien);

    public abstract List<CatCaliClien> findByDescCaliClien(java.lang.String descCaliClien);

}