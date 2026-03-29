package ar.edu.unlp.objetos.uno.Ejercicio2;

public class Papel implements Juego{
	
	public Papel() {
	}
	
	public String jugarContraPiedra() {
		return "Gana Papel";
	}

	public String jugarContraPapel() {
		return "Empate";
	}
	
	public String jugarContraTijera() {
		return "Gana Tijera";
	}
	
	
	public String jugarContraSpock() {
		return "Gana Papel";
	}
	
	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}
	
	
	
}
