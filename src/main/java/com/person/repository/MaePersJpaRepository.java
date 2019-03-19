package com.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.person.entity.MaePers;

@Repository("maePersJpaRepository")
public interface MaePersJpaRepository extends JpaRepository<MaePers, Serializable>{

    public abstract List<MaePers> findByIndActivo(java.lang.String indActivo);

}