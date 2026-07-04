package ar.edu.unlp.objetos.uno.Ejercicio10Ptr;


public class Error extends State{
	
	
	public Error(Calculadora calculadora) {
		super(calculadora);
	}
	
	
	public double devolverResultado() {
		throw new RuntimeException("Error"); 
	}
		
	public void setValor(double unValor) {
	}
	
	
	public void mas() {
	}
	
	public void menos() {	
	}
	
	public void multiplicar() {
	}
	
	public void dividir() {
	}
	


}
