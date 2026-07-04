package ar.edu.unlp.objetos.uno.Ejercicio6PtrV2;

public class BuilderSinTACC extends Builder{
	
	
	public BuilderSinTACC() {
		super();
	}
	
	public void construirPan() {
		this.sandwich.agregarIngrediente(new Ingrediente("Pan Chipá", 150));
	}
	
	public void construirAderezo() {
		this.sandwich.agregarIngrediente(new Ingrediente("Salsa Tártara", 18));
	}
	
	public void construirPrincipal() {
		this.sandwich.agregarIngrediente(new Ingrediente("Carne de pollo", 250));
	}
	
	public void construirAdicional() {
		this.sandwich.agregarIngrediente(new Ingrediente("Verduras grilladas", 200));
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
