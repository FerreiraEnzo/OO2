package ar.edu.unlp.objetos.uno.Ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CharRingTest {
	private CharRing principleRing;
	private CharRing mediumRing;
	private CharRing lastRing;
	
	
	@BeforeEach 
	public void setUp() {
		this.principleRing = new CharRing("");
		this.mediumRing = new CharRing("abcdef");
		this.lastRing = new CharRing("casa");
	}
	
	@Test
	public void testNext_principleRing() {
		assertEquals(0, this.principleRing.getIdx());
	}
	
	@Test
	public void testNext_mediumRing(){
		for(int i=0; i<3; i++) {
			this.mediumRing.next();
		}
		assertEquals(3, this.mediumRing.getIdx());
	}
	
	
	@Test
	public void testNext_lastRing() {
		for(int i=0; i<3; i++) {
			this.mediumRing.next();
		}
		assertEquals(3, this.mediumRing.getIdx());
		
	}
	
	//TESTEAR CON ARRAY VACIO, VALOR EN EL MEDIO Y EN EL FINAL A VER QUE PASA. Y SI IDX RETORNA LO QUE TIENE QUE RETORNAR.

	
	
	
	
	
	
}
