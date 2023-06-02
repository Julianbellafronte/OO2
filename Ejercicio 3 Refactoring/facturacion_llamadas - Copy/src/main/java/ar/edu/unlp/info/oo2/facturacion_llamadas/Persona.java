package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private List<Llamada> llamadas;
	private String tipoDePersona;
	private String nombreYApellido;
	private String telefono;
	private String cuit;
	private String documento;	
	
	public Persona(String tipoDePersona, String nombreYApellido, String telefono, String documento) {
		this.tipoDePersona = tipoDePersona;
		this.nombreYApellido = nombreYApellido;
		this.telefono = telefono;
		this.cuit = documento;
		this.documento = documento;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	public String getTipoDePersona() {
		return tipoDePersona;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getCuit() {
		return cuit;
	}
	public String getDocumento() {
		return documento;
	}
	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
}
