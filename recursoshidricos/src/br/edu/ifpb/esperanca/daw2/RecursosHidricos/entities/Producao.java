package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;
import java.sql.Date;

public class Producao implements Identificavel{
	
	private Long id;
	private String cultivoPlantado;
	private Date dataDoPlantio;
	private Double QuantPlantadaPArea;
	private Double QuantAguaGasta;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCultivoPlantado() {
		return cultivoPlantado;
	}
	public void setCultivoPlantado(String cultivoPlantado) {
		this.cultivoPlantado = cultivoPlantado;
	}
	public Date getDataDoPlantio() {
		return dataDoPlantio;
	}
	public void setDataDoPlantio(Date dataDoPlantio) {
		this.dataDoPlantio = dataDoPlantio;
	}
	public Double getQuantPlantadaPArea() {
		return QuantPlantadaPArea;
	}
	public void setQuantPlantadaPArea(Double quantPlantadaPArea) {
		QuantPlantadaPArea = quantPlantadaPArea;
	}
	public Double getQuantAguaGasta() {
		return QuantAguaGasta;
	}
	public void setQuantAguaGasta(Double quantAguaGasta) {
		QuantAguaGasta = quantAguaGasta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((QuantAguaGasta == null) ? 0 : QuantAguaGasta.hashCode());
		result = prime * result + ((QuantPlantadaPArea == null) ? 0 : QuantPlantadaPArea.hashCode());
		result = prime * result + ((cultivoPlantado == null) ? 0 : cultivoPlantado.hashCode());
		result = prime * result + ((dataDoPlantio == null) ? 0 : dataDoPlantio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Producao other = (Producao) obj;
		if (QuantAguaGasta == null) {
			if (other.QuantAguaGasta != null)
				return false;
		} else if (!QuantAguaGasta.equals(other.QuantAguaGasta))
			return false;
		if (QuantPlantadaPArea == null) {
			if (other.QuantPlantadaPArea != null)
				return false;
		} else if (!QuantPlantadaPArea.equals(other.QuantPlantadaPArea))
			return false;
		if (cultivoPlantado == null) {
			if (other.cultivoPlantado != null)
				return false;
		} else if (!cultivoPlantado.equals(other.cultivoPlantado))
			return false;
		if (dataDoPlantio == null) {
			if (other.dataDoPlantio != null)
				return false;
		} else if (!dataDoPlantio.equals(other.dataDoPlantio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Producao [id=" + id + ", cultivoPlantado=" + cultivoPlantado + ", dataDoPlantio=" + dataDoPlantio
				+ ", QuantPlantadaPArea=" + QuantPlantadaPArea + ", QuantAguaGasta=" + QuantAguaGasta + "]";
	}
	public Producao(Long id, String cultivoPlantado, Date dataDoPlantio, Double quantPlantadaPArea,
			Double quantAguaGasta) {
		super();
		this.id = id;
		this.cultivoPlantado = cultivoPlantado;
		this.dataDoPlantio = dataDoPlantio;
		QuantPlantadaPArea = quantPlantadaPArea;
		QuantAguaGasta = quantAguaGasta;
	}
	public Producao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
