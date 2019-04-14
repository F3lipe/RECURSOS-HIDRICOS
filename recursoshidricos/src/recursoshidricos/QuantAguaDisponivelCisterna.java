package recursoshidricos;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class QuantAguaDisponivelCisterna implements Identificavel {
	@Id
	private Integer id_aguadisponivel;

	private Double comprimento_agua;
	private Double profundidade_agua;
	private Double largura_agua;
	private Double quant_litros_agua = comprimento_agua * profundidade_agua * largura_agua;

	public QuantAguaDisponivelCisterna() {
		super();
	}

	public QuantAguaDisponivelCisterna(Integer id_aguadisponivel, Double quant_litros_agua, Double comprimento_agua,
			Double profundidade_agua, Double largura_agua) {
		super();
		this.id_aguadisponivel = id_aguadisponivel;
		this.quant_litros_agua = quant_litros_agua;
		this.comprimento_agua = comprimento_agua;
		this.profundidade_agua = profundidade_agua;
		this.largura_agua = largura_agua;
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

	public Double getComprimento_agua() {
		return comprimento_agua;
	}

	public void setComprimento_agua(Double comprimento_agua) {
		this.comprimento_agua = comprimento_agua;
	}

	public Double getProfundidade_agua() {
		return profundidade_agua;
	}

	public void setProfundidade_agua(Double profundidade_agua) {
		this.profundidade_agua = profundidade_agua;
	}

	public Double getLargura_agua() {
		return largura_agua;
	}

	public void setLargura_agua(Double largura_agua) {
		this.largura_agua = largura_agua;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comprimento_agua == null) ? 0 : comprimento_agua.hashCode());
		result = prime * result + ((id_aguadisponivel == null) ? 0 : id_aguadisponivel.hashCode());
		result = prime * result + ((largura_agua == null) ? 0 : largura_agua.hashCode());
		result = prime * result + ((profundidade_agua == null) ? 0 : profundidade_agua.hashCode());
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
		if (comprimento_agua == null) {
			if (other.comprimento_agua != null)
				return false;
		} else if (!comprimento_agua.equals(other.comprimento_agua))
			return false;
		if (id_aguadisponivel == null) {
			if (other.id_aguadisponivel != null)
				return false;
		} else if (!id_aguadisponivel.equals(other.id_aguadisponivel))
			return false;
		if (largura_agua == null) {
			if (other.largura_agua != null)
				return false;
		} else if (!largura_agua.equals(other.largura_agua))
			return false;
		if (profundidade_agua == null) {
			if (other.profundidade_agua != null)
				return false;
		} else if (!profundidade_agua.equals(other.profundidade_agua))
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
				+ quant_litros_agua + ", comprimento_agua=" + comprimento_agua + ", profundidade_agua="
				+ profundidade_agua + ", largura_agua=" + largura_agua + "]";
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
