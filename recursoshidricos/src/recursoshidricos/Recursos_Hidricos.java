package recursoshidricos;

public interface Recursos_Hidricos extends Identificavel {

	public CadastroCisterna Cadastrar_cisterna(CadastroCisterna cadastro);

	public CadastroCisterna Remover_cisterna(Integer id_cisterna, Double capacidade_cisterna);

	public AtualizacaoCisterna Atualizar_cisterna(AtualizacaoCisterna atualizacao);

	public MonitoramentoCisterna Monitorar_Cisterna(MonitoramentoCisterna monitorar);

}
