package ar.edu.unlp.objetos.uno.Ejercicio3;

public class CharRing extends Ring{
	private char [] source;
	
	
	public CharRing(String src) {
		source = src.toCharArray();
		idx = 0;
	}
	
	
	public char next() {
		return source[this.chequearLongitudYAvanzar(source.length)];
	}
		

}
