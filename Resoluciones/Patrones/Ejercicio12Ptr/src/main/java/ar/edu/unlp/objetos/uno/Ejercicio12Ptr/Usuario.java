package ar.edu.unlp.objetos.uno.Ejercicio12Ptr;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<AutoEnAlquiler> autosEnAlquiler;
	

	public Usuario(String nombre) {
		this.nombre = nombre;
		this.autosEnAlquiler = new LinkedList<AutoEnAlquiler>();
	}
	
	
	public void agregarAuto(AutoEnAlquiler auto) {
		this.autosEnAlquiler.add(auto);
	}
	
	
	
	
	
}
