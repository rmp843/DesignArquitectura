package es.unican.ds.domain;

import java.util.List;

public class Factura {
	private int idFactura;
	private int mes;
	private int ano;
	private List<Entrada> entradas;

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public List<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(List<Entrada> entradas) {
		this.entradas = entradas;
	}

	public Factura(int idFactura, int mes, int ano, List<Entrada> entradas) {
		super();
		this.idFactura = idFactura;
		this.mes = mes;
		this.ano = ano;
		this.entradas = entradas;
	}
	
}
