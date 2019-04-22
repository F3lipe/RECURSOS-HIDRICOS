package recursoshidricos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuantAguaDisponivelCisterna implements Identificavel {
	@Id
	private Integer id_aguadisponivel;
	private Double quant_litros_agua;


	public QuantAguaDisponivelCisterna() {
		super();
	}

	public QuantAguaDisponivelCisterna(Integer id_aguadisponivel, Double quant_litros_agua) {
		super();
		this.id_aguadisponivel = id_aguadisponivel;
		this.quant_litros_agua = quant_litros_agua;
	}

	public Integer getId_aguadisponivel() {
		return id_aguadisponivel;
	}

	public void setId_aguadisponivel(Integer id_aguadisponivel) {
		this.id_aguadisponivel = id_aguadisponivel;
	}

	public Double getQuant_litros_agua() {
		return quant_litros_agua;
	}

	public void setQuant_litros_agua(Double quant_litros_agua) {
		this.quant_litros_agua = quant_litros_agua;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_aguadisponivel == null) ? 0 : id_aguadisponivel.hashCode());
		result = prime * result + ((quant_litros_agua == null) ? 0 : quant_litros_agua.hashCode());
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
		QuantAguaDisponivelCisterna other = (QuantAguaDisponivelCisterna) obj;
		if (id_aguadisponivel == null) {
			if (other.id_aguadisponivel != null)
				return false;
		} else if (!id_aguadisponivel.equals(other.id_aguadisponivel))
			return false;
		if (quant_litros_agua == null) {
			if (other.quant_litros_agua != null)
				return false;
		} else if (!quant_litros_agua.equals(other.quant_litros_agua))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QuantAguaDisponivelCisterna [id_aguadisponivel=" + id_aguadisponivel + ", quant_litros_agua="
				+ quant_litros_agua + "]";
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
