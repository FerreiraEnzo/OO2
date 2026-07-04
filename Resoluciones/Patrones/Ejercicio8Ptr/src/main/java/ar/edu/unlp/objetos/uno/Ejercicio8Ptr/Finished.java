package ar.edu.unlp.objetos.uno.Ejercicio8Ptr;

import java.time.Duration;
import java.time.LocalDate;


public class Finished extends State{
	
	public Finished(ToDoItem item) {
		super(item);
	}
	
	public void comenzar() {
	}
	
	public void alternarPausa() {
		throw new RuntimeException("El estado no se encontraba en progreso o pausado");
	}
	
	public void finalizar() {
	}
	
	public Duration tiempoTrabajado() {
		return Duration.between(this.toDoItem.horaInicio, this.toDoItem.horaFin);
	}
	
	
	public void agregarComentario(String comentario) {
	}
	
	

}
