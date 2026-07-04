package ar.edu.unlp.objetos.uno.Ejercicio7Ptr;

public class ClienteSilver extends Cliente{
	
	
	
	
	public ProductoFinanciero crearProducto1() {
		ProductoFinanciero compraDolares = new CompraDolares(100);
		ProductoFinanciero compraPesos = new CompraPesos(100);
		ProductoFinanciero plazoFijo = new PlazoFijo(35, 5);
		ProductoCombinado p1 = new ProductoCombinado();
		p1.agregarProducto(compraDolares);
		p1.agregarProducto(compraPesos);
		p1.agregarProducto(plazoFijo);
		return p1;
	}
	
	public ProductoFinanciero crearProducto2() {
		ProductoFinanciero bonosBajoRiesgo = new CompraBonoBajoRiesgo(72);
		ProductoFinanciero compraDolares = new CompraDolares(100);
		ProductoFinanciero plazoFijo = new PlazoFijo(35, 5);
		ProductoFinanciero compraPesos = new CompraPesos(100);
		ProductoCombinado p2 = new ProductoCombinado();
		p2.agregarProducto(bonosBajoRiesgo);
		p2.agregarProducto(compraDolares);
		p2.agregarProducto(plazoFijo);
		p2.agregarProducto(compraPesos);
		return p2;
	}
	
	
	
	public ProductoFinanciero crearProducto3() {
		throw new RuntimeException("Este no es un producto que usted puede adquirir bajo su membresía");
	}
	
	public ProductoFinanciero crearProducto4() {
		throw new RuntimeException("Este no es un producto que usted puede adquirir bajo su membresía");
	}
	
	
	
	

}
