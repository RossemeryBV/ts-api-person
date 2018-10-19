package com.jk.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.jk.person.entity.CatTipoComp;

@Repository("catTipoCompJpaRepository")
public interface CatTipoCompJpaRepository extends JpaRepository<CatTipoComp, Serializable>{

    public abstract List<CatTipoComp> findByCodTipoComp(java.lang.String codTipoComp);

    public abstract List<CatTipoComp> findByDescComp(java.lang.String descComp);

    public abstract List<CatTipoComp> findByIndActivo(java.lang.String indActivo);

}