package unq;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inquilino extends Usuario {

	List<Reserva> reservas = new ArrayList<Reserva>();

	public List<Reserva> reservasEn(String localidad) {

		List<Reserva> res = new ArrayList<Reserva>();

		for (int i = 0 ; i < reservas.size() ; i++) {
		//	if (reservas.get(i).getPublicacion().getPropiedad().getLocalizacion() == localidad) {
		//		res.add(reservas.get(i)) ;
		//	} ;
		} ;

		return res ;
	} ;


	public List<Reserva> reservasFuturas() {

		List<Reserva> res = new ArrayList<Reserva>();
		LocalDate diaActual = LocalDate.now();

		for (int i = 0 ; i < reservas.size() ; i++) {
			if (reservas.get(i).getFechaDeEntrada().isAfter(diaActual)) {
				res.add(reservas.get(i)) ;
			} ;
		} ;

		return res ;
	} ;

	public List<String> ciudadesConReserva() {
		List<String> res = new ArrayList<String>();

		for(int i = 0; i < reservas.size(); i++) {
		//	res.add(reservas.get(i).getPublicacion().getPropiedad().getLocalizacion());
		}

		return res;
	}


	public List<Reserva> getReservas() {
		return reservas;
	}


	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	} ;

}