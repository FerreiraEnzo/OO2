package ar.edu.unlp.objetos.uno.Ejercicio17Ptr;

public class Adapter4GConnection implements Connection{
	private Connection4G connection4G;
	
	public Adapter4GConnection(Connection4G c) {
		this.connection4G = c;
	}
	
	
	public String sendData(String data, long crc) {
		return this.connection4G.transmit(data, crc);
	}
	
	public String pict() {
		return this.connection4G.getSymb();
	}
	
	
	
	
	
}
