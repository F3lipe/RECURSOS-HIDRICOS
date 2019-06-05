package recursoshidricos;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CadastroCisterna implements Identificavel {

	@Id
	private Integer id_Cisterna;
	private Double largura_cisterna;
	private Double profundidade_cisterna;
	private Double comprimento_cisterna;
	private Double capacidade_cisterna;
	private ArrayList<CadastroCisterna> cisternas;
	private Double quantLitrosAgua;
	

		}

}