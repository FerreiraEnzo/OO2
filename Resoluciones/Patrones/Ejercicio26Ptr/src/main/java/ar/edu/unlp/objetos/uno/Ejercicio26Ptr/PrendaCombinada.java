package ar.edu.unlp.objetos.uno.Ejercicio26Ptr;

import java.util.LinkedList;
import java.util.List;

public class PrendaCombinada extends Bien{
	private List<Bien> bienes;
	
	private static final double COEFICIENTE_LIQ = 0.5;
	
	public PrendaCombinada() {
		this.bienes = new LinkedList<Bien>();
	}
	
	public double calcularValor() {
		return this.bienes.stream().mapToDouble(b -> b.calcularValorPrendario()).sum();
	}
	
	public double getLiquidez() {
		return this.COEFICIENTE_LIQ;
	}
	
	public void agregarBien(Bien b) {
		this.bienes.add(b);
	}
	
	public void eliminarBien(Bien b) {
		this.bienes.remove(b);
	}
	
	
	

}
