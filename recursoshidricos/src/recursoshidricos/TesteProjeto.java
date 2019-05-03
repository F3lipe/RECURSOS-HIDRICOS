package recursoshidricos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.result.NoMoreReturnsException;
import org.junit.jupiter.api.Test;

class TesteProjeto {

	@Test
	void Cadastrar_cisterna() {
		Recursos_Hidricos c = null;
		CadastroCisterna cisterna = new CadastroCisterna();
		CadastroCisterna cc = c.Cadastrar_cisterna(cisterna);
		assertNotNull(cc);
		assertEquals(cisterna, cc.getId_Cisterna());
	}

	@Test
	void Remover_cisterna(Integer id_cisterna, Double capacidade_cisterna) {
		Recursos_Hidricos r = null;
		CadastroCisterna cisterna = new CadastroCisterna();
		CadastroCisterna cr = r.Remover_cisterna(id_cisterna, capacidade_cisterna);
		assertNotNull(cr); 
		assertEquals(cisterna, cr.getId_Cisterna());
	}

	@Test
	void Atualizar_cisterna(AtualizacaoCisterna atualizacao) {
		Recursos_Hidricos a = null;
		AtualizacaoCisterna cisterna = new AtualizacaoCisterna();
		AtualizacaoCisterna ac = a.Atualizar_cisterna(atualizacao);
		assertNotNull(ac);
		assertEquals(cisterna, ac.getId_atualização());
	}

	@Test
	void Monitorar_Cisterna(MonitoramentoCisterna monitorar) {
		Recursos_Hidricos m = null;
		MonitoramentoCisterna cisterna = new MonitoramentoCisterna();
		MonitoramentoCisterna mc = m.Monitorar_Cisterna(monitorar);
		assertNotNull(mc);
		assertEquals(cisterna, mc.getId_monitoramento());
	}

}
