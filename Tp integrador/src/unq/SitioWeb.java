package unq;

import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

public class SitioWeb {

	private ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
	private ArrayList<Reserva> pendientesDeAprobacion = new ArrayList<Reserva>();
	private ArrayList<Reserva> reservasAprobadas = new ArrayList<Reserva>();

	public ArrayList<Publicacion> getListaDePublicaciones() {
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

	List<Publicacion> res = this.getListaDePublicaciones();
	/*.stream().filter(x -> x.perteneceALaLocalidad(localidad)).collect(Collectors.toList());
		res = res.stream().filter(publicacion -> publicacion.perteneceALaLocalidad(localidad)).collect(Collectors.toList());
		for(Publicacion publicacion : this.getListaDePublicaciones()) {
			res = (this.estaDisponibleEntre(fecha, inicio, fin) || this.estaDisponibleEntre_casoBorde_(fecha, inicio, fin)) && estaDisponible;
		}*/
		
	/*	for(int i = 0 ; i < this.getListaDePublicaciones().size() ; i++) {
			if (this.getListaDePublicaciones().get(i).estaDisponible(inicio, fin, localidad)) {
				res.add(this.getListaDePublicaciones().get(i)) ;
			} ;
		}*/
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
