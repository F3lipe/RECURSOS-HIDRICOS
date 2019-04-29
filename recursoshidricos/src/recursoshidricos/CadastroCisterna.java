package recursoshidricos;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CadastroCisterna implements Identificavel {

	@Id
	private Integer id_Cisterna;
	private Double capacidade_cisterna;
	private String nomeCisterna;
	private ArrayList<CadastroCisterna> cisternas;

	public CadastroCisterna() {
		super();
	}

	public CadastroCisterna(Integer id_Cisterna, Double capacidade_cisterna, String nomeCisterna,
			ArrayList<CadastroCisterna> cisternas) {
		super();
		this.id_Cisterna = id_Cisterna;
		this.capacidade_cisterna = capacidade_cisterna;
		this.nomeCisterna = nomeCisterna;
		this.cisternas = cisternas;
	}

	public Integer getId_Cisterna() {
		return id_Cisterna;
	}

	public void setId_Cisterna(Integer id_Cisterna) {
		this.id_Cisterna = id_Cisterna;
	}

	public Double getCapacidade_cisterna() {
		return capacidade_cisterna;
	}

	public void setCapacidade_cisterna(Double capacidade_cisterna) {
		this.capacidade_cisterna = capacidade_cisterna;
	}

	public String getNomeCisterna() {
		return nomeCisterna;
	}

	public void setNomeCisterna(String nomeCisterna) {
		this.nomeCisterna = nomeCisterna;
	}

	public ArrayList<CadastroCisterna> getCisternas() {
		return cisternas;
	}

	public void setCisternas(ArrayList<CadastroCisterna> cisternas) {
		this.cisternas = cisternas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacidade_cisterna == null) ? 0 : capacidade_cisterna.hashCode());
		result = prime * result + ((cisternas == null) ? 0 : cisternas.hashCode());
		result = prime * result + ((id_Cisterna == null) ? 0 : id_Cisterna.hashCode());
		result = prime * result + ((nomeCisterna == null) ? 0 : nomeCisterna.hashCode());
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
		if (cisternas == null) {
			if (other.cisternas != null)
				return false;
		} else if (!cisternas.equals(other.cisternas))
			return false;
		if (id_Cisterna == null) {
			if (other.id_Cisterna != null)
				return false;
		} else if (!id_Cisterna.equals(other.id_Cisterna))
			return false;
		if (nomeCisterna == null) {
			if (other.nomeCisterna != null)
				return false;
		} else if (!nomeCisterna.equals(other.nomeCisterna))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CadastroCisterna [id_Cisterna=" + id_Cisterna + ", capacidade_cisterna=" + capacidade_cisterna
				+ ", nomeCisterna=" + nomeCisterna + ", cisternas=" + cisternas + "]";
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
