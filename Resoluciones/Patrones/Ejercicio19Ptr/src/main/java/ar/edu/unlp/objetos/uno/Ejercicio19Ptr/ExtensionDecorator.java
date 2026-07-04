package ar.edu.unlp.objetos.uno.Ejercicio19Ptr;

public class ExtensionDecorator extends Decorator{

	
	public ExtensionDecorator(lFile c) {
		super(c);
	}
	
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension();
	}
	
	
	
	
	
}
