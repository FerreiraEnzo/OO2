package ar.edu.unlp.objetos.uno.Ejercicio2;

public class Tijera implements Juego{
	
	
	public Tijera() {
	}
	
	
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}

	public String jugarContraPapel() {
		return "Gana Tijera";
	}
	
	public String jugarContraTijera() {
		return "Empate";
	}
	
	public String jugarContraSpock() {
		return "Gana Spock";
	}
	
	public String jugarContraLagarto() {
		return "Gana Tijera";
	}
	
	
	

}
