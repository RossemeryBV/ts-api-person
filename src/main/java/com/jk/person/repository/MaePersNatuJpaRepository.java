package com.jk.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.jk.person.entity.MaePersNatu;

@Repository("maePersNatuJpaRepository")
public interface MaePersNatuJpaRepository extends JpaRepository<MaePersNatu, Serializable>{

    public abstract List<MaePersNatu> findByNombre(java.lang.String nombre);

    public abstract List<MaePersNatu> findByApeMat(java.lang.String apeMat);

    public abstract List<MaePersNatu> findByApePat(java.lang.String apePat);

}