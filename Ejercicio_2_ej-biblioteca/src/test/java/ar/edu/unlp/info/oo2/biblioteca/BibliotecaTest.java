package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	VoorheesExporter vh;
	Biblioteca b;
	ArrayList<Socio> socios;
	Socio s1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
	Socio s2 = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
	
	@BeforeEach
	void setUp() throws Exception {
		b = new Biblioteca();	
		vh = new VoorheesExporter();
	}
	
    @Test
    public void testGetExporter() {
    	b.setExporter(vh);
    	assertEquals(vh, b.getExporter());
    }	
    
	/*
	COMO SE TESTEA EL JSON
	*/
    
    @Test
    public void testExportarSocios() {
    	
    }

}