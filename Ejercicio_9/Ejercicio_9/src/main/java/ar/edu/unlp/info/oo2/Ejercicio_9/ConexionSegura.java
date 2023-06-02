package ar.edu.unlp.info.oo2.Ejercicio_9;

public class ConexionSegura extends Conexion{
	 
	private Encriptador encriptador;
	
	public ConexionSegura(Encriptador encriptador) {
		this.encriptador = encriptador;
	}
	
	public String enviar(String msj) {
		return super.enviar( this.encriptador.encriptar( msj ) );
	}
}	
