package com.person.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.person.entity.MaeUsuario;
import com.person.service.MaeUsuarioService;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/maeusuario")
public class MaeUsuarioController{

    @Autowired
    @Qualifier("maeUsuarioServiceImpl")
    private MaeUsuarioService maeUsuarioService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<MaeUsuario> apiGet(){
        List<MaeUsuario> maeUsuarios =maeUsuarioService.listAll();
        return maeUsuarios;
    }
    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    public @ResponseBody List<MaeUsuario> buscarXLogin(@PathVariable java.lang.String login){
        List<MaeUsuario> maeUsuarios =maeUsuarioService.findByLogin(login);
        return maeUsuarios;
    }
    @RequestMapping(value = "/password/{password}", method = RequestMethod.GET)
    public @ResponseBody List<MaeUsuario> buscarXPassword(@PathVariable java.lang.String password){
        List<MaeUsuario> maeUsuarios =maeUsuarioService.findByPassword(password);
        return maeUsuarios;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody MaeUsuario maeUsuario, UriComponentsBuilder ucBuilder){
        maeUsuarioService.add(maeUsuario);
        return null;
    }
}