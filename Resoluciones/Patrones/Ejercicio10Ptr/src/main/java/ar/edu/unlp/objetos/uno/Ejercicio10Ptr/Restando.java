package ar.edu.unlp.objetos.uno.Ejercicio10Ptr;

public class Restando extends Esperando{
	
	
	public Restando(Calculadora c) {
		super(c);
	}
	
	public double devolverResultado() {
		return this.calculadora.valorAcumulado;
	}
	
	public void setValor(double unValor) {
		this.calculadora.valorAcumulado -= unValor;
		this.calculadora.estado = new Inicial(this.calculadora);
	}
	

}
