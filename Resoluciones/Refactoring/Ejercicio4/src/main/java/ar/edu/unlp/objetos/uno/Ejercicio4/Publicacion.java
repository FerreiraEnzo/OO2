package ar.edu.unlp.objetos.uno.Ejercicio4;

public class Publicacion {
	private String texto;
	private int likes;
	
	
	public Publicacion(String texto) {
		this.texto = texto;
		this.likes = 0;
	}
	
	
	public void darLike() {
		this.likes++;
	}
	
	public void darDislike() {
		this.likes--;
	}
	
	private int impacto() {
		return this.likes * 3;
	}
	
	public int alcance() {
		return impacto() * 10;
	}
	
	
	
	
	
}
