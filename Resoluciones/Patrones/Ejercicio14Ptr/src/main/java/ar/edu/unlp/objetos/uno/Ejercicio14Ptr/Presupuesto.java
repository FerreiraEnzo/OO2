package ar.edu.unlp.objetos.uno.Ejercicio14Ptr;

import java.util.LinkedList;
import java.util.List;

public class Presupuesto {
	private List<Componente> partes;
	
	
	public Presupuesto() {
		this.partes = new LinkedList<Componente>();
	}
	
	public void agregarComponente(Componente parte) {
		this.partes.add(parte);
	}
	
	public double calcularConsumo() {
		return this.partes.stream().mapToDouble(p -> p.getConsumo()).sum();
	}
	
	public double calcularPrecioFinal() {
		return this.partes.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
	
	
	
	
}
