package com.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.person.entity.MaeUsuario;
import com.person.repository.MaeUsuarioJpaRepository;
import com.person.service.MaeUsuarioService;

@Service("maeUsuarioServiceImpl")
public class MaeUsuarioServiceImpl implements MaeUsuarioService{

    @Autowired
    @Qualifier("maeUsuarioJpaRepository")
    private MaeUsuarioJpaRepository maeUsuarioJpaRepository;

    @Override
    public List<MaeUsuario> listAll(){
        return maeUsuarioJpaRepository.findAll();
    }
    @Override
    public MaeUsuario add(MaeUsuario maeUsuario){
        return maeUsuarioJpaRepository.save(maeUsuario);
    }
    @Override
    public int remove(int id){
        //maeUsuarioJpaRepository.delete(id);
        return 0;
    }
    @Override
    public MaeUsuario update(MaeUsuario maeUsuario){
        return maeUsuarioJpaRepository.save(maeUsuario);
    }
    @Override
    public MaeUsuario findOne(java.lang.Integer idPers){
        return null;//maeUsuarioJpaRepository.findOne(idPers);
    }
    @Override
    public List<MaeUsuario> findByLogin(java.lang.String login){
        return maeUsuarioJpaRepository.findByLogin(login);
    }
    @Override
    public List<MaeUsuario> findByPassword(java.lang.String password){
        return maeUsuarioJpaRepository.findByPassword(password);
    }
}