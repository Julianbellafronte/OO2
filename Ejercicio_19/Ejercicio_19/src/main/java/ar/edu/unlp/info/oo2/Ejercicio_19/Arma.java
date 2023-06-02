package ar.edu.unlp.info.oo2.Ejercicio_19;

public class Arma {
	
	String tipo;
	int danio;
	
	public Arma(String tipo, int danio) {
		this.tipo = tipo;
		this.danio = danio;
	}

	public String getTipo() {
		return tipo;
	}
	
	public int getDanio() {
		return danio;
	}

}
