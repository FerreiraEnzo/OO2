package ar.edu.unlp.objetos.uno.Ejercicio9Ptr;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

public class Novedad implements Estrategia{
	
	
	
	public List<Pelicula> sugerir(Decodificador unDecodificador){
		//List<Pelicula> sugeridas = new LinkedList<Pelicula>();
		//List<Pelicula> filtradas = unDecodificador.getListaCompleta().stream().noneMatch(unDecodificador.getVistas());
		//sugeridas =  unDecodificador.getListaCompleta().stream().limit(3).min((p1, p2)-> Integer.compare(p1.getAñoEstreno(), p2.getAñoEstreno()));
		return unDecodificador.getListaCompleta().stream().filter(p -> !(unDecodificador.fueVista(p))).sorted(Comparator.comparing(Pelicula::getAñoEstreno)).limit(3).toList();
		}
		
	
	
		
		
		
		
	}
	
	


