package com.jk.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jk.person.entity.MaePers;
import com.jk.person.repository.MaePersJpaRepository;
import com.jk.person.service.MaePersService;

@Service("maePersServiceImpl")
public class MaePersServiceImpl implements MaePersService{

    @Autowired
    @Qualifier("maePersJpaRepository")
    private MaePersJpaRepository maePersJpaRepository;

    @Override
    public List<MaePers> listAll(){
        return maePersJpaRepository.findAll();
    }
    @Override
    public MaePers add(MaePers maePers){
        return maePersJpaRepository.save(maePers);
    }
    @Override
    public int remove(int id){
        //maePersJpaRepository.delete(id);
        return 0;
    }
    @Override
    public MaePers update(MaePers maePers){
        return maePersJpaRepository.save(maePers);
    }
    @Override
    public MaePers findOne(java.lang.Integer idPers){
        return null;//maePersJpaRepository.findOne(idPers);
    }
    @Override
    public List<MaePers> findByIndActivo(java.lang.String indActivo){
        return maePersJpaRepository.findByIndActivo(indActivo);
    }
}