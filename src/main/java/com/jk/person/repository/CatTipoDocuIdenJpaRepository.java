package com.jk.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.jk.person.entity.CatTipoDocuIden;

@Repository("catTipoDocuIdenJpaRepository")
public interface CatTipoDocuIdenJpaRepository extends JpaRepository<CatTipoDocuIden, Serializable>{

    public abstract List<CatTipoDocuIden> findByCodTipoDocuIden(java.lang.String codTipoDocuIden);

    public abstract List<CatTipoDocuIden> findByDescTipoDocuIden(java.lang.String descTipoDocuIden);

    public abstract List<CatTipoDocuIden> findByIndActivo(java.lang.String indActivo);

}