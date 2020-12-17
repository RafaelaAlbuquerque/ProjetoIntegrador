package com.petdevs.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@NotEmpty
	private String nomeUsuario;
	
	@Column 
	@NotEmpty
	private String emailUsuario;
	 
	@Column
	@NotEmpty
	private String senhaUsuario;

	@Column
	@NotNull
	private String fotoUsuario;
	
	@Column
	@NotNull
	private double avaliacaoUsuario;
	
	@Column
	@NotNull
	private String telefoneUsuario;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Postagem> listaPostagens;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Animal> listaAnimais;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

	public String getTelefoneUsuario() {
		return telefoneUsuario;
	}

	public void setTelefoneUsuario(String telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}

	public double getAvaliacaoUsuario() {
		return avaliacaoUsuario;
	}

	public void setAvaliacaoUsuario(double avaliacaoUsuario) {
		this.avaliacaoUsuario = avaliacaoUsuario;
	}

	public List<Postagem> getListaPostagens() {
		return listaPostagens;
	}

	public void setListaPostagens(List<Postagem> listaPostagens) {
		this.listaPostagens = listaPostagens;
	}
	
}
