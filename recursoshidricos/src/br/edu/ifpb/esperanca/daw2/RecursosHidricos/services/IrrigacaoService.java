package br.edu.ifpb.esperanca.daw2.RecursosHidricos.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.DAO.IrrigacaoDAO;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Irrigacao;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped

public class IrrigacaoService implements Serializable, Service<Irrigacao> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private IrrigacaoDAO irrigacaoDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Irrigacao i) {
		irrigacaoDAO.save(i);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Irrigacao i)  {
		irrigacaoDAO.update(i);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Irrigacao i) {
		irrigacaoDAO.remove(i);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Irrigacao getByID(long i)  {
			return irrigacaoDAO.getByID(i);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Irrigacao> getAll() {
			return irrigacaoDAO.getAll();
	}
		
}

