package ar.edu.unlp.objetos.uno.Ejercicio14Ptr;

public abstract class Builder {
	protected Presupuesto presupuesto;
	protected Catalogo catalogo;
	
	public Builder() {
		this.presupuesto = new Presupuesto();
	}
	
	public void reset() {
		this.presupuesto= new Presupuesto();
	}
	
	
	public abstract void construirProcesador();
	public abstract void construirMemoriaRAM();
	public abstract void construirDisco();
	public abstract void construirGrafica();
	public abstract void construirGabinete();
	
	
	
	
	
	

}
