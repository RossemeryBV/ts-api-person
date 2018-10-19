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

import com.jk.person.entity.MaePers;
import com.jk.person.service.MaePersService;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/maepers")
public class MaePersController{

    @Autowired
    @Qualifier("maePersServiceImpl")
    private MaePersService maePersService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<MaePers> apiGet(){
        List<MaePers> maePerss =maePersService.listAll();
        return maePerss;
    }
    @RequestMapping(value = "/indactivo/{indactivo}", method = RequestMethod.GET)
    public @ResponseBody List<MaePers> buscarXIndActivo(@PathVariable java.lang.String indactivo){
        List<MaePers> maePerss =maePersService.findByIndActivo(indactivo);
        return maePerss;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody MaePers maePers, UriComponentsBuilder ucBuilder){
        maePersService.add(maePers);
        return null;
    }
}