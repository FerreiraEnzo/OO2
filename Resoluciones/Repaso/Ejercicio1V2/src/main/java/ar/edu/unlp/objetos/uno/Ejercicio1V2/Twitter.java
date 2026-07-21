package ar.edu.unlp.objetos.uno.Ejercicio1V2;

import java.util.LinkedList;
import java.util.List;


public class Twitter {
	private List<Usuario> usuarios;
	
	
	public Twitter() {
		this.usuarios = new LinkedList<Usuario>();
	}
	
	
	public void crearUsuario(String name) {
		if(!existeUsuario(name)) {
			Usuario u = new Usuario(name);
			this.usuarios.add(u);
		}
	}
	
	
	
	public boolean existeUsuario(String name) {	
		return this.usuarios.stream().anyMatch(u -> u.getScreenName().equals(name));
	}
	
	public void eliminarUsuario(Usuario u) {
		if(existeUsuario(u.getScreenName())) {
			u.eliminarPublicaciones();
			this.usuarios.remove(u);
		}
	}
	

	
	
	
}
