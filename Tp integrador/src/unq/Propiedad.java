package unq;

import java.util.* ;

public class Propiedad {

	public String            tipo ;
	public String            localizacion ;
	public ArrayList<String> servicios ;
	public Integer           capacidad ;
	public Usuario           propietario ;
	
	public Map<Pair<Usuario, String>, Integer> calificaciones = new HashMap<Pair<Usuario, String>, Integer> ;

	public void calificar(Integer nota, Pair<Pair<Usuario, String>> categoria) {
		calificaciones.put(categoria, nota) ;
	};
	
	public Integer promedioDeUnaCategoria(String categoria) {
		Integer res = 0 ;
		Iterator<Map.Entry<Pair<Usuario, String>, Integer>> i = calificaciones.entrySet().iterator() ;
		while(i.hasNext()) {
			if(siguienteCategoria == categoriaAPromediar) {
				res = res + i.next().getValue() ;
			} ;
		} ;
		return res ;
	} ;	
	
	public Integer promedioTotal() {
		Integer res = 0 ;
		Iterator<Map.Entry<Pair<Usuario, String>, Integer>> iter = calificaciones.entrySet().iterator() ;
		while(iter.hasNext) {
			List<String> categorias = new List<String> ;
			categorias.add(iter) ;
		} ;
		for (int i = 0 ; i < categorias.size() ; i++) {
			res = res + promedioDeUnaCategoria(categorias.get(i)) ;
		} ;
		res = res/categorias.size() ;
		return res
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
