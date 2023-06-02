package ar.edu.unlp.info.oo2.Ejercicio_19;

public class Acero extends Armadura{

	public Acero(String nombre) {
		super(nombre);
	}
	
	public int proteger(int danio) {
		int golpe = (danio / 2)-1;
		if  (golpe < 1) {
			return 1;
		}else {
			return golpe;
		}
	}
}
