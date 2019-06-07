package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;
import java.sql.Date;

public class Irrigacao implements Identificavel {
	private Long id;
	private Double tempo_Irrigacao;
	private Date dias_De_irrigacao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getTempo_Irrigacao() {
		return tempo_Irrigacao;
	}
	public void setTempo_Irrigacao(Double tempo_Irrigacao) {
		this.tempo_Irrigacao = tempo_Irrigacao;
	}
	public Date getDias_De_irrigacao() {
		return dias_De_irrigacao;
	}
	public void setDias_De_irrigacao(Date dias_De_irrigacao) {
		this.dias_De_irrigacao = dias_De_irrigacao;
	}
	@Override
	public String toString() {
		return "Irrigacao [id=" + id + ", tempo_Irrigacao=" + tempo_Irrigacao + ", dias_De_irrigacao="
				+ dias_De_irrigacao + "]";
	}
	
	
	
	
	public Irrigacao(Long id, Double tempo_Irrigacao, Date dias_De_irrigacao) {
		super();
		this.id = id;
		this.tempo_Irrigacao = tempo_Irrigacao;
		this.dias_De_irrigacao = dias_De_irrigacao;
	}
	public Irrigacao() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dias_De_irrigacao == null) ? 0 : dias_De_irrigacao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tempo_Irrigacao == null) ? 0 : tempo_Irrigacao.hashCode());
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
		if (dias_De_irrigacao == null) {
			if (other.dias_De_irrigacao != null)
				return false;
		} else if (!dias_De_irrigacao.equals(other.dias_De_irrigacao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tempo_Irrigacao == null) {
			if (other.tempo_Irrigacao != null)
				return false;
		} else if (!tempo_Irrigacao.equals(other.tempo_Irrigacao))
			return false;
		return true;
	}
	
}
