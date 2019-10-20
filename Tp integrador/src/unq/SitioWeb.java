package unq;

import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

public class SitioWeb {

	private List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	private List<Reserva> pendientesDeAprobacion = new ArrayList<Reserva>();
	private List<Reserva> reservasAprobadas = new ArrayList<Reserva>();

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

	List<Publicacion> res = new ArrayList<Publicacion>() ;
	for(int i = 0 ; i < this.getListaDePublicaciones().size() ; i++) {
			if (this.getListaDePublicaciones().get(i).estaDisponible(inicio, fin, localidad)) {
				res.add(this.getListaDePublicaciones().get(i)) ;
			} ;
		};
		return res;
	}
	
	public void hacerReserva(Inquilino inquilino, Propietario propietario, Publicacion publicacion, LocalDate fechaDeEntrada, LocalDate fechaDeSalida) {
		Reserva nuevaReserva = new Reserva(inquilino, propietario, publicacion, fechaDeEntrada, fechaDeSalida);
		
		pendientesDeAprobacion.add(nuevaReserva);
	}
	
	public void aprobarReserva(Reserva reserva) {
		pendientesDeAprobacion.remove(reserva) ;
		reservasAprobadas.add(reserva) ;
		reserva.getPublicacion().sacarDeDisponibleDiasReservados(reserva.getFechaDeEntrada(), reserva.getFechaDeSalida()) ;
	}
	
}
