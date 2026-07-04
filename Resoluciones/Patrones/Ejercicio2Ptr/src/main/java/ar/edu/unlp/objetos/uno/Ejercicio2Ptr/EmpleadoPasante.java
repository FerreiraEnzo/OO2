package ar.edu.unlp.objetos.uno.Ejercicio2Ptr;

public class EmpleadoPasante extends Empleado{
	private int cantExamenRendidos;

	
	public EmpleadoPasante(int cantExamenes) {
		this.cantExamenRendidos = cantExamenes;
	}
	
	
	public double calcularBasico() {
		return 20000;
	}
	
	public double calcularAdicional() {
		return (2000 * this.cantExamenRendidos);
	}
	
	
	
	
	
	
	
}
