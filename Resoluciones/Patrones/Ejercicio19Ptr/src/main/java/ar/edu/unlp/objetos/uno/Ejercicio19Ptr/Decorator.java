package ar.edu.unlp.objetos.uno.Ejercicio19Ptr;

import java.time.LocalDate;

public abstract class Decorator implements lFile{
	private lFile component;
	
	
	
	public Decorator(lFile c) {
		this.component = c;
	}
	

	public String prettyPrint() {
		return this.component.prettyPrint();
	}

	
	public String getExtension() {
		return this.component.getExtension();
	}
	
	public int getTamaño() {
		return this.component.getTamaño();
	}
	
	public LocalDate getFechaCreacion() {
		return this.component.getFechaCreacion();
	}
	
	public String getPermisos() {
		return this.component.getPermisos();
	}
	

	
	
	
	
	
	
}
	
	


