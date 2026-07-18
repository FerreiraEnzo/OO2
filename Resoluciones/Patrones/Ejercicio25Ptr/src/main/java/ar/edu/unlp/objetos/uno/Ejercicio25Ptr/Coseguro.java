package ar.edu.unlp.objetos.uno.Ejercicio25Ptr;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Coseguro implements ICoseguro{
	private String nombre;
	private int descuento;
	private LocalDate fechaIngreso;
	private double montoCoberturaViajes;
	
	
	public Coseguro(String n, int descuento, LocalDate fechaIngreso, double monto) {
		this.nombre = n;
		this.descuento = descuento;
		this.fechaIngreso = fechaIngreso;
		this.montoCoberturaViajes = monto;
	}
	
	public int getDescuento() {
		return this.descuento;
	}
	
	public Long getAntiguedad() {
		return ChronoUnit.YEARS.between(fechaIngreso, LocalDate.now());
	}
	
	public double getMontoCoberturaViajes() {
		return this.montoCoberturaViajes;
	}
	

}
