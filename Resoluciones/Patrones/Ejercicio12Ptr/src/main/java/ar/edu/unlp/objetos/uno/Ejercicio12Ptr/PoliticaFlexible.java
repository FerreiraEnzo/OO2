package ar.edu.unlp.objetos.uno.Ejercicio12Ptr;

import java.time.LocalDate;


public class PoliticaFlexible implements PoliticaCancelacion{

	
	
	
	
	
	public double calcularMonto(LocalDate fechaTentativa, LocalDate fechaInicio,double monto) {
		if(fechaTentativa.isBefore(fechaInicio)) {	
			return monto;
		}
		throw new RuntimeException("La fecha de cancelación es posterior a la fecha de inicio de la reserva");
	}
	
	
	
	
	
	
	
	
	
	
	
}
