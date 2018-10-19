package com.jk.person.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.jk.person.entity.MaeUsuario;


public interface MaeUsuarioService{

    public abstract List<MaeUsuario> listAll();

    public abstract MaeUsuario add(MaeUsuario maeUsuario);

    public abstract int remove(int id);

    public abstract MaeUsuario update(MaeUsuario maeUsuario);

    public abstract MaeUsuario findOne(java.lang.Integer idPers);

    public abstract List<MaeUsuario> findByLogin(java.lang.String login);

    public abstract List<MaeUsuario> findByPassword(java.lang.String password);

}