package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;
import java.sql.Date;

public class Producao implements Identificavel{
	
	private Long id;
	private String cultivoPlantado;
	private Date dataDoPlantio;
	private Double Quant_Plantada_P_Area;
	private Double Quant_Agua_Gasta;
	
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
	public Double getQuant_Plantada_P_Area() {
		return Quant_Plantada_P_Area;
	}
	public void setQuant_Plantada_P_Area(Double quant_Plantada_P_Area) {
		Quant_Plantada_P_Area = quant_Plantada_P_Area;
	}
	public Double getQuant_Agua_Gasta() {
		return Quant_Agua_Gasta;
	}
	public void setQuant_Agua_Gasta(Double quant_Agua_Gasta) {
		Quant_Agua_Gasta = quant_Agua_Gasta;
	}
	public Producao() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Quant_Agua_Gasta == null) ? 0 : Quant_Agua_Gasta.hashCode());
		result = prime * result + ((Quant_Plantada_P_Area == null) ? 0 : Quant_Plantada_P_Area.hashCode());
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
		if (Quant_Agua_Gasta == null) {
			if (other.Quant_Agua_Gasta != null)
				return false;
		} else if (!Quant_Agua_Gasta.equals(other.Quant_Agua_Gasta))
			return false;
		if (Quant_Plantada_P_Area == null) {
			if (other.Quant_Plantada_P_Area != null)
				return false;
		} else if (!Quant_Plantada_P_Area.equals(other.Quant_Plantada_P_Area))
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
	

}
