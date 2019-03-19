package com.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.person.entity.CatDocEnti;
import com.person.repository.CatDocEntiJpaRepository;
import com.person.service.CatDocEntiService;

@Service("catDocEntiServiceImpl")
public class CatDocEntiServiceImpl implements CatDocEntiService{

    @Autowired
    @Qualifier("catDocEntiJpaRepository")
    private CatDocEntiJpaRepository catDocEntiJpaRepository;

    @Override
    public List<CatDocEnti> listAll(){
        return catDocEntiJpaRepository.findAll();
    }
    @Override
    public CatDocEnti add(CatDocEnti catDocEnti){
        return catDocEntiJpaRepository.save(catDocEnti);
    }
    @Override
    public int remove(int id){
        //catDocEntiJpaRepository.delete(id);
        return 0;
    }
    @Override
    public CatDocEnti update(CatDocEnti catDocEnti){
        return catDocEntiJpaRepository.save(catDocEnti);
    }
    @Override
    public CatDocEnti findOne(java.lang.Integer idDocuEnti){
        return null;//catDocEntiJpaRepository.findOne(idDocuEnti);
    }
    @Override
    public List<CatDocEnti> findByCatDocuEnti(java.lang.String catDocuEnti){
        return catDocEntiJpaRepository.findByCatDocuEnti(catDocuEnti);
    }
    @Override
    public List<CatDocEnti> findByDescDocuEnti(java.lang.String descDocuEnti){
        return catDocEntiJpaRepository.findByDescDocuEnti(descDocuEnti);
    }
    @Override
    public List<CatDocEnti> findByIndActivo(java.lang.String indActivo){
        return catDocEntiJpaRepository.findByIndActivo(indActivo);
    }
}