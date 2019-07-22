package br.edu.ifpb.esperanca.daw2.RecursosHidricos.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Producao;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Usuario;

class ProducaoServiceTest {

	@Test
	void gerenciarProducao() {
		ProducaoService service = new ProducaoService();
		Producao p = new Producao ();
		p.setCultivoPlantado("cultivoPlantado");
		p.setDataDoPlantio ( new Date(2019, 6,21));
		p.setQuantAguaGasta(1000.00);
		p.setQuantPlantadaPArea(5000.00);
		service.save(p);
		assertNotNull(p.getId());
		Producao outro = service.getByID(p.getId());
		assertEquals(p.getCultivoPlantado(), outro.getCultivoPlantado());
		
	}

}
