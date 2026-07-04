package ar.edu.unlp.objetos.uno.Ejercicio16PtrV2;


public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario(String n, String ape, String e) {
		this.nombre = n;
		this.apellido = ape;
		this.email = e;
	}
	
	public String getEmail() {
		return this.email;
	}
	

}
