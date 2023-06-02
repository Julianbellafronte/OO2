package ar.edu.unlp.info.oo2.Ejercicio_9;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ConexionTest {
	
	Blowfish b;
	RC4 rc;
	RSA rs;
	Conexion conexion;
	ConexionSegura conexionSegura;
	
	@BeforeEach
	void setUp() throws Exception {
		b = new Blowfish();
		rc = new RC4();
		rs = new RSA();
		conexion = new Conexion();
	}
	
   @Test
    public void testConexion() {
	   assertEquals("hola", conexion.enviar("hola"));
    }
   
   @Test
   public void testConexionSegura() {
	   
	   conexionSegura = new ConexionSegura(b);
	   assertEquals("blowhola", conexionSegura.enviar("hola"));
	   
	   conexionSegura = new ConexionSegura(rc);
	   assertEquals("rc4hola", conexionSegura.enviar("hola"));
	   
	   conexionSegura = new ConexionSegura(rs);
	   assertEquals("rsahola", conexionSegura.enviar("hola"));
   }

}
