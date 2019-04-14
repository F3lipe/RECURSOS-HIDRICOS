package recursoshidricos;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MonitoramentoCisterna implements Identificavel {
	@Id
	private Integer id_monitoramento;
	private Date monitoramento;

	@OneToMany(mappedBy = "quant_litros_agua")
	private Set<AtualizaçãoCisterna> agua_gasta;
	
	@OneToMany(mappedBy = "quant_litros_agua")
	private Set<AtualizaçãoCisterna> agua_economizada;

	public MonitoramentoCisterna() {
		super();
	}

	public MonitoramentoCisterna(Integer id_monitoramento, Date monitoramento, Set<AtualizaçãoCisterna> agua_gasta,
			Set<AtualizaçãoCisterna> agua_economizada) {
		super();
		this.id_monitoramento = id_monitoramento;
		this.monitoramento = monitoramento;
		this.agua_gasta = agua_gasta;
		this.agua_economizada = agua_economizada;
	}

	public Integer getId_monitoramento() {
		return id_monitoramento;
	}

	public void setId_monitoramento(Integer id_monitoramento) {
		this.id_monitoramento = id_monitoramento;
	}

	public Date getMonitoramento() {
		return monitoramento;
	}

	public void setMonitoramento(Date monitoramento) {
		this.monitoramento = monitoramento;
	}

	public Set<AtualizaçãoCisterna> getAgua_gasta() {
		return agua_gasta;
	}

	public void setAgua_gasta(Set<AtualizaçãoCisterna> agua_gasta) {
		this.agua_gasta = agua_gasta;
	}

	public Set<AtualizaçãoCisterna> getAgua_economizada() {
		return agua_economizada;
	}

	public void setAgua_economizada(Set<AtualizaçãoCisterna> agua_economizada) {
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
		return true;
	}

	@Override
	public String toString() {
		return "MonitoramentoCisterna [id_monitoramento=" + id_monitoramento + ", monitoramento=" + monitoramento
				+ ", agua_gasta=" + agua_gasta + ", agua_economizada=" + agua_economizada + "]";
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