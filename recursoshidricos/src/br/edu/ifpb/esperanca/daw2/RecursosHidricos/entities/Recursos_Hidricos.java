package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;

public interface Recursos_Hidricos extends Identificavel {

	//CISTERNA
	
	public Cisterna Adicionar_Cisterna(Cisterna adicionarCisterna);
	public Cisterna Remover_Cisterna(Integer id_cisterna, Double capacidade_cisterna);
	public Cisterna Atualizar_Cisterna (Cisterna atualizar);
	public Cisterna Adicionar_Largura (Cisterna adicionarLargura);
	public Cisterna Remover_Largura(Cisterna removerLargura); 
	public Cisterna Adicionar_Comprimento(Cisterna adicionarComprimento);
	public Cisterna Remover_Comprimento(Cisterna removerComprimento);
	
	//MONITORAMENTO
	
	public MonitoramentoCisterna Atualizar_AguaGasta_porTempo(MonitoramentoCisterna atualizar_AguaGasta_porTempo);
	public MonitoramentoCisterna Atualizar_Quantidade_AguaEconomizada(MonitoramentoCisterna Atualizar_Quantidade_AguaEconomizada);

	//ATUALIZAÇÃO
	
	public AtualizacaoCisterna AdicionarPeriodo (AtualizacaoCisterna adicionarPeriodo);
	public AtualizacaoCisterna AtualizarPeriodo(AtualizacaoCisterna atualizarPeriodo);
	
	//PRODUÇÃO
	
	public Producao AdicionarPlantio (Producao AdicionarPlantio);
	public Producao AtualizarPlantio (Producao AtualizarPlantio);
	public Producao Add_Agua_Gasta    (Producao Add_Agua_Gasta  );
	public Producao Add_Periodo_Plantado (Producao Add_Periodo_Plantado);
	public Producao Atualizar_Periodo_Plantado (Producao Atualizar_Periodo_Plantado);
	public Producao Add_Date_Plantacao (Producao Add_Date_Plantacao );
	public Producao Atualizar_Date_Plantacao (Producao Atualizar_Date_Plantacao);
	
	//USUARIO
	
	public Usuario Adicionar_Nome  (Usuario Adicionar_Nome);
	public Usuario Adicionar_Endereco(Usuario Adcionar_Endereco);
	public Usuario Adicionar_Email(Usuario Adicionar_Email);
	
	//IRRIGAÇÃO
	
	public Irrigacao Adicionar_Tempo_Irrigacao(Irrigacao Adicionar_Tempo_Irrigacao);
	public Irrigacao Adicionar_Dias_Irrigacao(Irrigacao Adicionar_Dias_Irrigacao);
	
	



	

	
	
	

	
	
	
	
	
}
