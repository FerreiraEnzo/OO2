package ar.edu.unlp.objetos.uno.Ejercicio14Ptr;

public class BuilderIntermedio extends Builder{

	
	public  void construirProcesador() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("Procesador Intermedio"));	
	}	
	
	
	public void construirMemoriaRAM() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("16 GB"));
	}
	
	public void construirDisco() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("SSD 500 GB"));
	}

	public void construirGrafica() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("GTX 1650"));
	}
	
	public void construirGabinete() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("Intermedio Fuente 800 W"));
	}
	
	
	public Presupuesto getPresupuesto() {
		return this.presupuesto;
	}
	
	
	
	
}
