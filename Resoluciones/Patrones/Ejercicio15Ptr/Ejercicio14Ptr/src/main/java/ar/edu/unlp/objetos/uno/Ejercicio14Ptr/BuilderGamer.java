package ar.edu.unlp.objetos.uno.Ejercicio14Ptr;

public class BuilderGamer extends Builder{

	
	public  void construirProcesador() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("Procesador Gamer"));
		this.presupuesto.agregarComponente(this.catalogo.getComponente("Pad Térmico"));
		this.presupuesto.agregarComponente(this.catalogo.getComponente("Cooler"));
	}	
	
	
	public void construirMemoriaRAM() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("32 GB"));
		this.presupuesto.agregarComponente(this.catalogo.getComponente("32 GB"));
	}
	
	public void construirDisco() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("SSD 500 GB"));
		this.presupuesto.agregarComponente(this.catalogo.getComponente("SSD 1TB"));
	}

	public void construirGrafica() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("RTX 4090"));
	}
	
	public void construirGabinete() {
		this.presupuesto.agregarComponente(this.catalogo.getComponente("Gabinete Gamer"));
		double consumo = this.presupuesto.calcularConsumo();
		consumo = consumo * 0.5;
		this.presupuesto.agregarComponente(this.catalogo.getComponente("Fuente" + consumo + "W"));
	}
	
	public Presupuesto getPresupuesto() {
		return this.presupuesto;
	}
	
	
	
	
	
}
