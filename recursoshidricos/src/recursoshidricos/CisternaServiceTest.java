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
		c.setCapacidade_cisterna(10000.0);
		c.setComprimento_cisterna(1000.0);
		c.setLargura_cisterna(1000.0);
		c.setProfundidade_cisterna(200.00);
		c.setQuantLitrosAgua(1000.00);
		service.save(c);
		assertNotNull(c.getId());
	
		
	}
}

