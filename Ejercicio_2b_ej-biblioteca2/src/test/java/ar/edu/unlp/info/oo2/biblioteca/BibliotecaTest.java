package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {


	JSONSimpleAdapter js;
	Biblioteca b;
	ArrayList<Socio> socios;
	Socio s1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
	Socio s2 = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
	
	@BeforeEach
	void setUp() throws Exception {
		b = new Biblioteca();	
		js = new JSONSimpleAdapter();
	}
	
    @Test
    public void testGetExporter() {
    	b.setExporter(js);
    	assertEquals(js, b.getExporter());
    }	
    
	/*
	COMO SE TESTEA EL JSON
	*/
    
    @Test
    public void testExportarSocios() {
    	b.setExporter(js);
    	b.agregarSocio(s1);
    	b.agregarSocio(s2);
    	assertEquals("[\r\n"
        		+ "{\r\n"
        		+ "\t\t\"nombre\": \"Arya Stark\",\r\n"
        		+ "\t\t\"email\": \"needle@stark.com\",\r\n"
        		+ "\t\t\"legajo\": \"5234-5\"\r\n"
        		+ "    },\r\n"
        		+ "    {\r\n"
        		+ "\t\t\"nombre\": \"Tyron Lannister\",\r\n"
        		+ "\t\t\"email\": \"tyron@thelannisters.com\",\r\n"
        		+ "\t\t\"legajo\": \"2345-2\"\r\n"
        		+ "\t}\r\n"
        		+ "]\r\n"
        		+ "", b.exportarSocios());
    }	

}