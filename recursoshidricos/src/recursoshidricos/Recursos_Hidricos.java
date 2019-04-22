package recursoshidricos;

import java.util.Date;

public interface Recursos_Hidricos {

	public CadastroCisterna Cadastro_cisterna(Integer id_cisterna, Double capacidade_cisterna);

	public CadastroCisterna Remover_cisterna(Integer id_cisterna, Double capacidade_cisterna);

	public AtualizacaoCisterna Atualizar_cisterna(Integer id_atualização, Date periodo_agua_atualizada,
			CadastroCisterna capacidade_cisterna, QuantAguaDisponivelCisterna quant_litros_agua);

}
