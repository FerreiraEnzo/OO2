package ar.edu.unlp.objetos.uno.Ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntRingTest {
	private IntRing principleRing;
	private IntRing mediumRing;
	private IntRing lastRing;
	
	
	@BeforeEach 
	public void setUp() {
		this.principleRing = new IntRing(new int [0]);
		this.mediumRing = new IntRing(new int [6]);
		this.lastRing = new IntRing(new int [4]);
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
		
		

}
