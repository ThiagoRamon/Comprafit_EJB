package br.com.comprafit.usuario.model;

public class UsuarioBean {
	
	private Long   id;
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private String keySystem;
	
	
	public String getKeySystem() {
		return keySystem;
	}
	public void setKeySystem(String keySystem) {
		this.keySystem = keySystem;
	}
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
