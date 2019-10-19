package unq;

import java.util.*;


public class Propietario extends Usuario {

	
	public ArrayList<Propiedad> Propiedades = new ArrayList<Propiedad>() ;
	public Map<String, Integer> calificaciones = new HashMap<String, Integer>() ;

	public void registrarPropiedad(String tipoDeInmueble, String localizacion, ArrayList<String> serviciosDisponibles,  Integer capacidad) {
		Propiedad nuevaPropiedad = new Propiedad(tipoDeInmueble, localizacion, serviciosDisponibles, capacidad, this);
		Propiedades.add(nuevaPropiedad);
	}
	
	public void calificar(Integer nota, String categoria) {
		calificaciones.put(categoria, nota) ;
	};
	
	public Integer promedio() {
		Integer res = 0;
		Collection<Integer> c = calificaciones.values();
		
		for (int i = 0; i < c.size(); i++) {
			res = res + c.get(i) ;
		} ;
		
		//TODO: Encontrar la sintaxis para pedir un valor a una coleccion segun el indice
		
		return res ;
	} ;
	
}
