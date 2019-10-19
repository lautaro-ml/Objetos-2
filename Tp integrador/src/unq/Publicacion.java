package unq;


import java.time.*;
import java.util.*;

public class Publicacion {

	public ArrayList<LocalDate> disponibilidad ;
	public LocalTime            checkIn ;
	public LocalTime            checkOut ;
	public float                precio ;
	public Propiedad            propiedad ;
	
	public Publicacion(ArrayList<LocalDate> diasDisponibles, LocalTime horarioCheckIn, LocalTime horarioCheckOut, float presio, Propiedad inmueble) {
		super();
		disponibilidad = diasDisponibles ;
		checkIn        = horarioCheckIn ;
		checkOut       = horarioCheckOut ;
		precio         = presio ;
		propiedad      = inmueble ;
	};
	
	public Boolean estaDisponible(LocalDate inicio, LocalDate end, String localidad) {
		return propiedad.getLocalizacion() == localidad && this.calcularFechas(inicio, end) ;
	} ;
	
	public Boolean calcularFechas(LocalDate inicio, LocalDate end) {

		Boolean res = true;
		
		for(LocalDate i = inicio; i.isBefore(end) && res ; i = i.plusDays(1)) {
			res = res && disponibilidad.contains(i) ;
		};
		
		return res ;
	} ;
}
