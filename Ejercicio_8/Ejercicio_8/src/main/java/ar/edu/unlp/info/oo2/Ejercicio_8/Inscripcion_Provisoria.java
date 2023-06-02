package ar.edu.unlp.info.oo2.Ejercicio_8;

public class Inscripcion_Provisoria extends Inscripcion {
	
	public Inscripcion_Provisoria() {
		super("Provisoria");
	}
	
	public String obtener_Informacion(Excursion ex) {
		return super.obtener_Informacion(ex) + " Cupos faltantes para el minimo: " + (ex.getCupo_minimo() - ex.getUsuarios_inscriptos().size());
	}

}
