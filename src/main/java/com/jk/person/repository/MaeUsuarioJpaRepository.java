package com.jk.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import com.jk.person.entity.MaeUsuario;

@Repository("maeUsuarioJpaRepository")
public interface MaeUsuarioJpaRepository extends JpaRepository<MaeUsuario, Serializable>{

    public abstract List<MaeUsuario> findByLogin(java.lang.String login);

    public abstract List<MaeUsuario> findByPassword(java.lang.String password);

}