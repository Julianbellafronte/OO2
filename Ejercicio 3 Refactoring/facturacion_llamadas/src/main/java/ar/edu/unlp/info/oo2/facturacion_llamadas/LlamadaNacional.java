package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {
	
	private double valorNacional;
	
	public LlamadaNacional(String emisor, String remitente, int duracion) {
		super(emisor, remitente, duracion);
		this.valorNacional = 3;
	}
	
	public double getValorLlamada() {
		double valorLlamada = super.getDuracion() * this.valorNacional;
		return valorLlamada + super.calcularIVA(valorLlamada);
	}

}
