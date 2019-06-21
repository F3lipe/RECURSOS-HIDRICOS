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
	
	private Double largura_cisterna;
	private Double profundidade_cisterna;
	private Double comprimento_cisterna;
	private Double capacidade_cisterna;
	private ArrayList<Cisterna> cisternas;
	private Double quantLitrosAgua;
	
	
	
	
	@Override
	public Long getId() {
		
		return id;
	}
	@Override
	public void setId(Long id) {
		this.id=id;
		
	}
	
	public Double getLargura_cisterna() {
		return largura_cisterna;
	}
	public void setLargura_cisterna(Double largura_cisterna) {
		this.largura_cisterna = largura_cisterna;
	}
	public Double getProfundidade_cisterna() {
		return profundidade_cisterna;
	}
	public void setProfundidade_cisterna(Double profundidade_cisterna) {
		this.profundidade_cisterna = profundidade_cisterna;
	}
	public Double getComprimento_cisterna() {
		return comprimento_cisterna;
	}
	public void setComprimento_cisterna(Double comprimento_cisterna) {
		this.comprimento_cisterna = comprimento_cisterna;
	}
	public Double getCapacidade_cisterna() {
		return capacidade_cisterna;
	}
	public void setCapacidade_cisterna(Double capacidade_cisterna) {
		this.capacidade_cisterna = capacidade_cisterna;
	}
	public ArrayList<Cisterna> getCisternas() {
		return cisternas;
	}
	public void setCisternas(ArrayList<Cisterna> cisternas) {
		this.cisternas = cisternas;
	}
	public Double getQuantLitrosAgua() {
		return quantLitrosAgua;
	}
	public void setQuantLitrosAgua(Double quantLitrosAgua) {
		this.quantLitrosAgua = quantLitrosAgua;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacidade_cisterna == null) ? 0 : capacidade_cisterna.hashCode());
		result = prime * result + ((cisternas == null) ? 0 : cisternas.hashCode());
		result = prime * result + ((comprimento_cisterna == null) ? 0 : comprimento_cisterna.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((largura_cisterna == null) ? 0 : largura_cisterna.hashCode());
		result = prime * result + ((profundidade_cisterna == null) ? 0 : profundidade_cisterna.hashCode());
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
		Cisterna other = (Cisterna) obj;
		if (capacidade_cisterna == null) {
			if (other.capacidade_cisterna != null)
				return false;
		} else if (!capacidade_cisterna.equals(other.capacidade_cisterna))
			return false;
		if (cisternas == null) {
			if (other.cisternas != null)
				return false;
		} else if (!cisternas.equals(other.cisternas))
			return false;
		if (comprimento_cisterna == null) {
			if (other.comprimento_cisterna != null)
				return false;
		} else if (!comprimento_cisterna.equals(other.comprimento_cisterna))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (largura_cisterna == null) {
			if (other.largura_cisterna != null)
				return false;
		} else if (!largura_cisterna.equals(other.largura_cisterna))
			return false;
		if (profundidade_cisterna == null) {
			if (other.profundidade_cisterna != null)
				return false;
		} else if (!profundidade_cisterna.equals(other.profundidade_cisterna))
			return false;
		if (quantLitrosAgua == null) {
			if (other.quantLitrosAgua != null)
				return false;
		} else if (!quantLitrosAgua.equals(other.quantLitrosAgua))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CadastroCisterna [id_Cisterna=" + id + ", largura_cisterna=" + largura_cisterna
				+ ", profundidade_cisterna=" + profundidade_cisterna + ", comprimento_cisterna=" + comprimento_cisterna
				+ ", capacidade_cisterna=" + capacidade_cisterna + ", cisternas=" + cisternas + ", quantLitrosAgua="
				+ quantLitrosAgua + "]";
	}
	public Cisterna() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	
	

		



