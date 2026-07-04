package ar.edu.unlp.objetos.uno.Ejercicio10Ptr;

public class Calculadora {
	protected State estado;
	protected double valorAcumulado;
	
	
	public Calculadora() {
		this.borrar();
	}
	
	
	 /**
 	* Devuelve el resultado actual de la operación realizada.
* Si no se ha realizado ninguna operación, devuelve el valor acumulado.
* Si la calculadora se encuentra en error, devuelve “error”
     */
    public double getResultado() {
    	return this.estado.devolverResultado();
    }


    /**
     * Pone en cero el valor acumulado y reinicia la calculadora
     */
    public void borrar() {
    	this.valorAcumulado = 0;
    	this.estado = new Inicial(this);
    }


    /**
     * Asigna un valor para operar. 
     * si hay una operación en curso, el valor será utilizado en la operación
     */
    public void setValor(double unValor) {
    	this.estado.setValor(unValor);
    }


     /**
      * Indica que la calculadora debe esperar un nuevo valor. 
      * Si a continuación se le envía el mensaje setValor(), la calculadora sumará
      * el valor recibido como parámetro, al valor actual y guardará el resultado 
      */
    public void mas() {
    	this.estado.mas();
    }

    public void menos() {
    	this.estado.menos();
    }

	public void por() {
		this.estado.multiplicar();
	}
	
	public void dividir() {
		this.estado.dividir();
	}
	
}
