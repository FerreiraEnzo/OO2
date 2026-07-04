package ar.edu.unlp.objetos.uno.Ejercicio14Ptr;

public class Director {
	private Builder builder;
	
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Presupuesto construir() {
		this.builder.reset();
		this.builder.construirProcesador();
		this.builder.construirMemoriaRAM();
		this.builder.construirDisco();
		this.builder.construirGrafica();
		this.builder.construirGabinete();
		return this.builder.presupuesto;
	}
	
	
	
	
	
	
	
}
