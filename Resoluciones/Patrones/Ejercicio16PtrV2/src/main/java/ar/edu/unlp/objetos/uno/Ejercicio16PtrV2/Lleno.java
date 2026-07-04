package ar.edu.unlp.objetos.uno.Ejercicio16PtrV2;

public class Lleno extends State{
	
	public Lleno() {
		
	}
	
	public State agregar(Excursion e, Usuario u) {
		e.inscribirListEspera(u);
		return this;
	}
	
	public String informacion(Excursion e) {
		return "";
	}
	
	
	
	

}
