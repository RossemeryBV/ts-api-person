package com.jk.person.controller.modelui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.jk.person.entity.CatCaliClien;
import com.jk.person.entity.CatTipoDocuIden;
import com.jk.person.entity.CatTipoMediCont;
import com.jk.person.entity.CatUbigeo;
import com.jk.person.entity.MaeClie;
import com.jk.person.entity.MaePers;
import com.jk.person.entity.MaePersNatu;
import com.jk.person.entity.RelPersMediCont;

public class Cliente {
	
	private int id;
	
	@Size(min = 2, message = "El nombre debe tener mas de 2 caracteres")
	@NotNull
	private String nombres;
	@NotNull
	private String apellidoPaterno;
	@NotNull
	private String apellidoMaterno;
	
	private int idTipoDocuIden;
	private String codTipoDocuIden;
	private String descTipoDocuIden;
	private String numDocuIden;
	
	private String codDistrito;
	private String codProvincia;
	private String codDepartamento;
	private String codUbigeo;
	private String nombreUbigeo;
	private String domicilio;
	private String coordenada;
	
	private int idCalificacionCliente;
	private String codCalificacionCliente;
	private String descCalificacionCliente;
	private String indActivo;
	
	private List<MedioContacto> mediosContaco; 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public int getIdTipoDocuIden() {
		return idTipoDocuIden;
	}
	public void setIdTipoDocuIden(int idTipoDocuIden) {
		this.idTipoDocuIden = idTipoDocuIden;
	}
	public String getCodTipoDocuIden() {
		return codTipoDocuIden;
	}
	public void setCodTipoDocuIden(String codTipoDocuIden) {
		this.codTipoDocuIden = codTipoDocuIden;
	}
	public String getDescTipoDocuIden() {
		return descTipoDocuIden;
	}
	public void setDescTipoDocuIden(String descTipoDocuIden) {
		this.descTipoDocuIden = descTipoDocuIden;
	}
	public String getCodDistrito() {
		return codDistrito;
	}
	public void setCodDistrito(String codDistrito) {
		this.codDistrito = codDistrito;
	}
	public String getCodProvincia() {
		return codProvincia;
	}
	public void setCodProvincia(String codProvincia) {
		this.codProvincia = codProvincia;
	}
	public String getCodDepartamento() {
		return codDepartamento;
	}
	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}
	
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getCoordenada() {
		return coordenada;
	}
	public void setCoordenada(String coordenada) {
		this.coordenada = coordenada;
	}
	public int getIdCalificacionCliente() {
		return idCalificacionCliente;
	}
	public void setIdCalificacionCliente(int idCalificacionCliente) {
		this.idCalificacionCliente = idCalificacionCliente;
	}
	public String getCodCalificacionCliente() {
		return codCalificacionCliente;
	}
	public void setCodCalificacionCliente(String codCalificacionCliente) {
		this.codCalificacionCliente = codCalificacionCliente;
	}
	public String getDescCalificacionCliente() {
		return descCalificacionCliente;
	}
	public void setDescCalificacionCliente(String descCalificacionCliente) {
		this.descCalificacionCliente = descCalificacionCliente;
	}
	
	public String getNumDocuIden() {
		return numDocuIden;
	}
	public void setNumDocuIden(String numDocuIden) {
		this.numDocuIden = numDocuIden;
	}
	
		
	
	
	public String getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(String indActivo) {
		this.indActivo = indActivo;
	}
	public List<MedioContacto> getMediosContaco() {
		return mediosContaco;
	}
	public void setMediosContaco(List<MedioContacto> mediosContaco) {
		this.mediosContaco = mediosContaco;
	}
	
	
	
	

	
	public String getCodUbigeo() {
		return codUbigeo;
	}
	public void setCodUbigeo(String codUbigeo) {
		this.codUbigeo = codUbigeo;
	}
	public String getNombreUbigeo() {
		return nombreUbigeo;
	}
	public void setNombreUbigeo(String nombreUbigeo) {
		this.nombreUbigeo = nombreUbigeo;
	}
	
	
	
	public Cliente toCliente(MaeClie mc) {
		
		
		
		Cliente cli = new Cliente();
		
		if(mc.getMaePersNatu() != null) {
			cli.setId(mc.getMaePersNatu().getIdPers());
	    	cli.setNombres(mc.getMaePersNatu().getNombre());
	    	cli.setApellidoMaterno(mc.getMaePersNatu().getApeMat());
	    	cli.setApellidoPaterno(mc.getMaePersNatu().getApePat());
	    	
	    	if(mc.getMaePersNatu().getCatTipoDocuIden() != null) {
	    		cli.setIdTipoDocuIden(mc.getMaePersNatu().getCatTipoDocuIden().getIdTipoDocuIden());
	    		cli.setCodTipoDocuIden(mc.getMaePersNatu().getCatTipoDocuIden().getCodTipoDocuIden());
	    		cli.setDescTipoDocuIden(mc.getMaePersNatu().getCatTipoDocuIden().getDescTipoDocuIden());	    		
	    	}	    	
	    	cli.setNumDocuIden(mc.getMaePersNatu().getNumDocu());
	    	
	    	if(mc.getMaePersNatu().getMaePers() != null 
    				&& mc.getMaePersNatu().getMaePers().getPersMediConts() != null
    				&& !mc.getMaePersNatu().getMaePers().getPersMediConts().isEmpty()) {
    			
    			List<MedioContacto> medios = new ArrayList<>();
    			
    			for(RelPersMediCont rpmc : mc.getMaePersNatu().getMaePers().getPersMediConts()) {
    				
    				MedioContacto me = new MedioContacto(
    						rpmc.getCatTipoMediCont().getIdTipoMediCont(), 
    						rpmc.getCatTipoMediCont().getCodTipoMediCont(), 
    						rpmc.getCatTipoMediCont().getDescTipoMediCont(), 
    						rpmc.getValorMedioContacto(),
    						rpmc.getIndPrincipal().equals("1")?true:false);
    				
    				me.setIndActivo(rpmc.getIndActivo());
    				if(me.getIndActivo().equalsIgnoreCase("A")) {
    					medios.add(me);
    				}
    					    				
    			}
    			cli.setMediosContaco(medios);
    			
    		}
		}    	
        	
    	if( mc.getCatUbigeo() != null ) {
    		cli.setCodDistrito(mc.getCatUbigeo().getCodDist());
        	cli.setCodProvincia(mc.getCatUbigeo().getCodProv());
        	cli.setCodDepartamento(mc.getCatUbigeo().getCodDepa());
        	cli.setCodUbigeo(mc.getCatUbigeo().getCodUbigeo());
        	cli.setNombreUbigeo(mc.getCatUbigeo().getNombre());
    	}    	
    	
    	cli.setDomicilio(mc.getDireccion());
    	cli.setCoordenada(mc.getCoordenada());
    	cli.setIndActivo(mc.getIndActivo());
    	
    	if(mc.getCatCaliClien() != null ) {
        	cli.setIdCalificacionCliente(mc.getCatCaliClien().getIdCaliClien());
        	cli.setCodCalificacionCliente(mc.getCatCaliClien().getCodCaliClien());
        	cli.setDescCalificacionCliente(mc.getCatCaliClien().getDescCaliClien());
    	}
    	
    	return cli;
	}
	
	public MaeClie toMaeClie() {
		
		MaePers maePers = new MaePers();
		maePers.setIndActivo(this.getIndActivo());
		MaePersNatu persNatu = new MaePersNatu();
		persNatu.setIdPers(this.id);
    	persNatu.setNombre(this.getNombres());
    	persNatu.setApeMat(this.getApellidoMaterno());
    	persNatu.setApePat(this.getApellidoPaterno());
    	persNatu.setMaePers(maePers);
    	persNatu.setIndActivo(this.getIndActivo());
    	
    	
    	if(this.getMediosContaco() != null && !this.getMediosContaco().isEmpty()) {
    		
    		List<RelPersMediCont> listRel = new ArrayList<>();
    		
    		for(MedioContacto mc:this.getMediosContaco()) {
    			CatTipoMediCont cmc = new CatTipoMediCont();
    			RelPersMediCont rel = new RelPersMediCont();
    			
    			cmc.setIdTipoMediCont(mc.getIdMedioContacto());
    			rel.setCatTipoMediCont(cmc);
    			rel.setIdTipoMediCont(mc.getIdMedioContacto());
    			rel.setIndPrincipal(mc.isPrincipal()?"1":"0");
    			rel.setValorMedioContacto(mc.getValorMedioContacto());
    			rel.setIndActivo(mc.getIndActivo());
    			listRel.add(rel);
    		}
    		maePers.setPersMediConts(listRel);
    		
    	}
    	
    	
    	
    	if(this.idTipoDocuIden>0) {
    		CatTipoDocuIden tipoDocI = new CatTipoDocuIden();
    		tipoDocI.setIdTipoDocuIden(this.idTipoDocuIden);
    		persNatu.setCatTipoDocuIden(tipoDocI);
    	}
    	
    	persNatu.setNumDocu(this.numDocuIden);
    	
    	MaeClie maeClie = new MaeClie();
    	maeClie.setIdClie(this.id);
    	maeClie.setMaePersNatu(persNatu);
    	maeClie.setCoordenada(this.getCoordenada());
    	maeClie.setDireccion(this.getDomicilio());
    	maeClie.setIndActivo(this.getIndActivo());
    	
    	if(this.getCodUbigeo() != null && !this.getCodUbigeo().isEmpty()) {
    		CatUbigeo ubige = new CatUbigeo();
    		ubige.setCodUbigeo(this.getCodUbigeo());
    		maeClie.setCatUbigeo(ubige);
    	}
    	
    	if(this.idCalificacionCliente > 0) {
    		CatCaliClien cal = new CatCaliClien(this.idCalificacionCliente);
    		maeClie.setCatCaliClien(cal);
    	}
    	
    	return maeClie;
	}
}
