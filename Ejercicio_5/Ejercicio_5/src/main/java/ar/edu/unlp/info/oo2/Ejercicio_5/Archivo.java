package ar.edu.unlp.info.oo2.Ejercicio_5;

import java.time.LocalDate;

public class Archivo {
	
	
	String name;
	LocalDate date;
	int tamano;
	
    /**
* Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano 
* y en la fecha <fecha>.
    */
    public Archivo (String nombre, LocalDate fecha, int tamano) {
    	this.name = nombre;
    	this.date = fecha;
    	this.tamano = tamano;
    }

	public String getName() {
		return name;
	}


	public LocalDate getDate() {
		return date;
	}

	public int getTamano() {
		return tamano;
	}
}
