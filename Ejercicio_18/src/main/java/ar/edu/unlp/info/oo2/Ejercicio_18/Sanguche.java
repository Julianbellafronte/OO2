package ar.edu.unlp.info.oo2.Ejercicio_18;

import java.util.ArrayList;

public class Sanguche {
	
	private ArrayList<Ingrediente> ingredientes;
	
	public Sanguche(Builder builder) {
		this.ingredientes = builder.getIngredientes();
	}
	
	public double calcularPrecio() {
		double precio = 0;
		for(Ingrediente in: this.ingredientes) {
			precio += in.getPrecio();
		}
		return precio;
	}
	
	

}
