package ar.edu.unlp.objetos.uno.Ejercicio8Ptr;

import java.time.Duration;
import java.time.LocalTime;

public class Pending extends State{
	
	
	public Pending(ToDoItem unTodoItem) {
		super(unTodoItem);
	}
	
	
	public void comenzar() {
		this.toDoItem.state = new InProgress(this.toDoItem);
		this.toDoItem.horaInicio = LocalTime.now();
	}
	
	public void alternarPausa() {
		throw new RuntimeException("El estado no se encontraba en progreso o pausado");
	}
	
	public void finalizar() {
	}
	
	public Duration tiempoTrabajado() {
		throw new RuntimeException("El objeto ToDoItem aún no ha sido iniciado");
	}
	
	public void agregarComentario(String comentario) {
		this.toDoItem.comentarios.add(comentario);
	}
	
	
}
