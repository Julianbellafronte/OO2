package ar.edu.unlp.info.oo2.Ejercicio_14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {
	
	
	FileOO2 fb1;
	FileOO2 fb2;
	
	@BeforeEach
	void setUp() throws Exception {
		fb1 = new FileOO2Builder().nombre("cosas").extension("txt").tamano(200).permiso("RWX").fechaCreacion(LocalDate.of(2015, 12, 5)).build();
		
	}
	
	@Test
	public void testFile() {
		assertEquals("cosas", fb1.getNombre());
		fb2 = new FileOO2Builder().nombre("cosas").extension("txt").build();
		assertEquals("cosas", fb2.getNombre());
		assertEquals(null, fb2.getPermiso());
		
		assertEquals("cosas txt ", fb2.prettyPrint());
		
		fb2 = new FileOO2Builder().extension("txt").nombre("cosas").build();
		
		assertEquals("txt cosas ", fb2.prettyPrint());
		
		assertEquals("cosas txt 200.0 RWX 05 diciembre 2015 ", fb1.prettyPrint());
		
		
    }

}
