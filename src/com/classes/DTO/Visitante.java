package com.classes.DTO;

public class Visitante extends Pessoa {

	private String cidade;
	protected Pessoa pessoa;
	
	
	public Visitante() {
		setCidade(cidade);
		setPessoa(pessoa);
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Visitante [cidade=");
		builder.append(cidade);
		builder.append(", pessoa=");
		builder.append(pessoa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
