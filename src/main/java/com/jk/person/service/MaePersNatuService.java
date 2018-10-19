package com.jk.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.jk.person.entity.MaePersNatu;


public interface MaePersNatuService{

    public abstract List<MaePersNatu> listAll();

    public abstract MaePersNatu add(MaePersNatu maePersNatu);

    public abstract int remove(int id);

    public abstract MaePersNatu update(MaePersNatu maePersNatu);

    public abstract MaePersNatu findOne(java.lang.Integer idPers);

    public abstract List<MaePersNatu> findByNombre(java.lang.String nombre);

    public abstract List<MaePersNatu> findByApeMat(java.lang.String apeMat);

    public abstract List<MaePersNatu> findByApePat(java.lang.String apePat);

}