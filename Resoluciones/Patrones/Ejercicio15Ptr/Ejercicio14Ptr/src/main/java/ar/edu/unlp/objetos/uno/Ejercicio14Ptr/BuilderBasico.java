package ar.edu.unlp.objetos.uno.Ejercicio14Ptr;

public class BuilderBasico extends Builder{

	
	
	public  void construirProcesador() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("Procesador Basico"));	
	}	
	
	
	public void construirMemoriaRAM() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("8 GB"));
	}
	
	public void construirDisco() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("HDD 500GB"));
	}

	public void construirGrafica() {
	}
	
	public void construirGabinete() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("Estándar"));
	}
	
	public Presupuesto getPresupuesto() {
		return this.presupuesto;
	}
	
	
	
}
