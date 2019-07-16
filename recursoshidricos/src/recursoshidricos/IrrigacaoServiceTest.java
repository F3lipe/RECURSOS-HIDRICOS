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
		i.setTempo_Irrigacao(2.4);
		i.setDias_De_irrigacao(null);
		service.save(i);
		assertNotNull(i.getId());
		Irrigacao outro = service.getByID(i.getId());
		assertEquals(i.getId(), outro.getId());
		
		
		
	}


		
		
		
	
		
		
		
		
		
		
		
	} 