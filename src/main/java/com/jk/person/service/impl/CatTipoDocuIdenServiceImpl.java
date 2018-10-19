package com.jk.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jk.person.entity.CatTipoDocuIden;
import com.jk.person.repository.CatTipoDocuIdenJpaRepository;
import com.jk.person.service.CatTipoDocuIdenService;

@Service("catTipoDocuIdenServiceImpl")
public class CatTipoDocuIdenServiceImpl implements CatTipoDocuIdenService{

    @Autowired
    @Qualifier("catTipoDocuIdenJpaRepository")
    private CatTipoDocuIdenJpaRepository catTipoDocuIdenJpaRepository;

    @Override
    public List<CatTipoDocuIden> listAll(){
        return catTipoDocuIdenJpaRepository.findAll();
    }
    @Override
    public CatTipoDocuIden add(CatTipoDocuIden catTipoDocuIden){
        return catTipoDocuIdenJpaRepository.save(catTipoDocuIden);
    }
    @Override
    public int remove(int id){
        //catTipoDocuIdenJpaRepository.delete(id);
        return 0;
    }
    @Override
    public CatTipoDocuIden update(CatTipoDocuIden catTipoDocuIden){
        return catTipoDocuIdenJpaRepository.save(catTipoDocuIden);
    }
    @Override
    public CatTipoDocuIden findOne(java.lang.Integer idTipoDocuIden){
        return null;//catTipoDocuIdenJpaRepository.findOne(idTipoDocuIden);
    }
    @Override
    public List<CatTipoDocuIden> findByCodTipoDocuIden(java.lang.String codTipoDocuIden){
        return catTipoDocuIdenJpaRepository.findByCodTipoDocuIden(codTipoDocuIden);
    }
    @Override
    public List<CatTipoDocuIden> findByDescTipoDocuIden(java.lang.String descTipoDocuIden){
        return catTipoDocuIdenJpaRepository.findByDescTipoDocuIden(descTipoDocuIden);
    }
    @Override
    public List<CatTipoDocuIden> findByIndActivo(java.lang.String indActivo){
        return catTipoDocuIdenJpaRepository.findByIndActivo(indActivo);
    }
}