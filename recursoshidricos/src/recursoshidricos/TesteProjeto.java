package recursoshidricos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.AtualizacaoCisterna;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Cisterna;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.MonitoramentoCisterna;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Recursos_Hidricos;

class TesteProjeto {

	@Test
	void Cadastrar_cisterna() {
		Recursos_Hidricos c = null;
		Cisterna cisterna = new Cisterna();
		Cisterna cc = c.Adicionar_Cisterna(cisterna);
		assertNotNull(cc);
		assertEquals(cisterna, cc.getId_Cisterna());
	}

	@Test
	void Remover_cisterna(Integer id_cisterna, Double capacidade_cisterna) {
		Recursos_Hidricos r = null;
		Cisterna cisterna = new Cisterna();
		Cisterna cr = r.Remover_Cisterna(id_cisterna, capacidade_cisterna);
		assertNotNull(cr); 
		assertEquals(cisterna, cr.getId_Cisterna());
	}

	@Test
	void Atualizar_cisterna(AtualizacaoCisterna atualizacao) {
		Recursos_Hidricos a = null;
		AtualizacaoCisterna cisterna = new AtualizacaoCisterna();
		AtualizacaoCisterna ac = a.Atualizar_Cisterna(atualizacao);
		assertNotNull(ac);
		assertEquals(cisterna, ac.getId_atualização());
	}

	@Test
	void Monitorar_Cisterna(MonitoramentoCisterna monitorar) {
		Recursos_Hidricos m = null;
		MonitoramentoCisterna cisterna = new MonitoramentoCisterna();
		MonitoramentoCisterna m = monitorar.Monitorar_Cisterna(monitorar);
		assertNotNull(m);
		assertEquals(cisterna, m.getId_monitoramento());
	}

}
