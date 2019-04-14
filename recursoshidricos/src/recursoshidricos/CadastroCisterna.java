package recursoshidricos;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CadastroCisterna implements Identificavel {

	@Id
	private Integer id_Cisterna;
	
	private Double largura_cisterna;
	private Double comprimento_cisterna;
	private Double profundidade_cisterna;
	private Double capacidade_cisterna = largura_cisterna * comprimento_cisterna * profundidade_cisterna;

	public CadastroCisterna() {
		super();
	}

	public CadastroCisterna(Integer id_Cisterna, Double largura_cisterna, Double profundidade_cisterna,
			Double comprimento_cisterna, Double capacidade_cisterna) {
		super();
		this.id_Cisterna = id_Cisterna;
		this.largura_cisterna = largura_cisterna;
		this.profundidade_cisterna = profundidade_cisterna;
		this.comprimento_cisterna = comprimento_cisterna;
		this.capacidade_cisterna = capacidade_cisterna;
	}

	public Integer getId_Cisterna() {
		return id_Cisterna;
	}

	public void setId_Cisterna(Integer id_Cisterna) {
		this.id_Cisterna = id_Cisterna;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacidade_cisterna == null) ? 0 : capacidade_cisterna.hashCode());
		result = prime * result + ((comprimento_cisterna == null) ? 0 : comprimento_cisterna.hashCode());
		result = prime * result + ((id_Cisterna == null) ? 0 : id_Cisterna.hashCode());
		result = prime * result + ((largura_cisterna == null) ? 0 : largura_cisterna.hashCode());
		result = prime * result + ((profundidade_cisterna == null) ? 0 : profundidade_cisterna.hashCode());
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
		CadastroCisterna other = (CadastroCisterna) obj;
		if (capacidade_cisterna == null) {
			if (other.capacidade_cisterna != null)
				return false;
		} else if (!capacidade_cisterna.equals(other.capacidade_cisterna))
			return false;
		if (comprimento_cisterna == null) {
			if (other.comprimento_cisterna != null)
				return false;
		} else if (!comprimento_cisterna.equals(other.comprimento_cisterna))
			return false;
		if (id_Cisterna == null) {
			if (other.id_Cisterna != null)
				return false;
		} else if (!id_Cisterna.equals(other.id_Cisterna))
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
		return true;
	}

	@Override
	public String toString() {
		return "CadastroCisterna [id_Cisterna=" + id_Cisterna + ", largura_cisterna=" + largura_cisterna
				+ ", profundidade_cisterna=" + profundidade_cisterna + ", comprimento_cisterna=" + comprimento_cisterna
				+ ", capacidade_cisterna=" + capacidade_cisterna + "]";
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
