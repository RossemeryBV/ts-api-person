package com.jk.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jk.person.entity.MaeEmpr;
import com.jk.person.repository.MaeEmprJpaRepository;
import com.jk.person.service.MaeEmprService;

@Service("maeEmprServiceImpl")
public class MaeEmprServiceImpl implements MaeEmprService{

    @Autowired
    @Qualifier("maeEmprJpaRepository")
    private MaeEmprJpaRepository maeEmprJpaRepository;

    @Override
    public List<MaeEmpr> listAll(){
        return maeEmprJpaRepository.findAll();
    }
    @Override
    public MaeEmpr add(MaeEmpr maeEmpr){
        return maeEmprJpaRepository.save(maeEmpr);
    }
    @Override
    public int remove(int id){
        //maeEmprJpaRepository.delete(id);
        return 0;
    }
    @Override
    public MaeEmpr update(MaeEmpr maeEmpr){
        return maeEmprJpaRepository.save(maeEmpr);
    }
    @Override
    public MaeEmpr findOne(java.lang.Integer idEmpresa){
        return null;//maeEmprJpaRepository.findOne(idEmpresa);
    }
    @Override
    public List<MaeEmpr> findByRuc(java.lang.String ruc){
        return maeEmprJpaRepository.findByRuc(ruc);
    }
    @Override
    public List<MaeEmpr> findByRazonSocial(java.lang.String razonSocial){
        return maeEmprJpaRepository.findByRazonSocial(razonSocial);
    }
    @Override
    public List<MaeEmpr> findByDireccion(java.lang.String direccion){
        return maeEmprJpaRepository.findByDireccion(direccion);
    }
    @Override
    public List<MaeEmpr> findByTipoEmpr(java.lang.String tipoEmpr){
        return maeEmprJpaRepository.findByTipoEmpr(tipoEmpr);
    }
    @Override
    public List<MaeEmpr> findByCoordenada(java.lang.String coordenada){
        return maeEmprJpaRepository.findByCoordenada(coordenada);
    }
}