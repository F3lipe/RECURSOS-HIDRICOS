package br.edu.ifpb.esperanca.daw2.RecursosHidricos.services;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.RecursosHidricos.DAO.UsuarioDAO;
import br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped
public class UsuarioService implements Serializable, Service<Usuario> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private UsuarioDAO userDAO;
	

	@Override
	@TransacionalCdi
	public void save(Usuario user) {
		userDAO.save(user);
	}

	@Override
	@TransacionalCdi
	public void update(Usuario user)  {
			userDAO.update(user);
	}

	@Override
	@TransacionalCdi
	public void remove(Usuario user) {
		userDAO.remove(user);
	}

	@Override
	public Usuario getByID(long userId)  {
			return userDAO.getByID(userId);
	}

	@Override
	public List<Usuario> getAll() {
			return userDAO.getAll();
	}
		
}
