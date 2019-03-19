package com.person.controller.modelui;

public class MedioContacto {

	
	private Integer idMedioContacto;
	private String codMedioContacto;
	private String descMedioContacto;
	private String valorMedioContacto;
	private boolean isPrincipal;
	private String indActivo;
	
	
	
	public MedioContacto() {		
	}
	
	public MedioContacto(Integer idMedioContacto,String codMedioContacto, String descMedioContacto,
			String valorMedioContacto, boolean isDefault) {
		super();		
		this.idMedioContacto = idMedioContacto;
		this.codMedioContacto = codMedioContacto;
		this.descMedioContacto = descMedioContacto;
		this.valorMedioContacto = valorMedioContacto;
		this.isPrincipal = isDefault;
	}
	
	
	public String getCodMedioContacto() {
		return codMedioContacto;
	}
	public void setCodMedioContacto(String codMedioContacto) {
		this.codMedioContacto = codMedioContacto;
	}
	public String getDescMedioContacto() {
		return descMedioContacto;
	}
	public void setDescMedioContacto(String descMedioContacto) {
		this.descMedioContacto = descMedioContacto;
	}
	public String getValorMedioContacto() {
		return valorMedioContacto;
	}
	public void setValorMedioContacto(String valorMedioContacto) {
		this.valorMedioContacto = valorMedioContacto;
	}

	public boolean isPrincipal() {
		return isPrincipal;
	}

	public void setPrincipal(boolean isPrincipal) {
		this.isPrincipal = isPrincipal;
	}

	public Integer getIdMedioContacto() {
		return idMedioContacto;
	}

	public void setIdMedioContacto(Integer idMedioContacto) {
		this.idMedioContacto = idMedioContacto;
	}

	public String getIndActivo() {
		return indActivo;
	}

	public void setIndActivo(String indActivo) {
		this.indActivo = indActivo;
	}
	
	
}
