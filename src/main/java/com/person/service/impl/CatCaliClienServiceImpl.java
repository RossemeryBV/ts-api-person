package com.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.person.entity.CatCaliClien;
import com.person.repository.CatCaliClienJpaRepository;
import com.person.service.CatCaliClienService;

@Service("catCaliClienServiceImpl")
public class CatCaliClienServiceImpl implements CatCaliClienService{

    @Autowired
    @Qualifier("catCaliClienJpaRepository")
    private CatCaliClienJpaRepository catCaliClienJpaRepository;

    @Override
    public List<CatCaliClien> listAll(){
        return catCaliClienJpaRepository.findAll();
    }
    @Override
    public CatCaliClien add(CatCaliClien catCaliClien){
        return catCaliClienJpaRepository.save(catCaliClien);
    }
    @Override
    public int remove(CatCaliClien id){
        catCaliClienJpaRepository.delete(id); 
        return 0;
    }
    @Override
    public CatCaliClien update(CatCaliClien catCaliClien){
        return catCaliClienJpaRepository.save(catCaliClien);
    }
    @Override
    public CatCaliClien findOne(java.lang.Integer idCaliClien){
        return null;//catCaliClienJpaRepository.findOne(idCaliClien);
    }
    @Override
    public List<CatCaliClien> findByCodCaliClien(java.lang.String codCaliClien){
        return catCaliClienJpaRepository.findByCodCaliClien(codCaliClien);
    }
    @Override
    public List<CatCaliClien> findByDescCaliClien(java.lang.String descCaliClien){
        return catCaliClienJpaRepository.findByDescCaliClien(descCaliClien);
    }
}