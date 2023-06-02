package ar.edu.unlp.info.oo2.Ejercicio_19;

import java.util.ArrayList;

public class Guerrero extends Personaje{
	
	TipoPersonaje tipo;	
	
	public Guerrero(String nombre) {
		super(nombre);
		
		ArrayList<Habilidad> habilidades =  new ArrayList<Habilidad>();
		habilidades.add(new Habilidad("Cuerpo a cuerpo"));
		
		Arma espada = new Arma("Espada", 8);
		this.tipo = new TipoPersonaje(espada,"Acero", habilidades);
		
	}
	
}
