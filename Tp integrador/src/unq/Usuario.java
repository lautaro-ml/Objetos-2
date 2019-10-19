package unq;

import java.util.* ;

public abstract class Usuario {

	Integer telefono ;
	String mail ;
	
	public Integer getTelefono() {
		return telefono;
	} ;


	public void setTelefono(String tel) {
		this.telefono = tel;
	} ;
	
	public String getMail() {
		return mail;
	} ;


	public void setMail(String mail) {
		this.mail = mail;
	} ;
	
	public Map<Pair(Usuario, String), Integer> calificaciones = new HashMap<Pair(Usuario, String), Integer> ;

	public void calificar(Integer nota, Pair(Usuario, String) categoria) {
		calificaciones.put(categoria, nota) ;
	};
	
	public Integer promedioDeUnaCategoria(String categoria) {
		Integer res = 0 ;
		Iterator<Map.Entry<Pair(Usuario, String), Integer>> i = calificaciones.entrySet().iterator() ;
		while(i.hasNext()) {
			if(siguienteCategoria == categoriaAPromediar) {
				res = res + i.next().getValue() ;
			} ;
		} ;
		return res ;
	} ;	
	
	public Integer promedioTotal() {
		Integer res = 0 ;
		Iterator<Map.Entry<Pair(Usuario, String), Integer>> iter = calificaciones.entrySet().iterator() ;
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

	
}
