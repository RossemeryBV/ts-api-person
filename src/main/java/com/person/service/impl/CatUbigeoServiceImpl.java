package com.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.person.entity.CatUbigeo;
import com.person.repository.CatUbigeoJpaRepository;
import com.person.service.CatUbigeoService;

@Service("catUbigeoServiceImpl")
public class CatUbigeoServiceImpl implements CatUbigeoService{

    @Autowired
    @Qualifier("catUbigeoJpaRepository")
    private CatUbigeoJpaRepository catUbigeoJpaRepository;

    @Override
    public List<CatUbigeo> listAll(){
        return catUbigeoJpaRepository.findAll();
    }
    @Override
    public CatUbigeo add(CatUbigeo catUbigeo){
        return catUbigeoJpaRepository.save(catUbigeo);
    }
    @Override
    public int remove(int id){
        //catUbigeoJpaRepository.delete(id);
        return 0;
    }
    @Override
    public CatUbigeo update(CatUbigeo catUbigeo){
        return catUbigeoJpaRepository.save(catUbigeo);
    }
    @Override
    public CatUbigeo findOne(java.lang.Integer idUbigeo){
        return null;//catUbigeoJpaRepository.findOne(idUbigeo);
    }
    @Override
    public List<CatUbigeo> findByCodDepa(java.lang.String codDepa){
        return catUbigeoJpaRepository.findByCodDepa(codDepa);
    }
    @Override
    public List<CatUbigeo> findByCodProv(java.lang.String codProv){
        return catUbigeoJpaRepository.findByCodProv(codProv);
    }
    @Override
    public List<CatUbigeo> findByCodDist(java.lang.String codDist){
        return catUbigeoJpaRepository.findByCodDist(codDist);
    }
    @Override
    public List<CatUbigeo> findByCodUbigeo(java.lang.String codUbigeo){
        return catUbigeoJpaRepository.findByCodUbigeo(codUbigeo);
    }
}