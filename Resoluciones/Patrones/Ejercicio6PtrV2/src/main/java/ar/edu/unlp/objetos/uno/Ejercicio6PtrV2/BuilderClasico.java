package ar.edu.unlp.objetos.uno.Ejercicio6PtrV2;

public class BuilderClasico extends Builder{
	
	
	
	public BuilderClasico() {
		super();
	}
	
	public void construirPan() {
		this.sandwich.agregarIngrediente(new Ingrediente("Pan Brioche", 100));
	}
	
	public void construirAderezo() {
		this.sandwich.agregarIngrediente(new Ingrediente("Mayonesa", 20));
	}
	
	public void construirPrincipal() {
		this.sandwich.agregarIngrediente(new Ingrediente("Carne", 300));
	}
	
	public void construirAdicional() {
		this.sandwich.agregarIngrediente(new Ingrediente("Tomate", 80));
	}
	
	
	
	
	
	

}
