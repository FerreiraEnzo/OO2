package ar.edu.unlp.objetos.uno.Ejercicio19Ptr;

public class FechaCreacionDecorator extends Decorator{

	
	public FechaCreacionDecorator(lFile c) {
		super(c);
	}
	
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getFechaCreacion();
	}
	
	
	
	
}
