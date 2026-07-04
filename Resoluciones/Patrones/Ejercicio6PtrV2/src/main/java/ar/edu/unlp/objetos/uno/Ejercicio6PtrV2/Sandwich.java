package ar.edu.unlp.objetos.uno.Ejercicio6PtrV2;

import java.util.LinkedList;
import java.util.List;

public class Sandwich {
	private List<Ingrediente> ingredientes;
	
	
	public Sandwich() {
		this.ingredientes = new LinkedList<Ingrediente>();
	}
	
	
	public void agregarIngrediente(Ingrediente i) {
		this.ingredientes.add(i);
	}
	
	public double calcularValor() {
		return this.ingredientes.stream().mapToDouble(i -> i.getValor()).sum();
	}
	
	
	
	
	
	
	
	
	
	

}
