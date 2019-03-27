package com.person.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.person.config.ConfigurationTemporal;
import com.person.controller.modelui.Cliente;
import com.person.entity.MaeClie;
import com.person.entity.MaePers;
import com.person.exception.ClienteNotFoundException;
import com.person.service.MaeClieService;
import com.person.service.MaePersService;


@RestController
@RequestMapping("/cliente45")
public class MaeClieController{

    @Autowired
    @Qualifier("maeClieServiceImpl")
    private MaeClieService maeClieService;
    
      
    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    private ConfigurationTemporal config;
    
    @GetMapping("/hola")
    public String probarInternationalized(){
    	System.out.println("-----------_> Properties -Minnum: "+config.getMinnum());
    	System.out.println("-----------_> Properties -Maxnum : "+config.getMaxnum());
    	return messageSource.getMessage("good.morning.message", null , LocaleContextHolder.getLocale());
    }
    
    
    @GetMapping
    public List<Cliente> listAll(){
    	
    	// Test Commit 
    	// Send push Jenkins
    	// Enviar comentario para GitHub
    	
        List<MaeClie> maeClies = maeClieService.listAllActives();
        List<Cliente> clientes = new ArrayList<>();
        for(MaeClie mc: maeClies ) {
        	Cliente cli = new Cliente();
        	cli = cli.toCliente(mc);
        	clientes.add(cli);        	
        }
        return clientes;
    }
        
    @DeleteMapping("/{id}")
    public void deleteXId(@PathVariable int id){    	
    	List<MaeClie> maeClie = maeClieService.findOne(id);
    	
    	if(maeClie == null) {
        	throw new ClienteNotFoundException("id-"+id);
        }else if(maeClie.size()<1) {
        	throw new ClienteNotFoundException("id-"+id);
        }    	
        maeClie.get(0).setIndActivo("I");
        maeClieService.update(maeClie.get(0));        
    }
    
    @GetMapping("/{id}")
    public Resource<Cliente> buscarXId(@PathVariable int id){
    	List<MaeClie> maeClie = maeClieService.findOne(id);
    	    	
        if(maeClie == null) {
        	throw new ClienteNotFoundException("id-"+id);
        }else if(maeClie.size()<1) {
        	throw new ClienteNotFoundException("id-"+id);
        }
        
        //HATEOAS
        Cliente cliente = new Cliente().toCliente(maeClie.get(0)); 
        
        Resource<Cliente> resource = new Resource<Cliente>(cliente);
        ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).listAll());
        resource.add(linkTo.withRel("all-clients"));
        //        
        return resource;
    }
    
    @PostMapping()    
    public ResponseEntity<?> post(@Valid @RequestBody Cliente cliente){    
    	System.out.println("Guardando cliente");
    	MaeClie maeClie = maeClieService.add(cliente.toMaeClie());
        
        URI location = ServletUriComponentsBuilder
        		.fromCurrentRequest()
        		.path("/{id}")
        		.buildAndExpand(maeClie.getIdClie()).toUri();
        
        return ResponseEntity.created(location).build();
    }
    
    @PutMapping()    
    public ResponseEntity<?> update(@Valid @RequestBody Cliente cliente){
    	List<MaeClie> listaClie = maeClieService.findOne(cliente.getId());
    	
        if(listaClie == null) {
        	throw new ClienteNotFoundException("id-"+cliente.getId());
        }else if(listaClie.size()<1) {
        	throw new ClienteNotFoundException("id-"+cliente.getId());
        }
        
        MaeClie maeClie = maeClieService.update(cliente.toMaeClie());
        
        URI location = ServletUriComponentsBuilder
        		.fromCurrentRequest()
        		.path("/{id}")
        		.buildAndExpand(maeClie.getIdClie()).toUri();
        
        return ResponseEntity.created(location).build();
    }
}