package com.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.person.entity.RelEmprPers;

@Repository("relEmprPersJpaRepository")
public interface RelEmprPersJpaRepository extends JpaRepository<RelEmprPers, Serializable>{

    public abstract List<RelEmprPers> findByIndResp(java.lang.String indResp);

}