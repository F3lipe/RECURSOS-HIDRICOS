package recursoshidricos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuantAguaDisponivelCisterna implements Identificavel {
	@Id
	private Integer id_aguadisponivel;
	private Double quantLitrosAgua;


	public QuantAguaDisponivelCisterna() {
		super();
	}

	public QuantAguaDisponivelCisterna(Integer id_aguadisponivel, Double quantLitrosAgua) {
		super();
		this.id_aguadisponivel = id_aguadisponivel;
		this.quantLitrosAgua = quantLitrosAgua;
	}

	public Integer getId_aguadisponivel() {
		return id_aguadisponivel;
	}

	public void setId_aguadisponivel(Integer id_aguadisponivel) {
		this.id_aguadisponivel = id_aguadisponivel;
	}

	public Double getquantLitrosAgua() {
		return quantLitrosAgua;
	}

	public void setquantLitrosAgua(Double quantLitrosAgua) {
		this.quantLitrosAgua = quantLitrosAgua;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_aguadisponivel == null) ? 0 : id_aguadisponivel.hashCode());
		result = prime * result + ((quantLitrosAgua == null) ? 0 : quantLitrosAgua.hashCode());
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
		if (quantLitrosAgua == null) {
			if (other.quantLitrosAgua != null)
				return false;
		} else if (!quantLitrosAgua.equals(other.quantLitrosAgua))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QuantAguaDisponivelCisterna [id_aguadisponivel=" + id_aguadisponivel + ", quantLitrosAgua="
				+ quantLitrosAgua + "]";
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
