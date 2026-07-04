package ar.edu.unlp.objetos.uno.Ejercicio11PtrV2;

import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
	private String nombre;
	private LocalDate fechaCreacion;
	
	
	public Elemento(String n) {
		this.nombre = n;
		this.fechaCreacion = LocalDate.now();
	}
	
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public boolean sonIguales(String n) {
		return this.nombre.equals(n);
	}
	
	public String toString() {
		return this.nombre + "/ \n";
	}

	
	public abstract int calcularTamaño();
	public abstract Archivo calcularMaximoTamaño();
	public abstract Archivo masNuevo();
	public abstract List<Elemento> buscarTodosLosIguales(String n);
	
	
	
	
	
	
	
	
	
}
