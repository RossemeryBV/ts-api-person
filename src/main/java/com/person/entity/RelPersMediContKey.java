package com.person.entity;

import java.io.Serializable;

public class RelPersMediContKey implements Serializable {

	/*private MaePers maePers;
	private CatTipoMediCont catTipoMediCont;
	*/
	
	private java.lang.Integer idPers;
	private java.lang.Integer idTipoMediCont;

	

	private java.lang.String valorMedioContacto;



	public java.lang.Integer getIdPers() {
		return idPers;
	}



	public void setIdPers(java.lang.Integer idPers) {
		this.idPers = idPers;
	}



	public java.lang.Integer getIdTipoMediCont() {
		return idTipoMediCont;
	}



	public void setIdTipoMediCont(java.lang.Integer idTipoMediCont) {
		this.idTipoMediCont = idTipoMediCont;
	}



	public java.lang.String getValorMedioContacto() {
		return valorMedioContacto;
	}



	public void setValorMedioContacto(java.lang.String valorMedioContacto) {
		this.valorMedioContacto = valorMedioContacto;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPers == null) ? 0 : idPers.hashCode());
		result = prime * result + ((idTipoMediCont == null) ? 0 : idTipoMediCont.hashCode());
		result = prime * result + ((valorMedioContacto == null) ? 0 : valorMedioContacto.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RelPersMediContKey other = (RelPersMediContKey) obj;
		if (idPers == null) {
			if (other.idPers != null)
				return false;
		} else if (!idPers.equals(other.idPers))
			return false;
		if (idTipoMediCont == null) {
			if (other.idTipoMediCont != null)
				return false;
		} else if (!idTipoMediCont.equals(other.idTipoMediCont))
			return false;
		if (valorMedioContacto == null) {
			if (other.valorMedioContacto != null)
				return false;
		} else if (!valorMedioContacto.equals(other.valorMedioContacto))
			return false;
		return true;
	}

	
	
	

}
