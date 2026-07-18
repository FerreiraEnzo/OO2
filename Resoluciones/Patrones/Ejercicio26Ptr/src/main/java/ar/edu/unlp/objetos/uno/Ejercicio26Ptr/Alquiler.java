package ar.edu.unlp.objetos.uno.Ejercicio26Ptr;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Bien{
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double costoMensual;
	
	private static final double LIQUIDEZ = 0.9;

	public double calcularValor() {
		long faltantes = ChronoUnit.MONTHS.between(fechaInicio, fechaFin);
		return this.costoMensual * faltantes;
	}
	
	public double getLiquidez() {
		return this.LIQUIDEZ;
	}
	
	
	
	
	
	
	
	
	
	

}
