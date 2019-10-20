package unq;


import java.time.*;
import java.util.ArrayList;

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
	
	public Boolean estaDisponibleEntre(LocalDate fechaAComparar, LocalDate inicio, LocalDate fin) {
		
		return (fechaAComparar.isBefore(inicio) || fechaAComparar.isAfter(fin));
	}
	
	public Boolean estaDisponibleEntre_casoBorde_(LocalDate fecha, LocalDate inicio, LocalDate fin){
		return (fecha.isEqual(inicio) || fecha.isEqual(fin));
	}
	
	public Boolean estaDisponibleEntreLasFechas(LocalDate inicio, LocalDate fin) {

		
		Boolean estaDisponible = true;	
		
		for(LocalDate fecha : disponibilidad) {
			estaDisponible = (this.estaDisponibleEntre(fecha, inicio, fin) || this.estaDisponibleEntre_casoBorde_(fecha, inicio, fin)) && estaDisponible;
		}
		
		return estaDisponible ;
	}
	
	public Boolean estaDisponible(LocalDate inicio, LocalDate fin, String localidad) {
		return this.perteneceALaLocalidad(localidad) && this.estaDisponibleEntreLasFechas(inicio, fin);
	}

}