package com.jk.person.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.jk.person.entity.MaePersNatu;
import com.jk.person.service.MaePersNatuService;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/maepersnatu")
public class MaePersNatuController{

    @Autowired
    @Qualifier("maePersNatuServiceImpl")
    private MaePersNatuService maePersNatuService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<MaePersNatu> apiGet(){
        List<MaePersNatu> maePersNatus =maePersNatuService.listAll();
        return maePersNatus;
    }
    @RequestMapping(value = "/nombre/{nombre}", method = RequestMethod.GET)
    public @ResponseBody List<MaePersNatu> buscarXNombre(@PathVariable java.lang.String nombre){
        List<MaePersNatu> maePersNatus =maePersNatuService.findByNombre(nombre);
        return maePersNatus;
    }
    @RequestMapping(value = "/apemat/{apemat}", method = RequestMethod.GET)
    public @ResponseBody List<MaePersNatu> buscarXApeMat(@PathVariable java.lang.String apemat){
        List<MaePersNatu> maePersNatus =maePersNatuService.findByApeMat(apemat);
        return maePersNatus;
    }
    @RequestMapping(value = "/apepat/{apepat}", method = RequestMethod.GET)
    public @ResponseBody List<MaePersNatu> buscarXApePat(@PathVariable java.lang.String apepat){
        List<MaePersNatu> maePersNatus =maePersNatuService.findByApePat(apepat);
        return maePersNatus;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody MaePersNatu maePersNatu, UriComponentsBuilder ucBuilder){
        maePersNatuService.add(maePersNatu);
        return null;
    }
}