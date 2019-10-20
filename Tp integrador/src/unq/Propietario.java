package unq;

import java.util.*;


public class Propietario extends Usuario {

	
	private ArrayList<Propiedad> Propiedades = new ArrayList<Propiedad>() ;

	public void registrarPropiedad(String tipoDeInmueble, String localizacion, ArrayList<String> serviciosDisponibles,  Integer capacidad) {
		Propiedad nuevaPropiedad = new Propiedad(tipoDeInmueble, localizacion, serviciosDisponibles, capacidad, this);
		Propiedades.add(nuevaPropiedad);
	}

	public ArrayList<Propiedad> getPropiedades() {
		return Propiedades;
	}

	public void setPropiedades(ArrayList<Propiedad> propiedades) {
		Propiedades = propiedades;
	}

}
