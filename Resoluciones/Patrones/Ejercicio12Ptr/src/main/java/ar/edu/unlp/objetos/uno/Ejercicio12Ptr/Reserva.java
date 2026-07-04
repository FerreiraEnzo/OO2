package ar.edu.unlp.objetos.uno.Ejercicio12Ptr;

import java.time.LocalDate;

public class Reserva {
	private int cantidadDias;
	private LocalDate fecha;
	private AutoEnAlquiler vehiculo;
	private Usuario conductor;
	//private LocalDate fechaDeCancelacion;	 La puedo guardar para hacer que se calcule una sola vez la cancelación.
	
	
	public Reserva(int cantDias, LocalDate fecha, AutoEnAlquiler auto, Usuario conductor){
		this.cantidadDias = cantDias;
		this.fecha = fecha;
		this.vehiculo = auto;
		this.conductor = conductor;
	}
	

	
	public double montoAPagar() {
		return this.vehiculo.getPrecioPorDia() * this.cantidadDias;
	}
	
	public double montoAReembolsar(LocalDate fechaTentativa) {
		//this.fechaDeCancelacion = fechaTentativa;
		return this.vehiculo.calcularMontoAReembolsar(fechaTentativa, fecha,this.montoAPagar());
	}
	
	
	

}
