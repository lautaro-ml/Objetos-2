package unq;

import java.util.*;


public class Propietario extends Usuario {
	
	
	public ArrayList<Propiedad> Propiedades = new ArrayList<Propiedad>() ;

	public void registrarPropiedad(String tipoDeInmueble, String localizacion, ArrayList<String> serviciosDisponibles,  Integer capacidad) {
		Propiedad nuevaPropiedad = new Propiedad(tipoDeInmueble, localizacion, serviciosDisponibles, capacidad, this);
		Propiedades.add(nuevaPropiedad);
	}
	
}
