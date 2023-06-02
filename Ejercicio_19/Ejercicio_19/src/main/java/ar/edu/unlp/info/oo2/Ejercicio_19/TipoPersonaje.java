package ar.edu.unlp.info.oo2.Ejercicio_19;

import java.util.ArrayList;

public class TipoPersonaje {

	Arma arma;
	Armadura armadura;
	ArrayList<Habilidad> habilidades;
	
	public TipoPersonaje(Arma arma, String armadura, ArrayList<Habilidad> habilidades) {
		this.arma = arma;
		this.armadura = new Armadura(armadura);
		this.habilidades = habilidades;
	}

	public Arma getArma() {
		return arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}
	
	
	

	
	
}
