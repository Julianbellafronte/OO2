package ar.edu.unlp.info.oo2.Ejercicio_14;

import java.time.LocalDate;
import java.util.ArrayList;

public class FileOO2 {
	
	String nombre;
	String extension; 
	double tamano;
	LocalDate fecha_de_creacion;
	LocalDate fecha_de_modificacion;
	String permiso;
	
	ArrayList<String> orden;
	   
	public FileOO2(FileOO2Builder builder) {
			this.nombre = builder.getNombre();
			this.extension = builder.getExtension();
			this.tamano = builder.getTamano();
			this.fecha_de_creacion = builder.getFecha_de_creacion();
			this.fecha_de_modificacion = builder.getFecha_de_modificacion();
			this.permiso = builder.getPermiso();
			this.orden = builder.getOrden();
	}
	
	public String prettyPrint() {
		String salida = "";
		
		for(String s: this.orden) {
			salida += (s + " ");
		}
		
		return salida;
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public double getTamano() {
		return tamano;
	}

	public LocalDate getFecha_de_creacion() {
		return fecha_de_creacion;
	}

	public LocalDate getFecha_de_modificacion() {
		return fecha_de_modificacion;
	}

	public String getPermiso() {
		return permiso;
	}  
	
	
	

}
