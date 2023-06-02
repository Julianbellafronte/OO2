package ar.edu.unlp.info.oo2.Ejercicio_9;

public class RSA extends Encriptador{
	
	@Override
	public String encriptar( String msj) {
		return "rsa" + msj;
	}
}
