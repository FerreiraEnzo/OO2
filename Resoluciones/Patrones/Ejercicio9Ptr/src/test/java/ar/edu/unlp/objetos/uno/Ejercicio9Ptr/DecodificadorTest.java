package ar.edu.unlp.objetos.uno.Ejercicio9Ptr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class DecodificadorTest {
	private Decodificador unDecodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunKirk;
	private Pelicula rocky;
	private Pelicula rambo;
	
	
	@BeforeEach
	public void setUp() {
		thor = new Pelicula("Thor", 9, 2007);
		capitanAmerica = new Pelicula("Capitan America", 7, 2016);
		ironMan = new Pelicula("Iron Man", 8, 2010);
		dunKirk = new Pelicula("Dunkirk", 8, 2017);
		rocky = new Pelicula("Rocky", 8, 1976);
		rambo = new Pelicula("Rambo", 8, 1979);
		List<Pelicula> grilla = new LinkedList<>();
		grilla.add(capitanAmerica);
		grilla.add(thor);
		grilla.add(ironMan);
		grilla.add(dunKirk);
		grilla.add(rocky);
		grilla.add(rambo);
		List<Pelicula> vistas = new LinkedList<>();
		vistas.add(thor);
		vistas.add(rocky);
		agregarSimilares();
		Estrategia unaStrategy = new Similaridad();
		unDecodificador = new Decodificador(grilla,vistas,unaStrategy);
	}
	
	
	public void agregarSimilares() {
		thor.agregarSimilar(capitanAmerica);
		thor.agregarSimilar(ironMan);
		capitanAmerica.agregarSimilar(thor);
		capitanAmerica.agregarSimilar(ironMan);
		ironMan.agregarSimilar(thor);
		ironMan.agregarSimilar(capitanAmerica);
	}
	
	/*@Test
	public void sugerirSimilaridad() {
		List<Pelicula> resultado = new LinkedList<Pelicula>();
		resultado.add(dunKirk);
		resultado.add(capitanAmerica);
		resultado.add(ironMan);
		assertTrue(resultado.equals(unDecodificador.sugerirPeliculas()));
	}*/
	
	
	
	
	
	
	
}
