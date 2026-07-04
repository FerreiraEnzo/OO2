package ar.edu.unlp.objetos.uno.Ejercicio2Ptr;

public abstract class Empleado {
	
	
	
	
	
	public double sueldo() {
		return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
	}
	
	public abstract double calcularBasico();
	public abstract double calcularAdicional();
	
	
	public double calcularDescuento() {
		return (this.calcularBasico() * 0.13) - (this.calcularAdicional() * 0.05);
	}							//PULL UP METHOD
	
	
	
	
	
}
