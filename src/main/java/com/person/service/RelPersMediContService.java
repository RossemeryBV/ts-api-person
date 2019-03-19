package com.person.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.person.entity.RelPersMediCont;
import com.person.entity.RelPersMediContKey;


public interface RelPersMediContService{

    public abstract List<RelPersMediCont> listAll();

    public abstract RelPersMediCont add(RelPersMediCont relPersMediCont);

    public abstract int remove(int id);

    public abstract RelPersMediCont update(RelPersMediCont relPersMediCont);

    public abstract Optional<RelPersMediCont> findOne(RelPersMediContKey key);

    public abstract List<RelPersMediCont> findByIndPrincipal(java.lang.String indPrincipal);

    public abstract List<RelPersMediCont> findByIndActivo(java.lang.String indActivo);

}