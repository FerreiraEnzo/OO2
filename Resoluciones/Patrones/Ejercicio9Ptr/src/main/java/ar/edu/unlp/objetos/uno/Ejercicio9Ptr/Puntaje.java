package ar.edu.unlp.objetos.uno.Ejercicio9Ptr;

import java.util.Comparator;
import java.util.List;

public class Puntaje implements Estrategia{
	
	
	
	public List<Pelicula> sugerir(Decodificador unDecodificador){
		return unDecodificador.getListaCompleta().stream().filter(p -> !(unDecodificador.fueVista(p))).sorted(Comparator.comparing(Pelicula::getPuntaje).thenComparing(Pelicula::getAñoEstreno)).limit(3).toList();
	}
	
	

}
