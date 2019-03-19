package com.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.person.entity.RelPersMediCont;
import com.person.entity.RelPersMediContKey;
import com.person.repository.RelPersMediContJpaRepository;
import com.person.service.RelPersMediContService;

@Service("relPersMediContServiceImpl")
public class RelPersMediContServiceImpl implements RelPersMediContService{

    @Autowired
    @Qualifier("relPersMediContJpaRepository")
    private RelPersMediContJpaRepository relPersMediContJpaRepository;

    @Override
    public List<RelPersMediCont> listAll(){
        return relPersMediContJpaRepository.findAll();
    }
    @Override
    public RelPersMediCont add(RelPersMediCont relPersMediCont){
        return relPersMediContJpaRepository.save(relPersMediCont);
    }
    
    @Override
    public int remove(int id){
        //relPersMediContJpaRepository.delete(id);
        return 0;
    }
    @Override
    public RelPersMediCont update(RelPersMediCont relPersMediCont){
        return relPersMediContJpaRepository.save(relPersMediCont);
    }
    
    @Override
    public Optional<RelPersMediCont> findOne(RelPersMediContKey key){
        return relPersMediContJpaRepository.findById(key);
    }
    
    @Override
    public List<RelPersMediCont> findByIndPrincipal(java.lang.String indPrincipal){
        return relPersMediContJpaRepository.findByIndPrincipal(indPrincipal);
    }
    @Override
    public List<RelPersMediCont> findByIndActivo(java.lang.String indActivo){
        return relPersMediContJpaRepository.findByIndActivo(indActivo);
    }
}