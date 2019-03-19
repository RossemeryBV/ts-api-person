package com.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.person.entity.MaeEmpr;

@Repository("maeEmprJpaRepository")
public interface MaeEmprJpaRepository extends JpaRepository<MaeEmpr, Serializable>{

    public abstract List<MaeEmpr> findByRuc(java.lang.String ruc);

    public abstract List<MaeEmpr> findByRazonSocial(java.lang.String razonSocial);

    public abstract List<MaeEmpr> findByDireccion(java.lang.String direccion);

    public abstract List<MaeEmpr> findByTipoEmpr(java.lang.String tipoEmpr);

    public abstract List<MaeEmpr> findByCoordenada(java.lang.String coordenada);

}