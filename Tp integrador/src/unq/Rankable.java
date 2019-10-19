package unq;

import java.util.HashMap;
import java.util.Map;

public interface Rankable {

	public Map<(Usuario, Tring), Integer> calificaciones = new HashMap<(Usuario, String), Integer>() ;
	
	public void calificar(Integer nota, String categoria) ;
	
	public Integer promedio() ;
	
}
