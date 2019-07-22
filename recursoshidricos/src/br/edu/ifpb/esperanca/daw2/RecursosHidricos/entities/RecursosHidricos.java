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
	
	//MONITORAMENTO
	
	public MonitoramentoCisterna AtualizarAguaGastaporTempo(MonitoramentoCisterna atualizarAguaGastaporTempo);
	public MonitoramentoCisterna AtualizarQuantidadeAguaEconomizada(MonitoramentoCisterna AtualizarQuantidadeAguaEconomizada);

	//ATUALIZAÇÃO
	
	public AtualizacaoCisterna AdicionarPeriodo (AtualizacaoCisterna adicionarPeriodo);
	public AtualizacaoCisterna AtualizarPeriodo(AtualizacaoCisterna atualizarPeriodo);
	
	//PRODUÇÃO
	
	public Producao AdicionarPlantio (Producao AdicionarPlantio);
	public Producao AtualizarPlantio (Producao AtualizarPlantio);
	public Producao AddAguaGasta    (Producao AddAguaGasta  );
	public Producao AddPeriodoPlantado (Producao AddPeriodoPlantado);
	public Producao AtualizarPeriodoPlantado (Producao AtualizarPeriodoPlantado);
	public Producao AddDatePlantacao (Producao Add_Date_Plantacao );
	public Producao AtualizarDatePlantacao (Producao AtualizarDatePlantacao);
	
	//USUARIO
	
	public Usuario AdicionarNome  (Usuario AdicionarNome);
	public Usuario AdicionarEndereco(Usuario AdcionarEndereco);
	public Usuario AdicionarEmail(Usuario AdicionarEmail);
	
	//IRRIGAÇÃO
	
	public Irrigacao AdicionarTempoIrrigacao(Irrigacao AdicionarTempoIrrigacao);
	public Irrigacao AdicionarDiasIrrigacao(Irrigacao AdicionarDiasIrrigacao);
	
	//
	public Cisterna Capacidade_cisterna(Cisterna cisterna);
	
		
	
	

	
	
	
	
	
}
