package ar.edu.unlp.info.oo2.Ejercicio_15;

public class Temperatura {
	double temperaturaFahrenheit;
	double presion;
	double radiacionSolar;
	
	public Temperatura(double temperaturaFahrenheit, double presion, double radiacionSolar) {
		this.temperaturaFahrenheit = temperaturaFahrenheit;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
	}	
	
	//retorna la temperatura en grados Fahrenheit
	public double getTemperaturaFahrenheit() {
		return this.temperaturaFahrenheit;
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return this.presion;
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}
}
