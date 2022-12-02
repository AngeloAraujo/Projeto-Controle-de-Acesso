package com.classes.DTO;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Acesso  {
	
	private Date entrada;
	private Date saida;
	private String setorautorizado;
	protected Funcionario funcionario;
	protected Visitante visitante;
	
	
	
	
	
	public Acesso(Date entrada, Date saida, String setorautorizado, Funcionario funcionario, Visitante visitante) {
		setEntrada(entrada);
		setSaida(saida);
		setSetorautorizado(setorautorizado);
		setFuncionario(funcionario);
		setVisitante(visitante);

	}
	
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public Date getSaida() {
		return saida;
	}
	public void setSaida(Date saida) {
		this.saida = saida;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Visitante getVisitante() {
		return visitante;
	}
	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	public String getSetorautorizado() {
		return setorautorizado;
	}

	public void setSetorautorizado(String setorautorizado) {
		this.setorautorizado = setorautorizado;
	}
	
	public String tempototal(Date inicio, Date fim)  {
		
		Calendar datainicio = new GregorianCalendar();

		datainicio.setTime(inicio);

		Calendar datafim = new GregorianCalendar();

		datafim.setTime(fim);
 
		long periodo = (datafim.getTimeInMillis() - datainicio.getTimeInMillis());
		long segundos = ( periodo/ 1000 ) % 60;      
		long minutos  = ( periodo / 60000 ) % 60;    
		long horas    = periodo/ 3600000;            


		return ( String.format( "%03d:%02d", horas, minutos,segundos ));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Acesso [entrada=");
		builder.append(entrada);
		builder.append(", saida=");
		builder.append(saida);
		builder.append(", setorautorizado=");
		builder.append(setorautorizado);
		builder.append(", funcionario=");
		builder.append(funcionario);
		builder.append(", visitante=");
		builder.append(visitante);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
