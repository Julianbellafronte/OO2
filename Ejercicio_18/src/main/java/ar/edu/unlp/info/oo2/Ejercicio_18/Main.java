package ar.edu.unlp.info.oo2.Ejercicio_18;

public class Main {

	public static void main(String[] args) {
		Sanguche clasico = new Builder()
				.ingrediente("pan brioche", 100)
				.ingrediente("mayo", 20)
				.ingrediente("carne", 300)
				.ingrediente("tomate", 80)
				.build();
		System.out.println(clasico.calcularPrecio());

	}

}
