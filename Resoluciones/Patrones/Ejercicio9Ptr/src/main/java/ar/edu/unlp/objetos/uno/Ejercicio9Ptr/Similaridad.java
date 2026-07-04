package ar.edu.unlp.objetos.uno.Ejercicio9Ptr;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Similaridad implements Estrategia{
	
	
	
	public List<Pelicula> sugerir(Decodificador unDecodificador){
		return unDecodificador.getListaCompleta().stream()
				.filter(p -> (unDecodificador.fueVista(p))).flatMap(p -> p.getSimilares().stream()).limit(3).toList();		
	}
	
	
	
	
	

}
