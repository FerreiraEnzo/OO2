package ar.edu.unlp.objetos.uno.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PapelTest {
	private Papel unPapel;
	
	
	
	@BeforeEach
	public void setUp() {
		unPapel = new Papel();
	}
	
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Papel", unPapel.jugarContraPiedra());
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals("Empate",unPapel.jugarContraPapel());
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Tijera", unPapel.jugarContraTijera());
	}
	
	@Test
	public void testJugarContraLagarto() {
		assertEquals("Gana Lagarto", unPapel.jugarContraLagarto());
	}
	
	@Test
	public void testJugarContraSpock() {
		assertEquals("Gana Papel", unPapel.jugarContraSpock());
	}
	
}
