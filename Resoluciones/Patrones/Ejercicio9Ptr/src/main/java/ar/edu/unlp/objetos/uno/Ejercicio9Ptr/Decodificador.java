package ar.edu.unlp.objetos.uno.Ejercicio9Ptr;

import java.util.LinkedList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> listaCompleta;
	private List<Pelicula> vistas;
	private Estrategia estrategia;
	
	
	public Decodificador(List<Pelicula>grilla, List<Pelicula>vistas, Estrategia strategy) {
		this.listaCompleta = grilla;
		this.vistas= vistas;
		this.estrategia = strategy;
	}
	
	public void setEstrategia(Estrategia unaEstrategia) {
		this.estrategia = unaEstrategia;
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return this.estrategia.sugerir(this);
	}
	
	
	protected List<Pelicula> getListaCompleta(){
		return this.listaCompleta;
	}
	
	protected List<Pelicula> getVistas(){
		return this.vistas;
	}
	
	public boolean fueVista(Pelicula p) {
		return this.vistas.contains(p);
	}
	
	
	
	
	
	
	
}
