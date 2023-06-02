package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	
	private SortedSet<String> guia;
	
	public GuiaTelefonica () {
		this.guia = new TreeSet<String>();
	}

	public String getUltimoTelefono() {
		String telefono = guia.last();
		guia.remove(telefono);
		return telefono;
	}

	public boolean agregarTelefono(String telefono) {
		if (!guia.contains(telefono)) {
			this.guia.add(telefono);
			return true;
		}	
		return false;
	}
	
	
}
