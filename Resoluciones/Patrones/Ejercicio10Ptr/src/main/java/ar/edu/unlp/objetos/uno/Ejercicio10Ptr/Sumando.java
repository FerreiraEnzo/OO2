package ar.edu.unlp.objetos.uno.Ejercicio10Ptr;

public class Sumando extends Esperando{

	
	public Sumando(Calculadora calculadora) {
		super(calculadora);
	}
	
	
	public void setValor(double unValor) {
		this.calculadora.valorAcumulado+= unValor;
		this.calculadora.estado = new Inicial(this.calculadora);
	}
	
	public double devolverResultado() {
		return this.calculadora.valorAcumulado;
	}
	
	
	
	
	
}
