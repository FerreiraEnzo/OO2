package ar.edu.unlp.objetos.uno.Ejercicio10Ptr;

public abstract class State {
	protected Calculadora calculadora;
	
	
	
	public State(Calculadora c) {
		this.calculadora = c;
	}
	
	
	public abstract double devolverResultado();
	public abstract void setValor(double unValor);
	public abstract void mas();
	public abstract void menos();
	public abstract void multiplicar();
	public abstract void dividir();
	
	
	
	
	

}
