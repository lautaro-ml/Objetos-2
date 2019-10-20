package unq;

import java.util.ArrayList;

public class Propiedad {

	private String            tipo ;
	private String            localizacion ;
	private ArrayList<String> servicios ;
	private Integer           capacidad ;
	private Usuario           propietario ;

	public Propiedad() {
		super();
	}
	
	public Propiedad(String tipoDeInmueble, String localizacion, ArrayList<String> serviciosDisponibles,  Integer capasidad, Usuario usuario) {
		super();
		this.setTipo(tipoDeInmueble);
		this.setLocalizacion(localizacion);
		this.setServicios(serviciosDisponibles);
		this.setCapacidad(capasidad);
		this.setPropietario(usuario);
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
