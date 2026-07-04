package ar.edu.unlp.objetos.uno.Ejercicio6PtrV2;

public class BuilderVegetariano extends Builder{
	
	public BuilderVegetariano() {
		super();
	}
	
	public void construirPan() {
		this.sandwich.agregarIngrediente(new Ingrediente("Pan con semillas", 120));
	}
	
	public void construirAderezo() {
	}
	
	public void construirPrincipal() {
		this.sandwich.agregarIngrediente(new Ingrediente("Provoleta grillada", 200));
	}
	
	public void construirAdicional() {
		this.sandwich.agregarIngrediente(new Ingrediente("Berenjenas al escabeche", 100));
	}
	
	
	
	
	

}
