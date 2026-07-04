package ar.edu.unlp.objetos.uno.Ejercicio8Ptr;

import java.time.Duration;

public abstract class State {
	protected ToDoItem toDoItem;
	
	
	public State(ToDoItem unToDoItem) {
		this.toDoItem = unToDoItem;
	}
	
	
	public abstract void comenzar();
	public abstract void alternarPausa();
	public abstract void finalizar();
	public abstract Duration tiempoTrabajado();
	public abstract void agregarComentario(String comentario); //LO PUEDO DEFINIR COMÚN ACÁ Y HACER OVERRIDE EN EL ESTADO QUE NO HACE NADA.
	
	

}
