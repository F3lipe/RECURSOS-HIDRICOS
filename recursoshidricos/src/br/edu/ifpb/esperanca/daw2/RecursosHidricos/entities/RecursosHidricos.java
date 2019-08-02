package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;

public interface RecursosHidricos extends Identificavel {

	//CISTERNA
	
	public Cisterna AdicionarCisterna(Cisterna adicionarCisterna);
	public Cisterna RemoverCisterna(Integer idCisterna, Double capacidadeCisterna);
	public Cisterna AtualizarCisterna (Cisterna atualizar);
	public Cisterna AdicionarLargura (Cisterna adicionarLargura);
	public Cisterna RemoverLargura(Cisterna removerLargura); 
	public Cisterna AdicionarComprimento(Cisterna adicionarComprimento);
	public Cisterna RemoverComprimento(Cisterna removerComprimento);
	public Cisterna CapacidadeCisterna1(Cisterna cisterna);
	
	//MONITORAMENTO

	public MonitoramentoCisterna AtualizarAguaGastaporTempo(MonitoramentoCisterna atualizarAguaGastaporTempo);
	public MonitoramentoCisterna AtualizarQuantidadeAguaEconomizada(MonitoramentoCisterna AtualizarQuantidadeAguaEconomizada);

	//ATUALIZAÇÃO
	
	public AtualizacaoCisterna AdicionarPeriodo (AtualizacaoCisterna adicionarPeriodo);
	public AtualizacaoCisterna AtualizarPeriodo(AtualizacaoCisterna atualizarPeriodo);
	
	//PRODUÇÃO
	
	public Producao AdicionarPlantio (Producao adicionarPlantio);
	public Producao AtualizarPlantio (Producao atualizarPlantio);
	public Producao AddAguaGasta    (Producao aidicionardAguaGasta  );
	public Producao AddPeriodoPlantado (Producao adicionarPeriodoPlantado);
	public Producao AtualizarPeriodoPlantado (Producao atualizarPeriodoPlantado);
	public Producao AddDatePlantacao (Producao adicionar_Date_Plantacao );
	public Producao AtualizarDatePlantacao (Producao atualizarDatePlantacao);
	
	//USUARIO
	
	public Usuario AdicionarNome  (Usuario adicionarNome);
	public Usuario AdicionarEndereco(Usuario adcionarEndereco);
	public Usuario AdicionarEmail(Usuario adicionarEmail);
	
	//IRRIGAÇÃO
	
	public Irrigacao AdicionarTempoIrrigacao(Irrigacao adicionarTempoIrrigacao);
	public Irrigacao AdicionarDiasIrrigacao(Irrigacao adicionarDiasIrrigacao);
	
	//
	public Cisterna CapacidadeCisterna(Cisterna cisterna);
	
	//CULTIVO
	
	public Cultivo AtualizarPeriodo (Cultivo atualizarPeriodo );
	
	//

}
