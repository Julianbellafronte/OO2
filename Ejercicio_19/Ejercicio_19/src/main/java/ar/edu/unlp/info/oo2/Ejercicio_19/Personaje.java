package ar.edu.unlp.info.oo2.Ejercicio_19;

public abstract class Personaje {

	String nombre;
	int vida;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
		this.vida = 100;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}
	
	
	
}
