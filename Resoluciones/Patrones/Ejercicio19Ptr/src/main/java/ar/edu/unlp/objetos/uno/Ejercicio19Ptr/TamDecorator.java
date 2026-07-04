package ar.edu.unlp.objetos.uno.Ejercicio19Ptr;

public class TamDecorator extends Decorator{

	
	public TamDecorator(lFile f) {
		super(f);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getTamaño();
	}
	
	
	
	
	
}
