package ar.edu.unlp.info.oo2.Ejercicio_9;

public class RC4 extends Encriptador{

	@Override
	public String encriptar( String msj) {
		return "rc4" + msj;
	}
}
