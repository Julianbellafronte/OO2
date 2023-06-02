package ar.edu.unlp.info.oo2.Ejercicio_18;

import java.util.ArrayList;

public class Builder {

	private ArrayList<Ingrediente> ingredientes;
	
	public Builder ingrediente(String nombre, double precio) {
		if (this.ingredientes == null) {
			this.ingredientes = new ArrayList<Ingrediente>();
		}
		this.ingredientes.add(new Ingrediente(nombre, precio));
		return this;
	}
	
	public Sanguche build(){
		return new Sanguche(this);
	}
	
	public ArrayList<Ingrediente> getIngredientes(){
		return this.ingredientes;
	}
}
