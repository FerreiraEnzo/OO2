package ar.edu.unlp.objetos.uno.Ejercicio14Ptr;

import java.util.List;

public class Catalogo {
	private static List<Componente> componentes;
	
	
	
	public Componente getComponente(String descripcion) {
		return this.componentes.stream().filter(c -> c.getNombre().equals(descripcion)).findFirst().orElse(null);
	}
	
	
	

}
