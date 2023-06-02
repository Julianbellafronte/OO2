package ar.edu.unlp.info.oo2.Ejercicio_21;

public class Main {

	public static void main(String[] args) {
		
		Mamifero papaPedro = new Mamifero(null, null);
		
		Mamifero juana = new Mamifero(null, null); 
		Mamifero pedro = new Mamifero(null, papaPedro); 	
		
		Mamifero hijoJuPe = new Mamifero(juana, pedro); 
		
		System.out.println(hijoJuPe.tieneComoAncestro(papaPedro));
		System.out.println(pedro.tieneComoAncestro(juana));
	}

}
