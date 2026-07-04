package ar.edu.unlp.objetos.uno.Ejercicio10Ptr;

public class Dividiendo extends Esperando{
	
	
	public Dividiendo(Calculadora calculadora) {
		super(calculadora);
	}
	
		
	public void setValor(double unValor) {
		if(unValor == 0) {
			this.calculadora.estado = new Error(this.calculadora);
		}else {
			this.calculadora.valorAcumulado = this.calculadora.valorAcumulado / unValor;
		}
	}
	
	public double devolverResultado() {
		return this.calculadora.valorAcumulado;
	}
	
	
	
	
}
