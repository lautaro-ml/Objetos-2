package unq;

import java.util.*;


public class Propietario extends Usuario {

	
	public ArrayList<Propiedad> Propiedades = new ArrayList<Propiedad>() ;
	public Map<(Usuario, Tring), Integer> calificaciones = new HashMap<(Usuario, Tring), Integer> ;

	public void registrarPropiedad(String tipoDeInmueble, String localizacion, ArrayList<String> serviciosDisponibles,  Integer capacidad) {
		Propiedad nuevaPropiedad = new Propiedad(tipoDeInmueble, localizacion, serviciosDisponibles, capacidad, this);
		Propiedades.add(nuevaPropiedad);
	}
	
	public void calificar(Integer nota, String categoria) {
		calificaciones.put(categoria, nota) ;
	};
	
	public Integer promedio() {
		Integer res = 0;
		Iterator<Map.Entry<(Usuario, String), Integer>> i = calificaciones.entrySet().iterator() ;
		
		while(i.hasNext()) {
			Iterator<Map.Entry<(Usuario, String), Integer>> internalI = calificaciones.entrySet().iterator() ;
			while(internalI.hasNext()) {
				String categoriaAPromediar ;
				String siguienteCategoria = internalI.next().getKey().getValue() ;
				Integer siguienteValor    = internalI.next().getValue() ;
				if(siguienteCategoria == null ) {
					String categoriaAPromediar = siguienteCategoria ;
				} ;
				else {
					if(siguienteCategoria == categoriaAPromediar) {
						res = res + siguienteValor ;
						i.remove() ;
					} ;
				} ;
				
			} ;
		} ;

		
		return res ;
	} ;
	
}
