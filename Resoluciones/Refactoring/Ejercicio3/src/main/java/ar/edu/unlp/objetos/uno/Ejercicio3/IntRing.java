package ar.edu.unlp.objetos.uno.Ejercicio3;

public class IntRing extends Ring{
	private int [] source;
	
	
	public IntRing(int[] src) {
		source = src;
		idx = 0;
	}
	
	public int next() {
		return source [this.chequearLongitudYAvanzar(source.length)];
	}
	
	
	
	
	
	
}
