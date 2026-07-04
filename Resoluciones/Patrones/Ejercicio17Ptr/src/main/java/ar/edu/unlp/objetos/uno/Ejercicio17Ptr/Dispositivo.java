package ar.edu.unlp.objetos.uno.Ejercicio17Ptr;

public class Dispositivo {
	private Calculador calculadorStrategy;
	private Ringer ringer;
	private Connection connectionStrategy;
	private Display display;
	
	
	public Dispositivo(Ringer r, Display p) {
		this.ringer = r;
		this.display = p;
	}
	
	
	public String data(String data) {
		long num = this.calculadorStrategy.crcFor(data);
		return this.connectionStrategy.sendData(data, num);
	}
	
	
	
	public void setCalculador(Calculador c) {
		this.calculadorStrategy = c;
	}
	
	
	public void setConnection(Connection c) {
		this.connectionStrategy = c;
		this.connectionStrategy.pict();
		this.ringer.ring();
	}
	
	
	
	
	
	
	
}
