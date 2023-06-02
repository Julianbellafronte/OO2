package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaFisica extends Persona{
	
	private String dni;
	private double descuento = 0;
	
	public PersonaFisica (String nombreYApellido, String telefono, String dni) {
		super(nombreYApellido, telefono);
		this.dni = dni;
	}
	
	public String getIdentificacion() {
		return dni;
	}

	public String getTipoDePersona() {
		return "fisica";
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
}
