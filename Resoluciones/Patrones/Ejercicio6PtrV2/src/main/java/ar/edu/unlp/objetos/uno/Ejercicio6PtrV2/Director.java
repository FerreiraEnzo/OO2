package ar.edu.unlp.objetos.uno.Ejercicio6PtrV2;

public class Director {
	private Builder builder;
	
	
	public Director(Builder b) {
		this.builder = b;
	}
	
	
	
	public Sandwich construir() {
		this.builder.construirPan();
		this.builder.construirAderezo();
		this.builder.construirPrincipal();
		this.builder.construirAdicional();
		return this.builder.getResultado();
	}
	
	
	
	
	
	
	
	
	
}
