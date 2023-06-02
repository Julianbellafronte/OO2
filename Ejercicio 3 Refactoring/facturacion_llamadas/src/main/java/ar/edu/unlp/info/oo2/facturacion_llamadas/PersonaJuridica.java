package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaJuridica extends Persona {
	
	private String cuit;
	private double descuento = 0.15;
	
	
	public PersonaJuridica (String nombreYApellido, String telefono, String cuit) {
		super(nombreYApellido, telefono);
		this.cuit = cuit;
	}

	public String getIdentificacion() {
		return cuit;
	}

	public String getTipoDePersona() {
		return "juridica";
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	
}
