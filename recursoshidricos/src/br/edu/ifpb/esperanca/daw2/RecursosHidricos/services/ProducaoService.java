package br.edu.ifpb.esperanca.daw2.RecursosHidricos.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.DAO.ProducaoDAO;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Producao;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped

public class ProducaoService implements Serializable, Service<Producao> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private ProducaoDAO producaoDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Producao p) {
		producaoDAO.save(p);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Producao p)  {
		producaoDAO.update(p);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Producao p) {
		producaoDAO.remove(p);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Producao getByID(long pId)  {
			return producaoDAO.getByID(pId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Producao> getAll() {
			return producaoDAO.getAll();
	}
		
}

