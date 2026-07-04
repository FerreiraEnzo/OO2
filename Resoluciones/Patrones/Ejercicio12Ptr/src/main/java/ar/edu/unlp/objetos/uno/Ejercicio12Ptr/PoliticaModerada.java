package ar.edu.unlp.objetos.uno.Ejercicio12Ptr;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaCancelacion{

	
	
	
	
	
	public double calcularMonto(LocalDate fechaTentativa, LocalDate fechaInicio,double monto) {
		long dias = ChronoUnit.DAYS.between(fechaTentativa, fechaInicio);
		
		if (dias <= 0) {
			throw new RuntimeException("La fecha de cancelación no es posterior a la fecha de inicio");
		}
		
		return (dias >= 7) ? monto : (dias >= 2) ? monto *0.5 : 0.0;
		
	}
	
	
}
