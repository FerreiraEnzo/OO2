package ar.edu.unlp.objetos.uno.Ejercicio2Ptr;

public class EmpleadoTemporario extends Empleado{
	private int horasTrabajadas;
	private boolean esCasado;
	private int cantidadHijos;
	
	
	public EmpleadoTemporario(int horas, boolean casado, int cantidadHijos) {
		this.horasTrabajadas = horas;
		this.esCasado = casado;
		this.cantidadHijos = cantidadHijos;
	}
	
	
	
	public double calcularBasico() {
		return 20000 + (this.horasTrabajadas * 300);
	}
	
	public double calcularAdicional() {		
		double monto = 0;
		if(this.esCasado)
			monto += 5000;
		return monto += this.cantidadHijos * 2000;

	}
	

	
	
	
}
