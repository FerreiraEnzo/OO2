package ar.edu.unlp.objetos.uno.Ejercicio18PtrV2;

import java.util.LinkedList;
import java.util.List;

public  class Personaje {
	private String nombre;
	private Arma arma;
	private Armadura armadura;
	private int vida;
	private List<String>habilidades;
	
	
	public Personaje(String n, Arma arma, Armadura ar) {
		this.nombre = n;
		this.arma = arma;
		this.armadura = ar;
		this.habilidades = new LinkedList<String>();
	}
	
	
	public void enfrentamiento(Personaje rival) {
		if(this.tieneVida() && rival.tieneVida()) {
			rival.perderVida(rival.getArmadura().recibirDanio(this.getArma()));
		}else {
			throw new RuntimeException("Uno de los personajes no tiene vida");
		}
	}
	
	
	public void perderVida(int vida) {
		this.vida -= vida;
	}
	
	
	public Arma getArma() {
		return this.arma;
	}
	
	public Armadura getArmadura() {
		return this.armadura;
	}
	
	public void agregarHabilidad(String h) {
		this.habilidades.add(h);
	}
	
	
	public boolean tieneVida() {
		return this.vida > 0;
	}
	

}
