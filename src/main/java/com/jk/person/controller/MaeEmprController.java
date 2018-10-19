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

import com.jk.person.entity.MaeEmpr;
import com.jk.person.service.MaeEmprService;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/maeempr")
public class MaeEmprController{

    @Autowired
    @Qualifier("maeEmprServiceImpl")
    private MaeEmprService maeEmprService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<MaeEmpr> apiGet(){
        List<MaeEmpr> maeEmprs =maeEmprService.listAll();
        return maeEmprs;
    }
    @RequestMapping(value = "/ruc/{ruc}", method = RequestMethod.GET)
    public @ResponseBody List<MaeEmpr> buscarXRuc(@PathVariable java.lang.String ruc){
        List<MaeEmpr> maeEmprs =maeEmprService.findByRuc(ruc);
        return maeEmprs;
    }
    @RequestMapping(value = "/razonsocial/{razonsocial}", method = RequestMethod.GET)
    public @ResponseBody List<MaeEmpr> buscarXRazonSocial(@PathVariable java.lang.String razonsocial){
        List<MaeEmpr> maeEmprs =maeEmprService.findByRazonSocial(razonsocial);
        return maeEmprs;
    }
    @RequestMapping(value = "/direccion/{direccion}", method = RequestMethod.GET)
    public @ResponseBody List<MaeEmpr> buscarXDireccion(@PathVariable java.lang.String direccion){
        List<MaeEmpr> maeEmprs =maeEmprService.findByDireccion(direccion);
        return maeEmprs;
    }
    @RequestMapping(value = "/tipoempr/{tipoempr}", method = RequestMethod.GET)
    public @ResponseBody List<MaeEmpr> buscarXTipoEmpr(@PathVariable java.lang.String tipoempr){
        List<MaeEmpr> maeEmprs =maeEmprService.findByTipoEmpr(tipoempr);
        return maeEmprs;
    }
    @RequestMapping(value = "/coordenada/{coordenada}", method = RequestMethod.GET)
    public @ResponseBody List<MaeEmpr> buscarXCoordenada(@PathVariable java.lang.String coordenada){
        List<MaeEmpr> maeEmprs =maeEmprService.findByCoordenada(coordenada);
        return maeEmprs;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody MaeEmpr maeEmpr, UriComponentsBuilder ucBuilder){
        maeEmprService.add(maeEmpr);
        return null;
    }
}