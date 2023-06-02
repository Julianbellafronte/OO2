package ar.edu.unlp.info.oo2.Ejercicio_19;

import java.util.ArrayList;

public class Thoor extends Personaje{
	
	TipoPersonaje tipo;	
	
	public Thoor(String nombre) {
		super(nombre);
		
		ArrayList<Habilidad> habilidades =  new ArrayList<Habilidad>();
		habilidades.add(new Habilidad("Lanzar rayos"));
		habilidades.add(new Habilidad("Combate a distancia"));
		
		Arma martillo = new Arma("Martillo", 10);
		this.tipo = new TipoPersonaje(martillo,"Hierro", habilidades);
		
	}
	
}
