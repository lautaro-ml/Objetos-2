package unq;

import java.time.*;
import java.util.*;

public class SitioWeb {

	public List<Publicacion> publicaciones = new ArrayList<Publicacion>() ;
	public List<Reserva> pendientesDeAprobacion = new List<Reserva> ;
	public List<Reserva> reservasAprobadas = new List<Reserva> ;
	
	
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
	
	public hacerReserva(Inquilino inquilino, Propietario propietario, Publicacion publicacion, LocalDate fechaDeEntrada) {
		Reserva nuevaReserva = new Reserva(inquilino, propietario, publicacion, fechaDeEntrada) ;
		pendientesDeAprobacion.add(nuevaReserva) ;
	} ;
	
	public aprobarReserva(Reserva reserva) {
		pendientesDeAprovacion.remove(reserva) ;
		reservasAprobadas.add(reserva) ;
	} ;
}
