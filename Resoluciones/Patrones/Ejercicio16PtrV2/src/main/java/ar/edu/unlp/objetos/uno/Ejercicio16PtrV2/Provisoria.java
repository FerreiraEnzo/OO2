package ar.edu.unlp.objetos.uno.Ejercicio16PtrV2;

public class Provisoria extends State{
	
	
	public Provisoria() {
		
	}
	
	
	public State agregar(Excursion e, Usuario u) {
		e.inscribirUsuarioNormal(u);
		if(e.getCupoActual() == e.getCupoMinimo()) {
			return new Definitiva();
		}
		return this;
	}
	
	public String informacion(Excursion e) {
		return e.toString() + "Cantidad de usuarios faltantes para alcanzar el cupo minimo: " + (e.getCupoMinimo() - e.getCupoActual());
	}
	
	
	
	

}
