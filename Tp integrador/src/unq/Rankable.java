package unq;

import java.util.HashMap;
import java.util.Map;

public interface Rankable {

	public Map<Integer, String> calificaciones = new HashMap<Integer, String>() ;
	
	public void calificar(Integer nota, String categoria) ;
	
	public Integer promedio() ;
	
}
