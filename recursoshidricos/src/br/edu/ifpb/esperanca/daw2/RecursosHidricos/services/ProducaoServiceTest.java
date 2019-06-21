package br.edu.ifpb.esperanca.daw2.RecursosHidricos.services;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Producao;

class ProducaoServiceTest {

	@Test
	void gerenciarProducao() {
		ProducaoService service = new ProducaoService();
		Producao p = new Producao ();
		p.setCultivoPlantado("cultivoPlantado");
		p.setDataDoPlantio ( new Date(2019, 6,21));
		
		fail("Not yet implemented");
	}

}
