package ar.edu.unlp.objetos.uno.Ejercicio6PtrV2;

public class BuilderVegano extends Builder{
	
	
	public BuilderVegano() {
		super();
	}
	
	public void construirPan() {
		this.sandwich.agregarIngrediente(new Ingrediente("Pan Integral", 100));
	}
	
	public void construirAderezo() {
		this.sandwich.agregarIngrediente(new Ingrediente("Salsa criolla", 20));
	}
	
	public void construirPrincipal() {
		this.sandwich.agregarIngrediente(new Ingrediente("Milanesa de girgolas", 500));
	}
	
	public void construirAdicional() {
	}
	
	
	
	
	
	
	
	
	
	
	

}
