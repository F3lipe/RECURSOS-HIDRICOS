package recursoshidricos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Cisterna;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.services.CisternaService;

class CisternaServiceTest {

	@Test
	void gerenciarCisterna() {
		CisternaService service = new CisternaService ();
		Cisterna c = new Cisterna();
		c.setCapacidadeCisterna(10000.0);
		c.setComprimentoCisterna(1000.0);
		c.setLarguraCisterna(1000.0);
		c.setProfundidadeCisterna(200.00);
		service.save(c);
		assertNotNull(c.getId());
	
		
	}
}

