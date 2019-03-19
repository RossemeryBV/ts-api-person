package com.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.person.entity.CatDocEnti;

@Repository("catDocEntiJpaRepository")
public interface CatDocEntiJpaRepository extends JpaRepository<CatDocEnti, Serializable>{

    public abstract List<CatDocEnti> findByCatDocuEnti(java.lang.String catDocuEnti);

    public abstract List<CatDocEnti> findByDescDocuEnti(java.lang.String descDocuEnti);

    public abstract List<CatDocEnti> findByIndActivo(java.lang.String indActivo);

}