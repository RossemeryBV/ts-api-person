package com.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.person.entity.RelPersMediCont;

@Repository("relPersMediContJpaRepository")
public interface RelPersMediContJpaRepository extends JpaRepository<RelPersMediCont, Serializable>{

    public abstract List<RelPersMediCont> findByIndPrincipal(java.lang.String indPrincipal);

    public abstract List<RelPersMediCont> findByIndActivo(java.lang.String indActivo);

}