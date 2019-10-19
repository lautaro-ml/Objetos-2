package unq;

import java.util.* ;

public interface Rankable {

	public Map<Pair<Usuario, String>, Integer> calificaciones = new HashMap<Pair<Usuario, String>, Integer>() ;
	
	public void calificar(Integer nota, Pair<(Usuario, Tring)> categoria) ;
	
	public Integer promedioDeUnaCategoria(String categoria)
	
	public Integer promedioTotal() ;
	
}
