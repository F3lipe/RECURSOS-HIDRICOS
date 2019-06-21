package recursoshidricos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.AtualizacaoCisterna;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Cisterna;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.services.AtualizacaoCisternaService;

class AtualizacaoCisternaServiceTest {

	@Test
	void gerenciarAtualizacao() {
		AtualizacaoCisternaService service = new AtualizacaoCisternaService();
		AtualizacaoCisterna a = new AtualizacaoCisterna();
		a.setId_atualização(123456789L);
		a.setPeriodo_agua_atualizada(new Date (2019,06,21)); 
		a.setCisterna(new Cisterna());
		a.setQuant_litros_agua(2000);
		service.save(a);
		assertNotNull(a.getId());
		AtualizacaoCisterna outro = service.getByID(a.getId());
		assertEquals(a.getId_atualização(), outro.getId_atualização());
	} 

}