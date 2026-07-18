package ar.edu.unlp.objetos.uno.Ejercicio26Ptr;

import java.time.LocalDate;

public class Automovil extends Bien{
	private int modelo;
	private double kilometraje;
	private double costo0KM;
	
	private static final double COEFICIENTE_LIQUIDEZ = 0.7;
	private static final double COSTO_ANUAL = 0.10;
	
	public Automovil(int m, double k, double c) {
		this.modelo = m;
		this.kilometraje = k;
		this.costo0KM = c;
	}
	
	
	public double calcularValor() {
		int antiguedad = Math.max(0, LocalDate.now().getYear() - modelo);
		return this.costo0KM * Math.pow(1 - COSTO_ANUAL, antiguedad);
	}
	
	public double getLiquidez() {
		return this.COEFICIENTE_LIQUIDEZ;
	}
	
	
	
	
	

}
