/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio_15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	HomeWeatherStation james;
	HomeWeatherStation guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new HomeWeatherStation("James", "Glossing");
		guido = new HomeWeatherStation("Guido", "van Rossum");
	}
    @Test
    public void testNombreCompleto() {
        assertEquals("Glossing, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
        
    }
}
