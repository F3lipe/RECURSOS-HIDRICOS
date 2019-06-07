package br.edu.ifpb.esperanca.daw2.RecursosHidricos.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.DAO.AtualizacaoCisternaDAO;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.AtualizacaoCisterna;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped

public class AtualizacaoCisternaService implements Serializable, Service<AtualizacaoCisterna> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private AtualizacaoCisternaDAO atualizacaoCisternaDAO;
	
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(AtualizacaoCisterna ac) {
		atualizacaoCisternaDAO.save(ac);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(AtualizacaoCisterna ac)  {
		atualizacaoCisternaDAO.update(ac);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(AtualizacaoCisterna ac) {
		atualizacaoCisternaDAO.remove(ac);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public AtualizacaoCisterna getByID(long acId)  {
			return atualizacaoCisternaDAO.getByID(acId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<AtualizacaoCisterna> getAll() {
			return atualizacaoCisternaDAO.getAll();
	}
		
}

