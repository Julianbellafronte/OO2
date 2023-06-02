package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
	private String tipo;
	private String emisor;
	private String remitente;
	private int duracion;	
	private double valorInternacional;
	private double valorNacional;
	
	public Llamada(String tipo, String emisor, String remitente, int duracion) {
		this.tipo = tipo;
		this.emisor = emisor;
		this.remitente = remitente;
		this.duracion = duracion;
		this.valorInternacional = 200;
		this.valorNacional = 3;
	}
	
	private double calcularIVA(double valor) {
		return (valor * 0.21);
	}
	
	private double getValorLlamadaNacional() {
		double valorLlamada = this.duracion * this.valorNacional;
		return valorLlamada + this.calcularIVA(valorLlamada);
	}
	
	private double getValorLlamadaInternacional() {
		double valorLlamada = this.duracion * this.valorInternacional;
		return valorLlamada + this.calcularIVA(valorLlamada);
	}
	
	public double getValorLlamada() {
		if (this.tipo == "nacional") {
			return this.getValorLlamadaNacional();
		}
		return this.getValorLlamadaInternacional();
	}
	
	public String getTipo() {
		return tipo;
	}
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
