package com.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.person.entity.CatCaliClien;

@Repository("catCaliClienJpaRepository")
public interface CatCaliClienJpaRepository extends JpaRepository<CatCaliClien, Serializable>{

    public abstract List<CatCaliClien> findByCodCaliClien(java.lang.String codCaliClien);

    public abstract List<CatCaliClien> findByDescCaliClien(java.lang.String descCaliClien);

}