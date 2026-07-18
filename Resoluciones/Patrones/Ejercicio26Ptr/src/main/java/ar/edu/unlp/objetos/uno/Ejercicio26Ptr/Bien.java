package ar.edu.unlp.objetos.uno.Ejercicio26Ptr;

public abstract class Bien {

	
	
	public abstract double calcularValor();
	public abstract double getLiquidez();
	
	
	public double calcularValorPrendario() {
		return this.calcularValor() * this.getLiquidez();
	}
	
	
	
	
	

}
