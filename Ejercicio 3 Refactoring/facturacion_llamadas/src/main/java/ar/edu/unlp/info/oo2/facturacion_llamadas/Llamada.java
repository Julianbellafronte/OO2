package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	
	private String emisor;
	private String remitente;
	private int duracion;	
	
	public Llamada(String emisor, String remitente, int duracion) {
		this.emisor = emisor;
		this.remitente = remitente;
		this.duracion = duracion;
	}
	
	protected double calcularIVA(double valor) {
		return (valor * 0.21);
	}
	
	public abstract double getValorLlamada();

	public String getEmisor() {
		return emisor;
	}
	public String getRemitente() {
		return remitente;
	}
	public int getDuracion() {
		return duracion;
	}	
}
