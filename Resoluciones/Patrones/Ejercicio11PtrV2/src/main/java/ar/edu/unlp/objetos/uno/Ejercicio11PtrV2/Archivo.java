package ar.edu.unlp.objetos.uno.Ejercicio11PtrV2;

import java.util.LinkedList;
import java.util.List;

public class Archivo extends Elemento{
	private int tamaño;

	
	
	public Archivo(String n, int t) {
		super(n);
		this.tamaño = t;
	}
	
	public int calcularTamaño() {
		return this.tamaño;
	}
	
	public Archivo calcularMaximoTamaño() {
		return this;
	}
	
	public Archivo masNuevo() {
		return this;
	}
	
	public List<Elemento> buscarTodosLosIguales(String n){
		List<Elemento> l = new LinkedList<Elemento>();
		if(this.sonIguales(n)) {
			l.add(this);
		}
		return l;
	}
	
	
	
	
	
}
