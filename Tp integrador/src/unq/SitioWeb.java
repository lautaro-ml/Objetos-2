package unq;

import java.time.*;
import java.util.*;

public class SitioWeb {

	private List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	private AdministracionDeReserva administradorDeReserva = new AdministracionDeReserva() ;

	public List<Publicacion> getListaDePublicaciones() {
		return this.publicaciones;
	}
	
	public void agregarPublicacionALaLista(Publicacion publicacion) {
		this.getListaDePublicaciones().add(publicacion);
	}
	
	public void agregarPublicacion(ArrayList<LocalDate> diasDisponibles, LocalTime horarioCheckIn, LocalTime horarioCheckOut, Integer precio, Propiedad propiedad) {
		Publicacion nuevaPublicacion = new Publicacion(diasDisponibles, horarioCheckIn, horarioCheckOut, precio, propiedad) ;
		this.agregarPublicacionALaLista(nuevaPublicacion) ;
	}
	
	public List<Publicacion> listarDisponibles(LocalDate inicio, LocalDate fin, String localidad) {

		List<Publicacion> res = new ArrayList<Publicacion>();
		for(Integer i = 0 ; i < this.getListaDePublicaciones().size() ; i++) {
			if (this.getListaDePublicaciones().get(i).estaDisponible(inicio, fin, localidad)) {
				res.add(this.getListaDePublicaciones().get(i)) ;
			};
		};
		return res;
	}
	
	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public List<Reserva> getPendientesDeAprobacion() {
		return administradorDeReserva.getPendientesDeAprobacion();
	}

	public List<Reserva> getReservasAprobadas() {
		return administradorDeReserva.getReservasAprobadas();
	}

	public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public AdministracionDeReserva getAdministradorDeReserva() {
		return administradorDeReserva;
	}

	public void setAdministradorDeReserva(AdministracionDeReserva administradorDeReserva) {
		this.administradorDeReserva = administradorDeReserva;
	}
	
}
