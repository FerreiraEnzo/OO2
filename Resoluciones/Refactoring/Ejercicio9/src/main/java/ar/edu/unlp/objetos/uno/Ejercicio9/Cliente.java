package ar.edu.unlp.objetos.uno.Ejercicio9;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private LocalDate fechaAlta;
	
	public LocalDate getFechaAlta() {
		return this.fechaAlta;
	}
	
	public int calcularAños() {
    	return Period.between(this.fechaAlta, LocalDate.now()).getYears();
	}
	
	
	
	

}
