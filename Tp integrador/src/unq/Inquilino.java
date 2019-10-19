package unq;

import java.util.*
import java.time.*;


public class Inquilino extends Usuario {
	
	List<Reserva> reservas = new List<Reserva> ;
	
	public List<Reserva> reservasEn(String localidad) {

		List<Reserva> res = new List<Reserva> ;
		
		for (int i = 0 ; i < reservas.size() ; i++) {
			if (reservas.get(i).getPublicacion().getPropiedad().getLocalizacion() == localidad) {
				res.add(reservas.get(i)) ;
			} ;
		} ;
		
		return res ;
	} ;

	
	public List<Reserva> reservasFuturas() {

		List<Reserva> res = new List<Reserva> ;
		LocalDate diaActual = new LocalDate().now()
		
		for (int i = 0 ; i < reservas.size() ; i++) {
			if (reservas.get(i).getFechaDeEntrada().isAfter(diaActual)) {
				res.add(reservas.get(i)) ;
			} ;
		} ;
		
		return res ;
	} ;
	
	public List<String> ciudadesConReserva() {
		List<String> res = new List<String> ;
		
		for(int i = 0; i < reservas.size(); i++) {
			res.add(reservas.get(i).getPublicacion().getPropiedad().getLocalizacion())
		} ;
		
		return res
	} ;
	
}
