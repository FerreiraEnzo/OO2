package ar.edu.unlp.objetos.uno.Ejercicio10Ptr;


public class Inicial extends State{

	
	public Inicial(Calculadora calculadora) {
		super(calculadora);
	}
	
	
	public double devolverResultado() {
		return this.calculadora.valorAcumulado;
	}
	
	public void setValor(double unValor) {
    	this.calculadora.valorAcumulado = unValor;
    }
	
	
	
	public void mas() {
		this.calculadora.estado = new Sumando(this.calculadora);
	}
	
	public void menos() {
		this.calculadora.estado = new Restando(this.calculadora);
	}
	
	public void multiplicar() {
		this.calculadora.estado = new Multiplicando(this.calculadora);
	}
	
	public void dividir() {
		this.calculadora.estado = new Dividiendo(this.calculadora);
	}
	
	
	
}
