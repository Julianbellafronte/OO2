package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
	private List<Llamada> llamadas;
	private String nombreYApellido;
	private String telefono;
	
	public Persona(String nombreYApellido, String telefono) {
		this.nombreYApellido = nombreYApellido;
		this.telefono = telefono;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public abstract String getTipoDePersona();
	
	public abstract String getIdentificacion();
	
	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
	
	public abstract double getDescuento();
}
