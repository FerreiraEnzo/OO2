package ar.edu.unlp.objetos.uno.Ejercicio16PtrV2;

import java.util.stream.Collectors;

public class Definitiva extends State{
	
	public Definitiva() {
		
	}
	
	public State agregar(Excursion e, Usuario u) {
		e.inscribirUsuarioNormal(u);
		if(e.getCupoActual() == e.getCupoMaximo()) {
			return new Lleno();
		}
		return this;
	}
	
	public String informacion(Excursion e) {
		return e.toString() + "Cantidad de usuarios faltantes para alcanzar el cupo máximo: " + (e.getCupoMaximo() - e.getCupoActual()) + 
				"Mail de los usuarios inscriptos:" + e.getInscriptos().stream().map(Usuario::getEmail).collect(Collectors.joining());
	}
	
	
	
	

}
