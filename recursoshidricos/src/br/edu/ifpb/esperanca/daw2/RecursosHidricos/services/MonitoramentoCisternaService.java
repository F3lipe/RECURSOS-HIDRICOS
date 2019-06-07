package br.edu.ifpb.esperanca.daw2.RecursosHidricos.services;

import java.io.Serializable;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.DAO.MonitoramentoCisternaDAO;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.MonitoramentoCisterna;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped

public class MonitoramentoCisternaService implements Serializable, Service<MonitoramentoCisterna> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private MonitoramentoCisternaDAO monitoramentoCisternaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(MonitoramentoCisterna m) {
		monitoramentoCisternaDAO.save(m);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(MonitoramentoCisterna m)  {
		monitoramentoCisternaDAO.update(m);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(MonitoramentoCisterna m) {
		monitoramentoCisternaDAO.remove(m);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public MonitoramentoCisterna getByID(long m)  {
			return monitoramentoCisternaDAO.getByID(m);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<MonitoramentoCisterna> getAll() {
			return monitoramentoCisternaDAO.getAll();
	}
		
}

