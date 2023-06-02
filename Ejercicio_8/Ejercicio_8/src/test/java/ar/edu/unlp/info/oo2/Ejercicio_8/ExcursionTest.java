package ar.edu.unlp.info.oo2.Ejercicio_8;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ExcursionTest {
	
/* Dos días en kayak bajando el Paraná”, con cupo mínimo de 1 persona y cupo máximo 2, 
 con dos personas ya inscriptas. Implemente todos los mensajes que considere necesarios.
 
 String nombre, LocalDate fecha_de_inicio, LocalDate fecha_de_fin, String punto_de_encuentro,
			double costo, int cupo_minimo, int cupo_maximo
 */
	
	Usuario u1;
	Usuario u2;
	Excursion ex;
	
	@BeforeEach
	void setUp() throws Exception {
		u1 = new Usuario("Julian", "Bella", "jb@live.com");
		u2 = new Usuario("Ivan", "kno", "ik@live.com");
		ex = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2015, 12, 3), 
				LocalDate.of(2015, 12, 5), "Puerto Paraná", 500000, 1, 2);
	}
	
   @Test
    public void testEvaluar() {
    	assertTrue(ex.getUsuarios_inscriptos().isEmpty());
    	assertTrue(ex.getEstado().getEstadoInscripcion().equals("Provisoria"));
    	ex.inscribir(u1);
    	assertTrue(ex.getEstado().getEstadoInscripcion().equals("Definitiva"));
    	assertEquals(1, ex.getUsuarios_inscriptos().size());
    	ex.inscribir(u2);
    	assertTrue(ex.getEstado().getEstadoInscripcion().equals("Llena"));
    	assertEquals(2, ex.getUsuarios_inscriptos().size());
    	ex.inscribir(u1);
    	assertTrue(ex.getEstado().getEstadoInscripcion().equals("Llena"));
    	assertEquals(2, ex.getUsuarios_inscriptos().size());
    	assertEquals(1, ex.getUsuarios_espera().size());
    }

}
