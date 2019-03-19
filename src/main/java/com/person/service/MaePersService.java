package com.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.person.entity.MaePers;


public interface MaePersService{

    public abstract List<MaePers> listAll();

    public abstract MaePers add(MaePers maePers);

    public abstract int remove(int id);

    public abstract MaePers update(MaePers maePers);

    public abstract MaePers findOne(java.lang.Integer idPers);

    public abstract List<MaePers> findByIndActivo(java.lang.String indActivo);

}