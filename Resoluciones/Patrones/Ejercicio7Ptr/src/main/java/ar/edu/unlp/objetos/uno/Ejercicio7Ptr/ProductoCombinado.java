package ar.edu.unlp.objetos.uno.Ejercicio7Ptr;

import java.util.LinkedList;
import java.util.List;

public class ProductoCombinado extends ProductoFinanciero{
	private List<ProductoFinanciero> productos;
	
	
	
	public ProductoCombinado() {
		this.productos = new LinkedList<ProductoFinanciero>();
	}
	
	public void agregarProducto(ProductoFinanciero unProducto) {
		this.productos.add(unProducto);
	}
	
	
	public double retornoInversion(double unMonto) {
		return 0;
	}
	
	
	
	
	

}
