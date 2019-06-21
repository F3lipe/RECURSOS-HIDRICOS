package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MonitoramentoCisterna implements Identificavel {
	@Id
	private Long id_monitoramento;
	private Date monitoramento;
	private Double quant_AguaGasta_Tempo;
	private Double quant_AguaEconomizada_Tempo;
	
	
	

	@OneToMany(mappedBy = "quant_litros_agua")
	private Set<AtualizacaoCisterna> agua_gasta;

	@OneToMany(mappedBy = "quant_litros_agua")
	private Set<AtualizacaoCisterna> agua_economizada;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
		
	}

	public Long getId_monitoramento() {
		return id_monitoramento;
	}

	public void setId_monitoramento(Long id_monitoramento) {
		this.id_monitoramento = id_monitoramento;
	}

	public Date getMonitoramento() {
		return monitoramento;
	}

	public void setMonitoramento(Date monitoramento) {
		this.monitoramento = monitoramento;
	}

	public Double getQuant_AguaGasta_Tempo() {
		return quant_AguaGasta_Tempo;
	}

	public void setQuant_AguaGasta_Tempo(Double quant_AguaGasta_Tempo) {
		this.quant_AguaGasta_Tempo = quant_AguaGasta_Tempo;
	}

	public Double getQuant_AguaEconomizada_Tempo() {
		return quant_AguaEconomizada_Tempo;
	}

	public void setQuant_AguaEconomizada_Tempo(Double quant_AguaEconomizada_Tempo) {
		this.quant_AguaEconomizada_Tempo = quant_AguaEconomizada_Tempo;
	}

	public Set<AtualizacaoCisterna> getAgua_gasta() {
		return agua_gasta;
	}

	public void setAgua_gasta(Set<AtualizacaoCisterna> agua_gasta) {
		this.agua_gasta = agua_gasta;
	}

	public Set<AtualizacaoCisterna> getAgua_economizada() {
		return agua_economizada;
	}

	public void setAgua_economizada(Set<AtualizacaoCisterna> agua_economizada) {
		this.agua_economizada = agua_economizada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agua_economizada == null) ? 0 : agua_economizada.hashCode());
		result = prime * result + ((agua_gasta == null) ? 0 : agua_gasta.hashCode());
		result = prime * result + ((id_monitoramento == null) ? 0 : id_monitoramento.hashCode());
		result = prime * result + ((monitoramento == null) ? 0 : monitoramento.hashCode());
		result = prime * result + ((quant_AguaEconomizada_Tempo == null) ? 0 : quant_AguaEconomizada_Tempo.hashCode());
		result = prime * result + ((quant_AguaGasta_Tempo == null) ? 0 : quant_AguaGasta_Tempo.hashCode());
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
		MonitoramentoCisterna other = (MonitoramentoCisterna) obj;
		if (agua_economizada == null) {
			if (other.agua_economizada != null)
				return false;
		} else if (!agua_economizada.equals(other.agua_economizada))
			return false;
		if (agua_gasta == null) {
			if (other.agua_gasta != null)
				return false;
		} else if (!agua_gasta.equals(other.agua_gasta))
			return false;
		if (id_monitoramento == null) {
			if (other.id_monitoramento != null)
				return false;
		} else if (!id_monitoramento.equals(other.id_monitoramento))
			return false;
		if (monitoramento == null) {
			if (other.monitoramento != null)
				return false;
		} else if (!monitoramento.equals(other.monitoramento))
			return false;
		if (quant_AguaEconomizada_Tempo == null) {
			if (other.quant_AguaEconomizada_Tempo != null)
				return false;
		} else if (!quant_AguaEconomizada_Tempo.equals(other.quant_AguaEconomizada_Tempo))
			return false;
		if (quant_AguaGasta_Tempo == null) {
			if (other.quant_AguaGasta_Tempo != null)
				return false;
		} else if (!quant_AguaGasta_Tempo.equals(other.quant_AguaGasta_Tempo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MonitoramentoCisterna [id_monitoramento=" + id_monitoramento + ", monitoramento=" + monitoramento
				+ ", quant_AguaGasta_Tempo=" + quant_AguaGasta_Tempo + ", quant_AguaEconomizada_Tempo="
				+ quant_AguaEconomizada_Tempo + ", agua_gasta=" + agua_gasta + ", agua_economizada=" + agua_economizada
				+ "]";
	}

	public MonitoramentoCisterna(Long id_monitoramento, Date monitoramento, Double quant_AguaGasta_Tempo,
			Double quant_AguaEconomizada_Tempo, Set<AtualizacaoCisterna> agua_gasta,
			Set<AtualizacaoCisterna> agua_economizada) {
		super();
		this.id_monitoramento = id_monitoramento;
		this.monitoramento = monitoramento;
		this.quant_AguaGasta_Tempo = quant_AguaGasta_Tempo;
		this.quant_AguaEconomizada_Tempo = quant_AguaEconomizada_Tempo;
		this.agua_gasta = agua_gasta;
		this.agua_economizada = agua_economizada;
	}

	public MonitoramentoCisterna() {
		super();
		// TODO Auto-generated constructor stub
	}

	}

	

