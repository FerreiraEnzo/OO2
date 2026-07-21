package ar.edu.unlp.objetos.uno.Ejercicio1V2;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Post> posteos;

		

	public Usuario(String n) {
		this.screenName = n;
		this.posteos = new LinkedList<Post>();
	}

	public void agregarTweet(String text) {
		if(this.cumpleLongitud(text)) {
			Tweet t = new Tweet(text);
			this.posteos.add(t);
		}
	}
		
	public void eliminarPublicaciones() {
		this.posteos.clear();
	}
	
	private boolean cumpleLongitud(String t) {
		return t.length() >= this.limiteInferior() && t.length() <= this.limiteSuperior();
	}
	
	private double limiteInferior() {
		return 1;
	}
	
	private double limiteSuperior() {
		return 280;
	}
	
	public void eliminarPosteo(Post unPost) {
		if(existeTweet(unPost)) {
			this.posteos.remove(unPost);
		}
	}
		
	
	public boolean existeTweet(Post unPost) {
		return this.posteos.stream().anyMatch(t -> t.equals(unPost));
	}
	
	
	
	protected String getScreenName() {
		return this.screenName;
	}
	
	
}
