package com.jk.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.jk.person.entity.MaeClie;

@Repository("maeClieJpaRepository")
public interface MaeClieJpaRepository extends JpaRepository<MaeClie, Serializable>{

    public abstract List<MaeClie> findByDireccion(java.lang.String direccion);

    public abstract List<MaeClie> findByCoordenada(java.lang.String coordenada);
    
    public abstract List<MaeClie> findByIdClieAndIndActivo(Integer id, String indActivo);
    
    public abstract List<MaeClie> findByIndActivo(String indActivo);

}