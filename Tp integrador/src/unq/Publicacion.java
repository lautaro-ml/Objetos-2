package unq;


import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {

	private ArrayList<LocalDate> disponibilidad ;
	private LocalTime			 checkIn ;
	private LocalTime			 checkOut ;
	private Integer				 precio ;
	private Propiedad			 propiedad ;
	
	public ArrayList<LocalDate> getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(ArrayList<LocalDate> disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public LocalTime getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalTime checkIn) {
		this.checkIn = checkIn;
	}

	public LocalTime getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalTime checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
	
	public Publicacion() {
		super();
	}

	public Publicacion(ArrayList<LocalDate> diasDisponibles, LocalTime horarioCheckIn, LocalTime horarioCheckOut, Integer nuevoPrecio, Propiedad inmueble) {
		super();
		this.setDisponibilidad(diasDisponibles);
		this.setCheckIn(horarioCheckIn);
		this.setCheckOut(horarioCheckOut);
		this.setPrecio(nuevoPrecio);
		this.setPropiedad(inmueble);
	}
	
	public Boolean perteneceALaLocalidad(String localidad) {
	 return (this.getPropiedad().getLocalizacion() == localidad);
	}
	
	/*public Boolean estaDisponibleEntre(LocalDate fechaAComparar, LocalDate inicio, LocalDate fin) {
		
		return (fechaAComparar.isBefore(fin) && fechaAComparar.isAfter(inicio)) ||
			   fechaAComparar.isEqual(inicio) || fechaAComparar.isEqual(fin);
	}*/
	
	public Boolean estaDisponibleEntreLasFechas(LocalDate inicio, LocalDate fin) {

		List<LocalDate> rangoDeFechasPedidas = new ArrayList<LocalDate>();
		
		for(LocalDate indice = inicio; indice.isBefore(fin) || indice.equals(fin); indice = indice.plusDays(1)) {
			rangoDeFechasPedidas.add(indice);
		} ;
		
		return disponibilidad.containsAll(rangoDeFechasPedidas);
	}
	
	public Boolean estaDisponible(LocalDate inicio, LocalDate fin, String localidad) {
		return this.perteneceALaLocalidad(localidad) && this.estaDisponibleEntreLasFechas(inicio, fin);
	}
	
	public void sacarDeDisponibleDiasReservados(LocalDate inicio, LocalDate fin) {
		for(LocalDate i = inicio; i.isBefore(fin) || i.equals(fin); i = i.plusDays(1)) {
			disponibilidad.remove(i) ;
		};
	}

}