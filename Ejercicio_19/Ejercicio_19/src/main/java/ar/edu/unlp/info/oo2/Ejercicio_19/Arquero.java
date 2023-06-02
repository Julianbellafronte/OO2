package ar.edu.unlp.info.oo2.Ejercicio_19;

import java.util.ArrayList;

public class Arquero extends Personaje{
	
	TipoPersonaje tipo;	
	
	public Arquero(String nombre) {
		super(nombre);
		
		ArrayList<Habilidad> habilidades =  new ArrayList<Habilidad>();
		habilidades.add(new Habilidad("Combate a distancia"));
		
		Arma arco = new Arma("Arco", 5);
		this.tipo = new TipoPersonaje(arco,"Cuero", habilidades);
		
	}
	
}
