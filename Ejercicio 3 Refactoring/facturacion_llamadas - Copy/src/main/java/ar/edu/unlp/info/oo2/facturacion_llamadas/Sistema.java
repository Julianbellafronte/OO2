package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Persona> usuarios;
	private List<Llamada> llamadas;
	private GuiaTelefonica guiaTelefonica;
	private static double descuentoJuridica = 0.15;
	private static double descuentoFisica = 0;
	
	public Sistema () {
		this.usuarios = new ArrayList<Persona>();
		this.llamadas = new ArrayList<Llamada>();
		this.guiaTelefonica = new GuiaTelefonica();
	}
	
	public boolean agregarTelefono(String telefono) {
		return this.guiaTelefonica.agregarTelefono(telefono);
	}
	
	public Persona registrarUsuario(String documento, String nombreYApellido, String tipoDePersona) {
		Persona usuario = new Persona(tipoDePersona, nombreYApellido, this.guiaTelefonica.getUltimoTelefono(), documento);
		usuarios.add(usuario);
		return usuario;	
	}
	
	public boolean eliminarUsuario(Persona usuario) {
		if (this.existeUsuario(usuario)) {	
			this.guiaTelefonica.agregarTelefono(usuario.getTelefono());
			this.usuarios.remove(usuario);
			return true;
		}
		return false;	
	}
	
	public Llamada registrarLlamada(Persona emisor, Persona remitente, String tipoDePersona, int duracion) {
		Llamada llamada = new Llamada(tipoDePersona, emisor.getTelefono(), remitente.getTelefono(), duracion);
		llamadas.add(llamada);
		emisor.agregarLlamada(llamada);
		return llamada;	
	}
	
	public double calcularMontoTotalLlamadas(Persona usuario) {
		double montoTotal = 0;
		if (this.existeUsuario(usuario)) {
			for (Llamada llamada : usuario.getLlamadas()) {
				double subMonto = 0;		
				subMonto += llamada.getValorLlamada();
				subMonto -= subMonto * this.getDescuento(usuario);
				montoTotal += subMonto;
			}
		}
		return montoTotal;
	}
	
	private double getDescuento(Persona usuario) {
		if (usuario.getTipoDePersona() == "fisica") {
			return descuentoFisica;
		}
		return descuentoJuridica;
	}
	
	public int cantidadDeUsuarios() {
		return usuarios.size();
	}

	public boolean existeUsuario(Persona usuario) {
		return usuarios.contains(usuario);
	}	
}
