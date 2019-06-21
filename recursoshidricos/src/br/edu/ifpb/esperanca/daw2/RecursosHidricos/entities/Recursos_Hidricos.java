package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;

public interface Recursos_Hidricos extends Identificavel {

	//CISTERNA
	
	public Cisterna AdicionarCisterna(Cisterna adicionarCisterna);
	public Cisterna RemoverCisterna(Integer id_cisterna, Double capacidade_cisterna);
	public Cisterna AtualizarCisterna (Cisterna atualizar);
	public Cisterna AdicionarLargura (Cisterna adicionarLargura);
	public Cisterna RemoverLargura(Cisterna removerLargura); 
	public Cisterna AdicionarComprimento(Cisterna adicionarComprimento);
	public Cisterna RemoverComprimento(Cisterna removerComprimento);
	
	//MONITORAMENTO
	
	public MonitoramentoCisterna AtualizarAguaGastaporTempo(MonitoramentoCisterna atualizar_AguaGasta_porTempo);
	public MonitoramentoCisterna AtualizarQuantidadeAguaEconomizada(MonitoramentoCisterna Atualizar_Quantidade_AguaEconomizada);

	//ATUALIZAÇÃO
	
	public AtualizacaoCisterna AdicionarPeriodo (AtualizacaoCisterna adicionarPeriodo);
	public AtualizacaoCisterna AtualizarPeriodo(AtualizacaoCisterna atualizarPeriodo);
	
	//PRODUÇÃO
	
	public Producao AdicionarPlantio (Producao AdicionarPlantio);
	public Producao AtualizarPlantio (Producao AtualizarPlantio);
	public Producao AddAguaGasta    (Producao Add_Agua_Gasta  );
	public Producao AddPeriodoPlantado (Producao Add_Periodo_Plantado);
	public Producao AtualizarPeriodoPlantado (Producao Atualizar_Periodo_Plantado);
	public Producao AddDatePlantacao (Producao Add_Date_Plantacao );
	public Producao AtualizarDatePlantacao (Producao Atualizar_Date_Plantacao);
	
	//USUARIO
	
	public Usuario AdicionarNome  (Usuario Adicionar_Nome);
	public Usuario AdicionarEndereco(Usuario Adcionar_Endereco);
	public Usuario AdicionarEmail(Usuario Adicionar_Email);
	
	//IRRIGAÇÃO
	
	public Irrigacao AdicionarTempoIrrigacao(Irrigacao Adicionar_Tempo_Irrigacao);
	public Irrigacao AdicionarDiasIrrigacao(Irrigacao Adicionar_Dias_Irrigacao);
	
	//
	public Cisterna Capacidade_cisterna(Cisterna cisterna);
	
		
	
	

	
	
	
	
	
}
