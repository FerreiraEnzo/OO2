package ar.edu.unlp.objetos.uno.Ejercicio9Ptr;

import java.util.LinkedList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int añoEstreno;
	private int puntaje;
	private List<Pelicula> similares;
	
	
	
	public Pelicula(String titulo, int puntaje, int año) {
		this.titulo = titulo;
		this.añoEstreno = año;
		this.puntaje = puntaje;
		this.similares = new LinkedList<Pelicula>();
	}
	
	
	public int getPuntaje() {
		return this.puntaje;
	}
	
	public int getAñoEstreno() {
		return this.añoEstreno;
	}
	
	
	protected List<Pelicula> getSimilares(){
		return this.similares;
	}
	
	public void agregarSimilar(Pelicula p) {
		this.similares.add(p);
	}
	
	public void removerSimilar(Pelicula p) {
		this.similares.remove(p);
	}
	
	

}
