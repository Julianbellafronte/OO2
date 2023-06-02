
package ar.edu.unlp.info.oo2.Ejercicio_5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio {
	
	String name;
	LocalDate date; 
	ArrayList<Archivo> files;
	ArrayList<Directorio> subDirectorios;
	static int contenido = 32;
	
	/**
	* Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
	*/
    public Directorio(String nombre, LocalDate fecha) {
    	this.name = nombre;
    	this.date = fecha; 
    	this.files = new ArrayList<Archivo>();
    	this.subDirectorios = new ArrayList<Directorio>();
    }

	 /**
	* Retorna el espacio total ocupado, incluyendo su contenido.
	*/
    public int tamanoTotalOcupado() {
    	int total = contenido;
    	total += this.tamanoTotalOcupadoPWD();
    	for(Directorio direc: this.subDirectorios) {
    		total += direc.tamanoTotalOcupado();
    	}
    	return total;
    }
    
    private int tamanoTotalOcupadoPWD() {	
    	int tamano = 0;
    	for(Archivo file: this.files) {
    		tamano += file.getTamano();
    	}
    	return tamano;
    }
    
     

	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	* filesystem contenido por directorio receptor
	*/
    private Archivo archivoMasGrandeInterno(int tamano) {
    	if(this.files.isEmpty()) {
    		return null;
    	}else {
    		Archivo f = files.get(0);
    		f = archivoMasGrandePWD(f);
        	for(Directorio direc: this.subDirectorios) {
        		if(direc.archivoMasGrandeInterno(f.getTamano()).getTamano() > f.getTamano()) {
        			f = direc.archivoMasGrandeInterno(f.getTamano());
        		}
        	}
        	return f;
    	}  	
    }
    
    public Archivo archivoMasGrande() {
    	return this.archivoMasGrandeInterno(-1);
    }
    
    private Archivo archivoMasGrandePWD(Archivo fileActual) {
    	Archivo fileAux = new Archivo("aux", LocalDate.of(2015, 12, 3), -1);
    	for(Archivo file: this.files) {
    		if(file.getTamano() >= fileAux.getTamano()) {
    			fileAux = file;
    		}
    	}
    	if(fileAux.getTamano() > fileActual.getTamano()) {
    		return fileAux;
    	}else {
    		return fileActual;
    	}
    	
    }
    
    /**
    * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
    * del filesystem contenido por directorio receptor.
    */
    public Archivo archivoMasNuevo() {	
    	Archivo f = files.get(0);  							/*CHEQUEAR*/
    	LocalDate nuevo = LocalDate.of(1900, 1, 1);
    	archivoMasNuevoPWD(f, nuevo);
    	for(Directorio direc: this.subDirectorios) {
    		direc.archivoMasNuevo();
    	}
    	return f;
    }
    
    private void archivoMasNuevoPWD(Archivo f, LocalDate nuevo) {	
    	for(Archivo file: this.files) {
    		if(file.getDate().isAfter(nuevo)) {
    			nuevo = file.getDate();
    			f = file;
    		}
    	}
    }

	public void agregar(Archivo archivo) {
		this.files.add(archivo);
	}

	public void agregar(Directorio older) {
		this.subDirectorios.add(older);
		
	}
        
}