package br.edu.ifpb.esperanca.daw2.RecursosHidricos.entities;


import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
 
@Entity
public class Usuario implements Identificavel{
	
	@Id 
	@GeneratedValue(generator="usu_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="usu_seq")
	private Long id;
	private String nome;
	private String cidade;
	private int numeroTelefone;
	private String email;
	private String estado;
	private ArrayList<Producao> producao;
	private ArrayList<Irrigacao> irrigacao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public int getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
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
	public ArrayList<Producao> getProducao() {
		return producao;
	}
	public void setProducao(ArrayList<Producao> producao) {
		this.producao = producao;
	}
	public ArrayList<Irrigacao> getIrrigacao() {
		return irrigacao;
	}
	public void setIrrigacao(ArrayList<Irrigacao> irrigacao) {
		this.irrigacao = irrigacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((irrigacao == null) ? 0 : irrigacao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroTelefone;
		result = prime * result + ((producao == null) ? 0 : producao.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (irrigacao == null) {
			if (other.irrigacao != null)
				return false;
		} else if (!irrigacao.equals(other.irrigacao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroTelefone != other.numeroTelefone)
			return false;
		if (producao == null) {
			if (other.producao != null)
				return false;
		} else if (!producao.equals(other.producao))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", numeroTelefone=" + numeroTelefone
				+ ", email=" + email + ", estado=" + estado + ", producao=" + producao + ", irrigacao=" + irrigacao
				+ "]";
	}
	public Usuario(Long id, String nome, String cidade, int numeroTelefone, String email, String estado,
			ArrayList<Producao> producao, ArrayList<Irrigacao> irrigacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
		this.estado = estado;
		this.producao = producao;
		this.irrigacao = irrigacao;
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	
	
	


