package ar.edu.unlp.objetos.uno.Ejercicio2Ptr;

public class EmpleadoPlanta extends Empleado{
	private int antiguedad;
	private boolean esCasado;
	private int cantidadHijos;
	
	
	public EmpleadoPlanta(boolean casado, int cantidadHijos, int antiguedad) {
		this.antiguedad = antiguedad;
		this.esCasado = casado;
		this.cantidadHijos = cantidadHijos;
	}
	
	
	public double calcularBasico() {
		return 50000;
	}
	
	public double calcularAdicional() {
		double adicional = 0;
		if(this.esCasado)
			adicional += 5000;
		adicional += (5000 * this.cantidadHijos) + (2000 * antiguedad);
		return adicional;
	}
	
	
	
	
}
