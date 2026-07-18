package ar.edu.unlp.objetos.uno.Ejercicio7;

public abstract class Etiqueta {
	protected String nombreProducto;
	protected double precio;
	
	 public Etiqueta(String nombre, double precio) {
	        this.nombreProducto = nombre;
	        this.precio = precio;
	    }
	 
	 public void imprimirNombreProducto() {
		 System.out.println(nombreProducto);
		 System.out.println("-----------------------");

	 }


	 public void generar() {		 
		 this.imprimirEncabezado();
		 this.imprimirNombreProducto();
		 this.imprimirPrecio();

	 }
	 
	 public abstract void imprimirEncabezado();
	 public abstract void imprimirPrecio();
	 
	 
}
	
	


