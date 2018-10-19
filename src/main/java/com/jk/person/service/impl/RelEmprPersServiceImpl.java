package com.jk.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jk.person.entity.RelEmprPers;
import com.jk.person.repository.RelEmprPersJpaRepository;
import com.jk.person.service.RelEmprPersService;

@Service("relEmprPersServiceImpl")
public class RelEmprPersServiceImpl implements RelEmprPersService{

    @Autowired
    @Qualifier("relEmprPersJpaRepository")
    private RelEmprPersJpaRepository relEmprPersJpaRepository;

    @Override
    public List<RelEmprPers> listAll(){
        return relEmprPersJpaRepository.findAll();
    }
    @Override
    public RelEmprPers add(RelEmprPers relEmprPers){
        return relEmprPersJpaRepository.save(relEmprPers);
    }
    @Override
    public int remove(int id){
        //relEmprPersJpaRepository.delete(id);
        return 0;
    }
    @Override
    public RelEmprPers update(RelEmprPers relEmprPers){
        return relEmprPersJpaRepository.save(relEmprPers);
    }
    @Override
    public RelEmprPers findOne(java.lang.Integer idEmpresa){
        return null;//relEmprPersJpaRepository.findOne(idEmpresa);
    }
    @Override
    public List<RelEmprPers> findByIndResp(java.lang.String indResp){
        return relEmprPersJpaRepository.findByIndResp(indResp);
    }
}