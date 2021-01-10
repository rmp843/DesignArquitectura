package es.unican.ds.domain;

public class MarcadorSerie {
	private int temporada;
	private int ultimoCapitulo;
	private Serie serie;
	
	public MarcadorSerie(int temporada, int ultimoCapitulo, Serie serie) {
		super();
		this.temporada = temporada;
		this.ultimoCapitulo = ultimoCapitulo;
		this.serie = serie;
	}
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	public int getUltimoCapitulo() {
		return ultimoCapitulo;
	}
	public void setUltimoCapitulo(int ultimoCapitulo) {
		this.ultimoCapitulo = ultimoCapitulo;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	
}
