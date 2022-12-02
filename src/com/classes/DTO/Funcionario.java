package com.classes.DTO;

public class Funcionario extends Pessoa {

	
	private String tipo;
	
	
	
	
	
	public Funcionario() {
		setTipo(tipo);
	}
	


	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
