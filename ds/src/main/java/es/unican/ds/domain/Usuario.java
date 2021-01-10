package es.unican.ds.domain;

import java.util.LinkedList;
import java.util.List;

public class Usuario {

	public Usuario(String nUsuario, String contrasena, String IBAN) {
		super();
		this.nUsuario = nUsuario;
		this.contrasena = contrasena;
		this.IBAN = IBAN;
		this.facturas = new LinkedList<Factura>();
		this.marcadores = new LinkedList<MarcadorSerie>();
		this.visualizando = new LinkedList<SerieEnVisualizacion>();;
		this.seriesVisualizando = new LinkedList<Serie>();
		this.seriesFinalizadas = new LinkedList<Serie>();
		this.seriesPendientes = new LinkedList<Serie>();
	}
	
	private String nUsuario;
	private String contrasena;
	private String IBAN;
	private List<Factura> facturas;
	private List<MarcadorSerie> marcadores;
	private List<SerieEnVisualizacion> visualizando;
	private List<Serie> seriesVisualizando;
	private List<Serie> seriesFinalizadas;
	private List<Serie> seriesPendientes;
	
	public String getnUsuario() {
		return nUsuario;
	}
	public void ListnUsuario(String nUsuario) {
		this.nUsuario = nUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void ListContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void ListIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public List<Factura> getFacturas() {
		return facturas;
	}
	public void ListFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	public List<MarcadorSerie> getMarcadores() {
		return marcadores;
	}
	public void ListMarcadores(List<MarcadorSerie> marcadores) {
		this.marcadores = marcadores;
	}
	public List<SerieEnVisualizacion> getVisualizando() {
		return visualizando;
	}
	public void ListVisualizando(List<SerieEnVisualizacion> visualizando) {
		this.visualizando = visualizando;
	}
	public List<Serie> getSeriesVisualizando() {
		return seriesVisualizando;
	}
	public void ListSeriesVisualizando(List<Serie> seriesVisualizando) {
		this.seriesVisualizando = seriesVisualizando;
	}
	public List<Serie> getSeriesFinalizadas() {
		return seriesFinalizadas;
	}
	public void ListSeriesFinalizadas(List<Serie> seriesFinalizadas) {
		this.seriesFinalizadas = seriesFinalizadas;
	}
	public List<Serie> getSeriesPendientes() {
		return seriesPendientes;
	}
	public void ListSeriesPendientes(List<Serie> seriesPendientes) {
		this.seriesPendientes = seriesPendientes;
	}
	
}
