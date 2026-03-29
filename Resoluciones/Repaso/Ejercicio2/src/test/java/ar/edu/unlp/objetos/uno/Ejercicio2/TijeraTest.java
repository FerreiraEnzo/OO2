package ar.edu.unlp.objetos.uno.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TijeraTest {
	private Tijera unaTijera;
	
	
	
	
	@BeforeEach
	public void setUp() {
		this.unaTijera = new Tijera();
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Piedra", unaTijera.jugarContraPiedra());
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Tijera", unaTijera.jugarContraPapel());
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals("Empate", unaTijera.jugarContraTijera());
	}
	
	@Test
	public void testJugarContraLagarto() {
		assertEquals("Gana Tijera", unaTijera.jugarContraLagarto());
	}

	@Test
	public void testJugarContraSpock() {
		assertEquals("Gana Spock", unaTijera.jugarContraSpock());
	}
	
	
	
	
	
	}

