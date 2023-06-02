package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
	
	private double valorInternacional;
	
	public LlamadaInternacional(String emisor, String remitente, int duracion) {
		super(emisor, remitente, duracion);
		this.valorInternacional = 200;
	}
	
	public double getValorLlamada() {
		double valorLlamada = super.getDuracion() * this.valorInternacional;
		return valorLlamada + super.calcularIVA(valorLlamada);
	}

}
