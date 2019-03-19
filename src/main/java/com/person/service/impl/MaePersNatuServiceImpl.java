package com.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.person.entity.MaePersNatu;
import com.person.repository.MaePersNatuJpaRepository;
import com.person.service.MaePersNatuService;

@Service("maePersNatuServiceImpl")
public class MaePersNatuServiceImpl implements MaePersNatuService{

    @Autowired
    @Qualifier("maePersNatuJpaRepository")
    private MaePersNatuJpaRepository maePersNatuJpaRepository;

    @Override
    public List<MaePersNatu> listAll(){
        return maePersNatuJpaRepository.findAll();
    }
    @Override
    public MaePersNatu add(MaePersNatu maePersNatu){
        return maePersNatuJpaRepository.save(maePersNatu);
    }
    @Override
    public int remove(int id){
        //maePersNatuJpaRepository.delete(id);
        return 0;
    }
    @Override
    public MaePersNatu update(MaePersNatu maePersNatu){
        return maePersNatuJpaRepository.save(maePersNatu);
    }
    @Override
    public MaePersNatu findOne(java.lang.Integer idPers){
        return null;//maePersNatuJpaRepository.findOne(idPers);
    }
    @Override
    public List<MaePersNatu> findByNombre(java.lang.String nombre){
        return maePersNatuJpaRepository.findByNombre(nombre);
    }
    @Override
    public List<MaePersNatu> findByApeMat(java.lang.String apeMat){
        return maePersNatuJpaRepository.findByApeMat(apeMat);
    }
    @Override
    public List<MaePersNatu> findByApePat(java.lang.String apePat){
        return maePersNatuJpaRepository.findByApePat(apePat);
    }
}