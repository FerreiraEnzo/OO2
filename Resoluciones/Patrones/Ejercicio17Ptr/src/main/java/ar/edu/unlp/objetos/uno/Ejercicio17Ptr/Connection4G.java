package ar.edu.unlp.objetos.uno.Ejercicio17Ptr;

public class Connection4G {
	private String symb;
	
	
	
	
	public Connection4G() {
		this.symb = "4G";
	}
	
	public String transmit(String data, long crc) {
		return "4G: " + data + crc;
	}
	
	public String getSymb() {
		return this.symb;
	}
	
	
	

}
