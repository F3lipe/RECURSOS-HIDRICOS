package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;

import java.sql.Date;

public class Cultivo {
	private String nomeCultivo;
	private String descrição;
	private Date periodoSafra;
	public String getNomeCultivo() {
		return nomeCultivo;
	}
	public void setNomeCultivo(String nomeCultivo) {
		this.nomeCultivo = nomeCultivo;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public Date getPeriodoSafra() {
		return periodoSafra;
	}
	public void setPeriodoSafra(Date periodoSafra) {
		this.periodoSafra = periodoSafra;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrição == null) ? 0 : descrição.hashCode());
		result = prime * result + ((nomeCultivo == null) ? 0 : nomeCultivo.hashCode());
		result = prime * result + ((periodoSafra == null) ? 0 : periodoSafra.hashCode());
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
		Cultivo other = (Cultivo) obj;
		if (descrição == null) {
			if (other.descrição != null)
				return false;
		} else if (!descrição.equals(other.descrição))
			return false;
		if (nomeCultivo == null) {
			if (other.nomeCultivo != null)
				return false;
		} else if (!nomeCultivo.equals(other.nomeCultivo))
			return false;
		if (periodoSafra == null) {
			if (other.periodoSafra != null)
				return false;
		} else if (!periodoSafra.equals(other.periodoSafra))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cultivo [nomeCultivo=" + nomeCultivo + ", descrição=" + descrição + ", periodoSafra=" + periodoSafra
				+ "]";
	}
	public Cultivo(String nomeCultivo, String descrição, Date periodoSafra) {
		super();
		this.nomeCultivo = nomeCultivo;
		this.descrição = descrição;
		this.periodoSafra = periodoSafra;
	}
	public Cultivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
