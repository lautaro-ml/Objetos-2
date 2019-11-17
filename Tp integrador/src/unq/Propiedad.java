package unq;

import java.util.ArrayList;

public class Propiedad {

	private String            tipo ;
	private String            localizacion ;
	private ArrayList<String> servicios ;
	private Integer           capacidad ;
	private Propietario       propietario ;

	public String getTipo() {
		return tipo;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public ArrayList<String> getServicios() {
		return servicios;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public void setServicios(ArrayList<String> servicios) {
		this.servicios = servicios;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Propiedad() {
		super();
	}
	
	public Propiedad(String tipoDeInmueble, String localizacion, ArrayList<String> serviciosDisponibles,  Integer capasidad, Propietario propietario) {
		super();
		this.setTipo(tipoDeInmueble);
		this.setLocalizacion(localizacion);
		this.setServicios(serviciosDisponibles);
		this.setCapacidad(capasidad);
		this.setPropietario(propietario);
	}

}