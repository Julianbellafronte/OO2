package ar.edu.unlp.info.oo2.Ejercicio_15;

import java.util.ArrayList;

public class Station {
	double temperaturaCelsius;
	double presion;
	double radiacionSolar;
	ArrayList<String> orden;
	
	public Station(StationBuilder builder) {
		this.temperaturaCelsius = builder.getTemperaturaCelsius();
		this.presion = builder.getPresion();
		this.radiacionSolar = builder.getRadiacionSolar();
		this.orden = builder.getOrden();
	}
	
	
	public String displayData() {
		String salida = "";
		
		for(String s: this.orden) {
			salida += (s + " ");
		}
		
		return salida;
	}
	

	
	
	
	
}
