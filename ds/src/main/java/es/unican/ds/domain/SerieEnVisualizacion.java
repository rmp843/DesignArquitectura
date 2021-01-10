package es.unican.ds.domain;

public class SerieEnVisualizacion {

	private int[][] capitulosVistos;
	private Serie serie;
	
	public SerieEnVisualizacion(int[][] capitulosVistos, Serie serie) {
		super();
		this.capitulosVistos = capitulosVistos;
		this.serie = serie;
	}
	
	public int[][] getCapitulosVistos() {
		return capitulosVistos;
	}
	public void setCapitulosVistos(int[][] capitulosVistos) {
		this.capitulosVistos = capitulosVistos;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	
}
