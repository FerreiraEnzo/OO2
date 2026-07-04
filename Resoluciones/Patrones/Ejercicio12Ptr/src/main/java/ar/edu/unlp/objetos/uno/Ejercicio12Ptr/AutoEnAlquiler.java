package ar.edu.unlp.objetos.uno.Ejercicio12Ptr;

import java.time.LocalDate;

public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
	private PoliticaCancelacion strategy;
	
	
	
	public AutoEnAlquiler(double precio, int plazas, String marca, PoliticaCancelacion politica) {
		this.precioPorDia = precio;
		this.cantidadPlazas = plazas;
		this.marca = marca;
		this.strategy = politica;
	}
	
	
	
	public void setStrategy(PoliticaCancelacion unaStrategy) {
		this.strategy = unaStrategy;
	}
	
	public double calcularMontoAReembolsar(LocalDate fechaTentativa,LocalDate fechaInicio, double monto) {
		return this.strategy.calcularMonto(fechaTentativa, fechaInicio, monto);
	}
	

	public double getPrecioPorDia() {
		return this.precioPorDia;
	}
	
	
	
}
