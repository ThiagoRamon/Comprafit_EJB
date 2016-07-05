package br.com.comprafit.sistem.ta;

import java.util.Date;

public class TipoBean extends GenericTas {
	
	private Date dataCadastro;
	private Date dataAlteracao;
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	
}
