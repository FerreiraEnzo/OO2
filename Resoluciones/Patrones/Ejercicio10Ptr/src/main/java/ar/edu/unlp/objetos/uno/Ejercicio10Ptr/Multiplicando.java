package ar.edu.unlp.objetos.uno.Ejercicio10Ptr;

public class Multiplicando extends Esperando{

	
	
	public Multiplicando(Calculadora calculadora) {
		super(calculadora);
	}
	
	
	public void setValor(double unValor) {
		this.calculadora.valorAcumulado = this.calculadora.valorAcumulado * unValor;
		this.calculadora.estado = new Inicial(this.calculadora);
	}
	
	
	
	public double devolverResultado() {
		return this.calculadora.valorAcumulado;
	}
	
	
	
	
	
	
	
	
	
}
