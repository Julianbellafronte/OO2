package ar.edu.unlp.info.oo2.Ejercicio_19;
import java.util.ArrayList;
public class Mago extends Personaje{
	
	TipoPersonaje tipo;	
	
	public Mago(String nombre) {
		super(nombre);
		
		ArrayList<Habilidad> habilidades =  new ArrayList<Habilidad>();
		habilidades.add(new Habilidad("Magia"));
		habilidades.add(new Habilidad("Combate a distancia"));
		
		Arma baston = new Arma("Baston", 2);
		this.tipo = new TipoPersonaje(baston,"Cuero",habilidades);
		
	}
	
}
