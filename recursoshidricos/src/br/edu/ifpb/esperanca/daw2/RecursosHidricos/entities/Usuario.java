package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario implements Identificavel{
	
	@Id 
	
	private Long id;
	private String nome;
	private String cidade;
	private int numero_Telefone;
	private String email;
	private String estado;
	
	
	

	public Usuario() {
		super();
	}

	
	public Usuario(String nome, String cidade, int numero_Telefone, String email, String estado) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.numero_Telefone = numero_Telefone;
		this.email = email;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero_Telefone() {
		return numero_Telefone;
	}

	public void setNumero_Telefone(int numero_Telefone) {
		this.numero_Telefone = numero_Telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numero_Telefone;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero_Telefone != other.numero_Telefone)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cidade=" + cidade + ", numero_Telefone=" + numero_Telefone + ", email="
				+ email + ", estado=" + estado + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

}
