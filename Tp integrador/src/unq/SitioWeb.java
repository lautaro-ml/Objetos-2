package unq;

import java.time.*;
import java.util.*;

public class SitioWeb {

	public List<Publicacion> publicaciones = new ArrayList<Publicacion>() ;
	
	public void agregarPublicacion(ArrayList<LocalDate> diasDisponibles, LocalTime horarioCheckIn, LocalTime horarioCheckOut, float presio, Propiedad propiedad) {
		Publicacion nuevaPublicacion = new Publicacion(diasDisponibles, horarioCheckIn, horarioCheckOut, presio, propiedad) ;
		publicaciones.add(nuevaPublicacion) ;
	} ;
	
	public List<Publicacion> listarDisponibles(LocalDate inicio, LocalDate end, String localidad) {

		List<Publicacion> res = new ArrayList<Publicacion>() ;
		
		for(int i = 0 ; i < publicaciones.size() ; i++) {
			if (publicaciones.get(i).estaDisponible(inicio, end, localidad)) {
				res.add(publicaciones.get(i)) ;
			} ;
		} ;
		
		return res ;
	} ;
	
}
