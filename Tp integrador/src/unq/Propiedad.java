package unq;

import java.util.ArrayList;

public class Propiedad {

	public String            tipo ;
	public String            localizacion ;
	public ArrayList<String> servicios ;
	public Integer           capacidad ;
	public Usuario           propietario ;
	
	
	public Propiedad(String tipoDeInmueble, String localisacion, ArrayList<String> serviciosDisponibles,  Integer capasidad, Usuario usuario) {
		super();
		tipo          = tipoDeInmueble;
		localizacion  = localisacion;
		servicios     = serviciosDisponibles ;
		capacidad     = capasidad ;
		propietario   = usuario ;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}


	public ArrayList<String> getServicios() {
		return servicios;
	}


	public void setServicios(ArrayList<String> servicios) {
		this.servicios = servicios;
	}


	public Integer getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}


	public Usuario getPropietario() {
		return propietario;
	}


	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	};

}
