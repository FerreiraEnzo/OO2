package ar.edu.unlp.objetos.uno.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiedraTest {
	private Piedra unaPiedra;
	
	
	
	@BeforeEach
	public void setUp() {
		this.unaPiedra = new Piedra();
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Empate", unaPiedra.jugarContraPiedra());
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Papel",unaPiedra.jugarContraPapel());
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Piedra", unaPiedra.jugarContraTijera());
	}
	
	@Test
	public void testJugarContraLagarto() {
		assertEquals("Gana Piedra", unaPiedra.jugarContraLagarto());
	}
	
	@Test
	public void testJugarContraSpock() {
		assertEquals("Gana Spock", unaPiedra.jugarContraSpock());
	}
	
	
	
	
}
