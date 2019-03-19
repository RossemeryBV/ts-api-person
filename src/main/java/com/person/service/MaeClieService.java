package com.person.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.person.entity.MaeClie;


public interface MaeClieService{

    public abstract List<MaeClie> listAll();

    public abstract MaeClie add(MaeClie maeClie);

    public abstract int remove(int id);

    public abstract MaeClie update(MaeClie maeClie);

    public abstract List<MaeClie> findOne(Integer cliente);

    public abstract List<MaeClie> findByDireccion(java.lang.String direccion);

    public abstract List<MaeClie> findByCoordenada(java.lang.String coordenada);
    
    public abstract List<MaeClie> listAllActives();

}