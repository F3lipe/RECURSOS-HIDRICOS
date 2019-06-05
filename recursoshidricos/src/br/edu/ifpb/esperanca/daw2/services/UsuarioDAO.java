package br.edu.ifpb.esperanca.daw2.services;

import recursoshidricos.AtualizacaoCisterna;
import recursoshidricos.DAO;
import recursoshidricos.Usuario;

public class UsuarioDAO extends DAO<Usuario>{
	
	public UsuarioDAO() {
		super (Usuario.class);
	}
}

