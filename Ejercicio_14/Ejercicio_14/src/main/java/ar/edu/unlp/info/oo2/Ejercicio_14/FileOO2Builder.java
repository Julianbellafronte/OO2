package ar.edu.unlp.info.oo2.Ejercicio_14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FileOO2Builder {
	String nombre;
	String extension; 
	double tamano;
	LocalDate fecha_de_creacion;
	LocalDate fecha_de_modificacion;
	String permiso;
	
	ArrayList<String> orden;
	
	public FileOO2Builder() {
		this.orden = new ArrayList<String>();
	}
	
	public FileOO2Builder nombre(String nombre) {
		this.nombre = nombre;
		this.orden.add(nombre);
		return this;
	}
	public FileOO2Builder extension(String extension) {
		this.extension = extension;
		this.orden.add(extension);
		return this;
	}
	public FileOO2Builder tamano(double tamano) {
		this.tamano = tamano;
		this.orden.add(Double.toString(tamano));
		return this;
	}
	public FileOO2Builder fechaCreacion(LocalDate fecha_de_creacion) {
		this.fecha_de_creacion = fecha_de_creacion;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String fechaCreacion = fecha_de_creacion.format(formatter);
		this.orden.add(fechaCreacion);
		return this;
	}
	public FileOO2Builder fechaModificacion(LocalDate fecha_de_modificacion) {
		this.fecha_de_modificacion = fecha_de_modificacion;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String fechaModificacion = fecha_de_modificacion.format(formatter);
		this.orden.add(fechaModificacion);
		return this;
	}
	public FileOO2Builder permiso(String permiso) {
		this.permiso = permiso;
		this.orden.add(permiso);
		return this;
	}
	
	public FileOO2 build() {
        return new FileOO2(this);
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
	public ArrayList<String> getOrden(){
		return orden;
	}
	
	
	
	
	
}
