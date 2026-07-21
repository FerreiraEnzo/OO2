package ar.edu.unlp.objetos.uno.Ejercicio1V2;


public class Tweet implements Post{
	private String texto;
	
	
	public Tweet(String texto) {
		this.texto = texto;
	}
	
	
	public double limiteInferior() {
		return 1;
	}
	
	public double limiteSuperior() {
		return 280;
	}
	
	
	
}
