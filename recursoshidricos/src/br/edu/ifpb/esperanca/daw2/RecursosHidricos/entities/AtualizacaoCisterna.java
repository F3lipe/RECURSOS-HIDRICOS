package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AtualizacaoCisterna implements Identificavel {

	@Id
	private Long idAtualização;
	private Date periodoAguaAtualizada;

	@ManyToOne
	private Cisterna cisterna;
	private Integer quantLitrosAgua;
	
	
	

	public Long getIdAtualização() {
		return idAtualização;
	}

	public void setIdAtualização(Long idAtualização) {
		this.idAtualização = idAtualização;
	}

	public Date getPeriodoAguaAtualizada() {
		return periodoAguaAtualizada;
	}

	public void setPeriodoAguaAtualizada(Date periodoAguaAtualizada) {
		this.periodoAguaAtualizada = periodoAguaAtualizada;
	}

	public Cisterna getCisterna() {
		return cisterna;
	}

	public void setCisterna(Cisterna cisterna) {
		this.cisterna = cisterna;
	}

	public Integer getQuantLitrosAgua() {
		return quantLitrosAgua;
	}

	public void setQuantLitrosAgua(Integer quantLitrosAgua) {
		this.quantLitrosAgua = quantLitrosAgua;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cisterna == null) ? 0 : cisterna.hashCode());
		result = prime * result + ((idAtualização == null) ? 0 : idAtualização.hashCode());
		result = prime * result + ((periodoAguaAtualizada == null) ? 0 : periodoAguaAtualizada.hashCode());
		result = prime * result + ((quantLitrosAgua == null) ? 0 : quantLitrosAgua.hashCode());
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
		AtualizacaoCisterna other = (AtualizacaoCisterna) obj;
		if (cisterna == null) {
			if (other.cisterna != null)
				return false;
		} else if (!cisterna.equals(other.cisterna))
			return false;
		if (idAtualização == null) {
			if (other.idAtualização != null)
				return false;
		} else if (!idAtualização.equals(other.idAtualização))
			return false;
		if (periodoAguaAtualizada == null) {
			if (other.periodoAguaAtualizada != null)
				return false;
		} else if (!periodoAguaAtualizada.equals(other.periodoAguaAtualizada))
			return false;
		if (quantLitrosAgua == null) {
			if (other.quantLitrosAgua != null)
				return false;
		} else if (!quantLitrosAgua.equals(other.quantLitrosAgua))
			return false;
		return true;
	}

	public AtualizacaoCisterna(Long idAtualização, Date periodoAguaAtualizada, Cisterna cisterna,
			Integer quantLitrosAgua) {
		super();
		this.idAtualização = idAtualização;
		this.periodoAguaAtualizada = periodoAguaAtualizada;
		this.cisterna = cisterna;
		this.quantLitrosAgua = quantLitrosAgua;
	}

	public AtualizacaoCisterna() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

}