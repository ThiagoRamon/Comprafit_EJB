package br.com.comprafit.sistem.ta;

public class GenericTas {
	private Long   id;
	private String codigo;
	private String nome;
	private String descricao;
	private String msgUsuario;
	private String msgLog;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMsgUsuario() {
		return msgUsuario;
	}
	public void setMsgUsuario(String msgUsuario) {
		this.msgUsuario = msgUsuario;
	}
	public String getMsgLog() {
		return msgLog;
	}
	public void setMsgLog(String msgLog) {
		this.msgLog = msgLog;
	}
	
}
