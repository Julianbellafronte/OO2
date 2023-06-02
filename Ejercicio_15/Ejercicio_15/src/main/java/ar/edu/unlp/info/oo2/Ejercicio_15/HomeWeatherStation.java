package ar.edu.unlp.info.oo2.Ejercicio_15;

import java.util.ArrayList;

public class HomeWeatherStation {
	
	ArrayList<Temperatura> temperaturas;
	
	
	public HomeWeatherStation(double temperaturaFahrenheit, double presion, double radiacionSolar) {
		this.temperaturas = new ArrayList<Temperatura>();
	}	
	
	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public ArrayList<Double> getTemperaturasFahrenheit() {
		ArrayList<Double> temperaturaF = new ArrayList<Double>();
		for(Temperatura temps: this.temperaturas) {
			temperaturaF.add(temps.getTemperaturaFahrenheit());
		}	
		return temperaturaF;
	}


}
