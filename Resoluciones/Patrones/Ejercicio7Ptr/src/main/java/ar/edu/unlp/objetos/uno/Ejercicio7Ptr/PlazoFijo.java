package ar.edu.unlp.objetos.uno.Ejercicio7Ptr;

public class PlazoFijo extends ProductoFinanciero{
	private int cantidadDias;
	private double interes;
	

	public PlazoFijo(int cantidad, double unInteres) {
		this.cantidadDias = cantidad;
		this.interes = unInteres;
	}
	
	
	public double retornoInversion(double monto) {
		return 0;
	}
	
}
