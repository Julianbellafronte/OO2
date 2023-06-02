package ar.edu.unlp.info.oo2.Ejercicio_19;

public abstract class Armadura {
	
	String nombre;
	
	public Armadura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public abstract int proteger(int danio);
}
