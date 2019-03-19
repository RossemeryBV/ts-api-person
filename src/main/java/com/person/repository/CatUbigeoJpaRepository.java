package com.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.person.entity.CatUbigeo;

@Repository("catUbigeoJpaRepository")
public interface CatUbigeoJpaRepository extends JpaRepository<CatUbigeo, Serializable>{

    public abstract List<CatUbigeo> findByCodDepa(java.lang.String codDepa);

    public abstract List<CatUbigeo> findByCodProv(java.lang.String codProv);

    public abstract List<CatUbigeo> findByCodDist(java.lang.String codDist);

    public abstract List<CatUbigeo> findByCodUbigeo(java.lang.String codUbigeo);

}