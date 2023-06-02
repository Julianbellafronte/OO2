package ar.edu.unlp.info.oo2.Ejercicio_15;

import java.util.ArrayList;

public class StationBuilder {

	double temperaturaCelsius;
	double presion;
	double radiacionSolar;
	ArrayList<String> orden;
	
	
	public StationBuilder() {
		this.orden = new ArrayList<String>();
	}
	
	public StationBuilder temperaturaCelsius(double temperaturaFahrenheit) {
		this.temperaturaCelsius = this.convertToCelsius(temperaturaFahrenheit);
		this.orden.add(Double.toString(temperaturaCelsius));
		return this;
	}
	
	public StationBuilder presion(double presion) {
		this.presion = presion;
		this.orden.add(Double.toString(presion));
		return this;
	}
	
	public StationBuilder radiacionSolar(double radiacionSolar) {
		this.radiacionSolar = radiacionSolar;
		this.orden.add(Double.toString(radiacionSolar));
		return this;
	}
	
	public Station build() {
		return new Station(this);
	}
	
	private double convertToCelsius(double tempF) {
		return ((tempF -32) / 1.8);
	}
	
	
	public double getTemperaturaCelsius() {
		return this.temperaturaCelsius;
	}

	public double getPresion() {
		return this.presion;
	}

	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}

	public ArrayList<String> getOrden() {
		// TODO Auto-generated method stub
		return null;
	}

}
