package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter extends VoorheesExporter{

	JSONObject socio;
	JSONArray socios = new JSONArray();
	
	public String exportar(ArrayList<Socio> socios) {
		for(Socio s: socios) {
			socio = new JSONObject();
			socio.put("nombre", s.getNombre());
			socio.put("email", s.getEmail());
			socio.put("legajo", s.getLegajo());
			
			this.socios.add(socio);
		}
		return this.socios.toJSONString();
	}
}
