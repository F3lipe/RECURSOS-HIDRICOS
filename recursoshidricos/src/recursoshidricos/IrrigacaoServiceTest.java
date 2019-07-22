package recursoshidricos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Irrigacao;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.services.IrrigacaoService;

class IrrigacaoServiceTest {

	@Test
	void gerenciarIrrigacao() {
		IrrigacaoService service = new IrrigacaoService();
		Irrigacao i = new Irrigacao();
		i.setId(578L);
		i.setTempoIrrigacao(2.4);
		i.setDiasDeIrrigacao(null);
		service.save(i);
		assertNotNull(i.getId());
		Irrigacao outro = service.getByID(i.getId());
		assertEquals(i.getId(), outro.getId());
		
		
		
	}


		
		
		
	
		
		
		
		
		
		
		
	} 