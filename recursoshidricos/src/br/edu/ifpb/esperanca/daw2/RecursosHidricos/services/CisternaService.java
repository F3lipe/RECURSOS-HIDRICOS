package br.edu.ifpb.esperanca.daw2.RecursosHidricos.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.DAO.CisternaDAO;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Cisterna;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped

public class CisternaService implements Serializable, Service<Cisterna> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private CisternaDAO cisternaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Cisterna cist) {
		cisternaDAO.save(cist);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Cisterna cist)  {
		cisternaDAO.update(cist);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Cisterna cist) {
		cisternaDAO.remove(cist);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Cisterna getByID(long cistId)  {
			return cisternaDAO.getByID(cistId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Cisterna> getAll() {
			return cisternaDAO.getAll();
	}
		
}

