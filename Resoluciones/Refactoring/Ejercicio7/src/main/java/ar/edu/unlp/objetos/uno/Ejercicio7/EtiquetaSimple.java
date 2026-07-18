package ar.edu.unlp.objetos.uno.Ejercicio7;

public class EtiquetaSimple extends Etiqueta{
	
	
	
	public EtiquetaSimple(String nombre, double precio) {
		super(nombre,precio);
	}
	
	
	    public void generar() {
	        System.out.println("--- ETIQUETA BÁSICA ---");
	        this.imprimirNombreProducto();
	        System.out.println("Precio: $" + precio);
	    }
	    

	    public void imprimirEncabezado() {
	        System.out.println("--- ETIQUETA BÁSICA ---");
	    }
	    
		public void imprimirPrecio() {
			System.out.println("Precio: $" + precio);
		}
	    
	    
	}


