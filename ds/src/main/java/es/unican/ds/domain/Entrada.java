package es.unican.ds.domain;

import java.util.Date;

public class Entrada {

	private Date fechaVisualizacion;
	private int numeroTemporada;
	private int numeroCapitulo;
	private double cargo;
	private Serie serie;
	public Entrada(Date fechaVisualizacion, int numeroTemporada, int numeroCapitulo, double cargo, Serie serie) {
		super();
		this.fechaVisualizacion = fechaVisualizacion;
		this.numeroTemporada = numeroTemporada;
		this.numeroCapitulo = numeroCapitulo;
		this.cargo = cargo;
		this.serie = serie;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public Date getFechaVisualizacion() {
		return fechaVisualizacion;
	}
	public void setFechaVisualizacion(Date fechaVisualizacion) {
		this.fechaVisualizacion = fechaVisualizacion;
	}
	public int getNumeroTemporada() {
		return numeroTemporada;
	}
	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}
	public int getNumeroCapitulo() {
		return numeroCapitulo;
	}
	public void setNumeroCapitulo(int numeroCapitulo) {
		this.numeroCapitulo = numeroCapitulo;
	}
	public double getCargo() {
		return cargo;
	}
	public void setCargo(double cargo) {
		this.cargo = cargo;
	}
	
}
