package recursoshidricos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AtualizacaoCisterna implements Identificavel {

	@Id
	private Integer id_atualização;
	private Date periodo_agua_atualizada;

	@ManyToOne
	private CadastroCisterna capacidade_cisterna;

	@ManyToOne
	private CadastroCisterna quant_litros_agua;

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
