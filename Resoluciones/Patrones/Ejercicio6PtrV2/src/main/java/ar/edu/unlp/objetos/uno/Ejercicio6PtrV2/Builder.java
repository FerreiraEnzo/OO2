package ar.edu.unlp.objetos.uno.Ejercicio6PtrV2;

import java.security.PublicKey;

public abstract class Builder {
	protected Sandwich sandwich;
	
	
	public Builder() {
		this.sandwich = new Sandwich();
	}
	
	
	public Sandwich getResultado() {
		return this.sandwich;
	}
	
	public void reset() {
		this.sandwich = new Sandwich();
	}
	

	public abstract void construirPan();
	public abstract void construirAderezo();
	public abstract void construirPrincipal();
	public abstract void construirAdicional();
	
	public double calcularValor() {
		return this.sandwich.calcularValor();
	}
	
	
	
	
	
	
	
}
