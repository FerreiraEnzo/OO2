package ar.edu.unlp.objetos.uno.Ejercicio8Ptr;

import java.time.Duration;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class ToDoItem {
	protected State state;
	private String name;
	protected LocalTime horaInicio;
	protected LocalTime horaFin;
	protected List<String> comentarios;
	
	
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending(this);
		this.comentarios = new LinkedList<String>();
	}

	
	   	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	public void start() {
		this.state.comenzar();
	}

		/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress sí * su estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	public void togglePause() {
		this.state.alternarPausa();
	}


		/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	public void finish() {
		this.state.finalizar();
	}


		/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	public Duration workedTime() {
		return this.state.tiempoTrabajado();
	}


	
	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."

	
	*/
        public void addComment(String comment) {
        	this.state.agregarComentario(comment);
        }

}
