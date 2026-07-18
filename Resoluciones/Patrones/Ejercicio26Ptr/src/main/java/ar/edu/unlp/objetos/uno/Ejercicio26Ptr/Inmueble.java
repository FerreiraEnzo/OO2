package ar.edu.unlp.objetos.uno.Ejercicio26Ptr;

public class Inmueble extends Bien{
	private String direccion;
	private double superficie;
	private double costoM2;
	

	private static final double COEFICIENTE = 0.2;

	public Inmueble(String d, double s, double c) {
		this.direccion = d;
		this.superficie = s;
		this.costoM2 = c;
	}
	
	public double calcularValor() {
		return this.superficie * this.costoM2;
	}
	
	public double getLiquidez() {
		return this.COEFICIENTE;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
