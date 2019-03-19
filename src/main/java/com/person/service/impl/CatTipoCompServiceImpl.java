package com.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.person.entity.CatTipoComp;
import com.person.repository.CatTipoCompJpaRepository;
import com.person.service.CatTipoCompService;

@Service("catTipoCompServiceImpl")
public class CatTipoCompServiceImpl implements CatTipoCompService{

    @Autowired
    @Qualifier("catTipoCompJpaRepository")
    private CatTipoCompJpaRepository catTipoCompJpaRepository;

    @Override
    public List<CatTipoComp> listAll(){
        return catTipoCompJpaRepository.findAll();
    }
    @Override
    public CatTipoComp add(CatTipoComp catTipoComp){
        return catTipoCompJpaRepository.save(catTipoComp);
    }
    @Override
    public int remove(int id){
        //catTipoCompJpaRepository.delete(id);
        return 0;
    }
    @Override
    public CatTipoComp update(CatTipoComp catTipoComp){
        return catTipoCompJpaRepository.save(catTipoComp);
    }
    @Override
    public CatTipoComp findOne(java.lang.Integer idTipoComp){
        return null;//catTipoCompJpaRepository.findOne(idTipoComp);
    }
    @Override
    public List<CatTipoComp> findByCodTipoComp(java.lang.String codTipoComp){
        return catTipoCompJpaRepository.findByCodTipoComp(codTipoComp);
    }
    @Override
    public List<CatTipoComp> findByDescComp(java.lang.String descComp){
        return catTipoCompJpaRepository.findByDescComp(descComp);
    }
    @Override
    public List<CatTipoComp> findByIndActivo(java.lang.String indActivo){
        return catTipoCompJpaRepository.findByIndActivo(indActivo);
    }
}