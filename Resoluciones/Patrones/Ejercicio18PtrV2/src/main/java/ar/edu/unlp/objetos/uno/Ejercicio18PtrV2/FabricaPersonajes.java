package ar.edu.unlp.objetos.uno.Ejercicio18PtrV2;

public class FabricaPersonajes {

	
	
	public FabricaPersonajes() {
	}
	
	
	public Personaje crearGuerrero(String name) {
		Personaje p1 =  new Personaje(name, new Espada(), new Acero());
		p1.agregarHabilidad("Experto en combate cuerpo a cuerpo");
		return p1;
	}
	
	
	public Personaje crearMago(String name) {
		Personaje p2 =  new Personaje(name, new Baston(), new Cuero());
		p2.agregarHabilidad("Magia");
		p2.agregarHabilidad("Combate a distancia");
		return p2;
	}
	
	
	public Personaje crearArquero(String name) {
		Personaje p3 =  new Personaje(name, new Arco(), new Cuero());
		p3.agregarHabilidad("Especialista en disparos de flechas");
		return p3;
	}
	
	
	public Personaje crearThoor(String n) {
		Personaje p4 = new Personaje(n, new Martillo(), new Hierro());
		p4.agregarHabilidad("Lanzar rayos");
		p4.agregarHabilidad("Combate a distancia");
		return p4;
	}
	
	
	
	
	
	
	
	
	
}
