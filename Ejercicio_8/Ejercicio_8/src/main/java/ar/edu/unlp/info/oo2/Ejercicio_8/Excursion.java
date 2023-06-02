package ar.edu.unlp.info.oo2.Ejercicio_8;

import java.time.LocalDate;
import java.util.ArrayList;

public class Excursion {
	String nombre;
	LocalDate fecha_de_inicio;
	LocalDate fecha_de_fin;
	String punto_de_encuentro;
	double costo;
	int cupo_minimo;
	int cupo_maximo;
	Inscripcion estado;
	ArrayList<Usuario> usuarios_inscriptos;
	ArrayList<Usuario> usuarios_espera;
		
	public Excursion(String nombre, LocalDate fecha_de_inicio, LocalDate fecha_de_fin, String punto_de_encuentro,
			double costo, int cupo_minimo, int cupo_maximo) {
		this.nombre = nombre;
		this.fecha_de_inicio = fecha_de_inicio;
		this.fecha_de_fin = fecha_de_fin;
		this.punto_de_encuentro = punto_de_encuentro;
		this.costo = costo;
		this.cupo_minimo = cupo_minimo;
		this.cupo_maximo = cupo_maximo;
		this.estado = new Inscripcion_Provisoria();
		this.usuarios_inscriptos = new ArrayList<Usuario>();
		this.usuarios_espera = new ArrayList<Usuario>();
	}
	
	public void inscribir(Usuario usuario) {
		if(this.usuarios_inscriptos.size() < this.cupo_maximo) {
			this.usuarios_inscriptos.add(usuario);
			this.evaluarEstado();
		}else {
			this.usuarios_espera.add(usuario);
		}
	}
	
	private void evaluarEstado() {
		if(this.usuarios_inscriptos.size() == this.cupo_maximo) {
			this.estado = new Inscripcion_Llena();
		}else if(this.usuarios_inscriptos.size() >= this.cupo_minimo) {
			this.estado = new Inscripcion_Definitiva();
		}
	}
	
	public void obtener_Informacion() {
		System.out.println(this.estado.obtener_Informacion(this));
	}
	
	

	public ArrayList<Usuario> getUsuarios_inscriptos() {
		return usuarios_inscriptos;
	}

	public ArrayList<Usuario> getUsuarios_espera() {
		return usuarios_espera;
	}

	public String getNombre() {
		return nombre;
	}
	public LocalDate getFecha_de_inicio() {
		return fecha_de_inicio;
	}
	public LocalDate getFecha_de_fin() {
		return fecha_de_fin;
	}
	public String getPunto_de_encuentro() {
		return punto_de_encuentro;
	}
	public double getCosto() {
		return costo;
	}
	public int getCupo_minimo() {
		return cupo_minimo;
	}
	public int getCupo_maximo() {
		return cupo_maximo;
	}
	public Inscripcion getEstado() {
		return estado;
	}
	
	

	

	
	
}
