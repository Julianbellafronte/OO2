package ar.edu.unlp.info.oo2.Ejercicio_8;

public abstract class Inscripcion {
		
	private String estado;
	
	public Inscripcion(String estado) {
		this.estado = estado;
	}
	
	public String obtener_Informacion(Excursion ex) {	
		String resultado = String.format("Nombre de excusión: %s | Costo: %s | Fecha inicio: %s | Fecha fin: %s | Punto de encuentro: %s",
				ex.getNombre(), ex.getCosto(), ex.getFecha_de_inicio(), ex.getFecha_de_fin(), ex.getPunto_de_encuentro());
		return resultado;
	}
	
	public String getEstadoInscripcion() {
		return estado;
	}

}
