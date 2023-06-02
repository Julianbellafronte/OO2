package ar.edu.unlp.info.oo2.Ejercicio_8;

public class Usuario {

	String nombre;
	String apellido;
	String email;
	
	public Usuario(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getEmail() {
		return email;
	}
	
	
}
