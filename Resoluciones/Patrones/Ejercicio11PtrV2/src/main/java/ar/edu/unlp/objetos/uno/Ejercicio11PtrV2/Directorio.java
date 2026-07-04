package ar.edu.unlp.objetos.uno.Ejercicio11PtrV2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Directorio extends Elemento{
	private List<Elemento> elementos;
	private int tamaño;
	
	
	public Directorio(String n) {
		super(n);
		this.elementos = new LinkedList<Elemento>();
	}
	
	
	public int calcularTamaño() {
		return this.elementos.stream().mapToInt(e -> e.calcularTamaño()).sum() + 32;
	}
	
	public Archivo calcularMaximoTamaño() {
		return this.elementos.stream().map(e -> e.calcularMaximoTamaño()).max(Comparator.comparing(Archivo :: calcularTamaño)).orElse(null);
	}
	
	public Archivo masNuevo() {
		return this.elementos.stream().map(e -> e.masNuevo()).max(Comparator.comparing(Archivo :: getFechaCreacion)).orElse(null);
	}
	
	public List<Elemento> buscarTodosLosIguales(String n) {
		List<Elemento> coincidencias = new LinkedList<>();
		
		if(this.sonIguales(n)) {
			coincidencias.add(this);
		}
		this.elementos.forEach(e -> coincidencias.addAll(e.buscarTodosLosIguales(n)));
		return coincidencias;
	}
	
	
	
	}

	
	
	
	
	
	
	
	
	

