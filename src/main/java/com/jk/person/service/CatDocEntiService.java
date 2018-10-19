package com.jk.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.jk.person.entity.CatDocEnti;


public interface CatDocEntiService{

    public abstract List<CatDocEnti> listAll();

    public abstract CatDocEnti add(CatDocEnti catDocEnti);

    public abstract int remove(int id);

    public abstract CatDocEnti update(CatDocEnti catDocEnti);

    public abstract CatDocEnti findOne(java.lang.Integer idDocuEnti);

    public abstract List<CatDocEnti> findByCatDocuEnti(java.lang.String catDocuEnti);

    public abstract List<CatDocEnti> findByDescDocuEnti(java.lang.String descDocuEnti);

    public abstract List<CatDocEnti> findByIndActivo(java.lang.String indActivo);

}