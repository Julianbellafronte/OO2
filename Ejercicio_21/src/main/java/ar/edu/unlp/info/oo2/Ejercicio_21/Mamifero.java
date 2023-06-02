package ar.edu.unlp.info.oo2.Ejercicio_21;

import java.time.LocalDate;

public class Mamifero {
	
	private int id;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;

	public Mamifero(Mamifero madre, Mamifero padre) {
		this.madre = madre;
		this.padre = padre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	
	public boolean tieneComoAncestro(Mamifero mamifero) {
		if(this == mamifero) {
			return true;
		}else{
			if(this.madre != null && this.madre.tieneComoAncestro(mamifero)) {
				return true;
			}
			if(this.padre != null && this.padre.tieneComoAncestro(mamifero)) {
			    return true;
			}
		}
		return false;
	}
	
	
	

}
