package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cisterna implements Identificavel {

	@Id
	@GeneratedValue(generator="cis_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="cis_seq")
	private Long id;
	
	private Double larguraCisterna;
	private Double profundidadeCisterna;
	private Double comprimentoCisterna;
	private Double capacidadeCisterna;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getLarguraCisterna() {
		return larguraCisterna;
	}
	public void setLarguraCisterna(Double larguraCisterna) {
		this.larguraCisterna = larguraCisterna;
	}
	public Double getProfundidadeCisterna() {
		return profundidadeCisterna;
	}
	public void setProfundidadeCisterna(Double profundidadeCisterna) {
		this.profundidadeCisterna = profundidadeCisterna;
	}
	public Double getComprimentoCisterna() {
		return comprimentoCisterna;
	}
	public void setComprimentoCisterna(Double comprimentoCisterna) {
		this.comprimentoCisterna = comprimentoCisterna;
	}
	public Double getCapacidadeCisterna() {
		return capacidadeCisterna;
	}
	public void setCapacidadeCisterna(Double capacidadeCisterna) {
		this.capacidadeCisterna = capacidadeCisterna;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacidadeCisterna == null) ? 0 : capacidadeCisterna.hashCode());
		result = prime * result + ((comprimentoCisterna == null) ? 0 : comprimentoCisterna.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((larguraCisterna == null) ? 0 : larguraCisterna.hashCode());
		result = prime * result + ((profundidadeCisterna == null) ? 0 : profundidadeCisterna.hashCode());
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
		Cisterna other = (Cisterna) obj;
		if (capacidadeCisterna == null) {
			if (other.capacidadeCisterna != null)
				return false;
		} else if (!capacidadeCisterna.equals(other.capacidadeCisterna))
			return false;
		if (comprimentoCisterna == null) {
			if (other.comprimentoCisterna != null)
				return false;
		} else if (!comprimentoCisterna.equals(other.comprimentoCisterna))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (larguraCisterna == null) {
			if (other.larguraCisterna != null)
				return false;
		} else if (!larguraCisterna.equals(other.larguraCisterna))
			return false;
		if (profundidadeCisterna == null) {
			if (other.profundidadeCisterna != null)
				return false;
		} else if (!profundidadeCisterna.equals(other.profundidadeCisterna))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cisterna [id=" + id + ", larguraCisterna=" + larguraCisterna + ", profundidadeCisterna="
				+ profundidadeCisterna + ", comprimentoCisterna=" + comprimentoCisterna + ", capacidadeCisterna="
				+ capacidadeCisterna + "]";
	}
	public Cisterna(Long id, Double larguraCisterna, Double profundidadeCisterna, Double comprimentoCisterna,
			Double capacidadeCisterna) {
		super();
		this.id = id;
		this.larguraCisterna = larguraCisterna;
		this.profundidadeCisterna = profundidadeCisterna;
		this.comprimentoCisterna = comprimentoCisterna;
		this.capacidadeCisterna = capacidadeCisterna;
	}
	public Cisterna() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
