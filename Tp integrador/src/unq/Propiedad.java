package unq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Propiedad {

	public String            tipo ;
	public String            localizacion ;
	public ArrayList<String> servicios ;
	public Integer           capacidad ;
	public Usuario           propietario ;
	
	public Map<(Usuario, Tring), Integer> calificaciones = new HashMap<(Usuario, Tring), Integer> ;

	public void calificar(Integer nota, Pair<(Usuario, Tring)> categoria) {
		calificaciones.put(categoria, nota) ;
	};
	
	public Integer promedio() {
		Integer res = 0;
		Iterator<Map.Entry<(Usuario, String), Integer>> i = calificaciones.entrySet().iterator() ;
		
		while(i.hasNext()) {
			Iterator<Map.Entry<(Usuario, String), Integer>> internalI = calificaciones.entrySet().iterator() ;
			while(internalI.hasNext()) {
				String categoriaAPromediar ;
				String siguienteCategoria = internalI.next().getKey().getValue() ;
				Integer siguienteValor    = internalI.next().getValue() ;
				if(siguienteCategoria == null ) {
					String categoriaAPromediar = siguienteCategoria ;
				} ;
				else {
					if(siguienteCategoria == categoriaAPromediar) {
						res = res + siguienteValor ;
						i.remove() ;
					} ;
				} ;
			} ;
		} ;

		
		return res ;
	} ;	
	
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
