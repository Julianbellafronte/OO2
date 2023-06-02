package ar.edu.unlp.info.oo2.Ejercicio_4;

import java.util.ArrayList;

public class Mixta implements Topografia {
	
	ArrayList<Topografia> topografia;
	
	public Mixta(ArrayList<Topografia> topografias) {
		topografia = topografias;
	}
	
	public double calcularProporcion() {
		double proporcionParcial = 0;
		for(Topografia topo: this.topografia) {
			proporcionParcial += topo.calcularProporcion();
		}
		return proporcionParcial / this.topografia.size();
	}
	

}
