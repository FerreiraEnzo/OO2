package ar.edu.unlp.objetos.uno.Ejercicio19Ptr;

public class PermisoDecorator extends Decorator{

	
	public PermisoDecorator(lFile c) {
		super(c);
	}
	
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getPermisos();
	}
	
	
	
	
	
	
	
}
