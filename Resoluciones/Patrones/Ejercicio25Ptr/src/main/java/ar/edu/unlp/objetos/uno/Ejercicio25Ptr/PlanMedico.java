package ar.edu.unlp.objetos.uno.Ejercicio25Ptr;

import java.time.LocalDate;

public abstract class PlanMedico {
	private LocalDate fechaContratacion;
	
	
	public PlanMedico() {
		this.fechaContratacion = LocalDate.now();
	}
	
	public LocalDate getFechaContratacion() {
		return this.fechaContratacion;
	}

	
	public double calcularMontoMensual(Afiliado a) {
		return this.getMontoFijo(a.getCoseguro()) + this.calcularCargoFamiliar(a) + this.adicionalCobertura(a) + this.seguroInternacion();
	}
	
	
	
	public abstract double getMontoFijo(ICoseguro c);
	public abstract double calcularCargoFamiliar(Afiliado a);
	public abstract double adicionalCobertura(Afiliado a);
	public abstract double seguroInternacion();
	
	
}
