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
		a.setIdAtualização(123456789L);
		a.setPeriodoAguaAtualizada(new Date (2019,06,21)); 
		a.setCisterna(new Cisterna());
		a.setQuantLitrosAgua(2000);
		service.save(a);
		assertNotNull(a.getId());
		AtualizacaoCisterna outro = service.getByID(a.getId());
		assertEquals(a.getIdAtualização(), outro.getIdAtualização());
	} 

}