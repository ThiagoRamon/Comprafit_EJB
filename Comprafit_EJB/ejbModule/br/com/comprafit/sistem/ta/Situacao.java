package br.com.comprafit.sistem.ta;

import java.util.Calendar;
import java.util.Date;

public class Situacao extends GenericTas {
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
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); 
		c.set(Calendar.YEAR, 2015);
		c.set(Calendar.MONTH, 01);
		c.set(Calendar.DAY_OF_MONTH, 01);
		System.out.println(c.getTime());
	}
	
	
}
