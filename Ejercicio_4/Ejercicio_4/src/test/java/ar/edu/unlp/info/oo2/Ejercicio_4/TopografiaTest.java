package ar.edu.unlp.info.oo2.Ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	Topografia agua;
	Topografia tierra;
	Topografia mixta;
	Topografia mixta2;
	
	ArrayList<Topografia> topografias;
	ArrayList<Topografia> topografiasMixta;
	
	@BeforeEach
    void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
	
		topografias = new ArrayList<Topografia>();
		topografias.add(agua);
		topografias.add(tierra);
		topografias.add(tierra);
		topografias.add(agua);
		mixta = new Mixta(topografias);
		
		topografiasMixta = new ArrayList<Topografia>();
		topografiasMixta.add(agua);
		topografiasMixta.add(tierra);
		topografiasMixta.add(tierra);
		topografiasMixta.add(mixta);
		
		mixta2 = new Mixta(topografiasMixta);
    }

    @Test
    void testProporcionAgua() {
    	assertEquals(1, agua.calcularProporcion());
    	assertEquals(0, tierra.calcularProporcion());
    	assertEquals(0.5, mixta.calcularProporcion());
    	assertEquals(0.375, mixta2.calcularProporcion());
    }



}
