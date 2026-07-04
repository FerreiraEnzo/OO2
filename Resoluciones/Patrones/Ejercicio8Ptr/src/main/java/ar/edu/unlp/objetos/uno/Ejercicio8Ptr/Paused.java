package ar.edu.unlp.objetos.uno.Ejercicio8Ptr;

import java.time.Duration;
import java.time.LocalTime;

public class Paused extends State{
	
	
	public Paused(ToDoItem item) {
		super(item);
	}
	
	
	public void comenzar() {
	}
	
	public void alternarPausa() {
		this.toDoItem.state = new InProgress(this.toDoItem);
	}
	
	public void finalizar() {
		this.toDoItem.state = new Finished(this.toDoItem);
		this.toDoItem.horaFin = LocalTime.now();
	}

	public Duration tiempoTrabajado() {
		return Duration.between(this.toDoItem.horaInicio, LocalTime.now());
	}
	
	public void agregarComentario(String comentario) {
		this.toDoItem.comentarios.add(comentario);
	}
	

	
	
	
}
