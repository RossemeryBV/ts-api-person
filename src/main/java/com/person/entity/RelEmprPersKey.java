package com.person.entity;

import java.io.Serializable;

public class RelEmprPersKey implements Serializable {
	
	
    private java.lang.Integer idEmpresa;    
    private java.lang.Integer idPersNatu;
       
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEmpresa == null) ? 0 : idEmpresa.hashCode());
		result = prime * result + ((idPersNatu == null) ? 0 : idPersNatu.hashCode());
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
		RelEmprPersKey other = (RelEmprPersKey) obj;
		if (idEmpresa == null) {
			if (other.idEmpresa != null)
				return false;
		} else if (!idEmpresa.equals(other.idEmpresa))
			return false;
		if (idPersNatu == null) {
			if (other.idPersNatu != null)
				return false;
		} else if (!idPersNatu.equals(other.idPersNatu))
			return false;
		return true;
	}
	
	public java.lang.Integer getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(java.lang.Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public java.lang.Integer getIdPersNatu() {
		return idPersNatu;
	}
	public void setIdPersNatu(java.lang.Integer idPersNatu) {
		this.idPersNatu = idPersNatu;
	}

    
}
