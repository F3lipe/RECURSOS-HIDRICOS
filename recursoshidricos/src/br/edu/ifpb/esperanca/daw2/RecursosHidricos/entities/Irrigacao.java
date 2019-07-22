package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;
import java.sql.Date;

public class Irrigacao implements Identificavel {
	private Long id;
	private Double tempoIrrigacao;
	private Date diasDeIrrigacao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getTempoIrrigacao() {
		return tempoIrrigacao;
	}
	public void setTempoIrrigacao(Double tempoIrrigacao) {
		this.tempoIrrigacao = tempoIrrigacao;
	}
	public Date getDiasDeIrrigacao() {
		return diasDeIrrigacao;
	}
	public void setDiasDeIrrigacao(Date diasDeIrrigacao) {
		this.diasDeIrrigacao = diasDeIrrigacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diasDeIrrigacao == null) ? 0 : diasDeIrrigacao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tempoIrrigacao == null) ? 0 : tempoIrrigacao.hashCode());
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
		Irrigacao other = (Irrigacao) obj;
		if (diasDeIrrigacao == null) {
			if (other.diasDeIrrigacao != null)
				return false;
		} else if (!diasDeIrrigacao.equals(other.diasDeIrrigacao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tempoIrrigacao == null) {
			if (other.tempoIrrigacao != null)
				return false;
		} else if (!tempoIrrigacao.equals(other.tempoIrrigacao))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Irrigacao [id=" + id + ", tempoIrrigacao=" + tempoIrrigacao + ", diasDeIrrigacao=" + diasDeIrrigacao
				+ "]";
	}
	public Irrigacao(Long id, Double tempoIrrigacao, Date diasDeIrrigacao) {
		super();
		this.id = id;
		this.tempoIrrigacao = tempoIrrigacao;
		this.diasDeIrrigacao = diasDeIrrigacao;
	}
	public Irrigacao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
