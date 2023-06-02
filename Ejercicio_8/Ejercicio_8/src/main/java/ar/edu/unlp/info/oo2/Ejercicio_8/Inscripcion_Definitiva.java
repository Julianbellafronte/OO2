package ar.edu.unlp.info.oo2.Ejercicio_8;

public class Inscripcion_Definitiva extends Inscripcion {
	
	public Inscripcion_Definitiva() {
		super("Definitiva");
	}
	
	public String obtener_Informacion(Excursion ex) {
					
		String emails = "";
		for(Usuario u: ex.getUsuarios_inscriptos()) {
			emails += u.getEmail() + " ";
		}		
		return super.obtener_Informacion(ex) + " Cupos faltantes para el maximo: " + (ex.getCupo_maximo() - ex.getUsuarios_inscriptos().size() 
				+ ", Emails inscriptos: " + emails);
	}

}
