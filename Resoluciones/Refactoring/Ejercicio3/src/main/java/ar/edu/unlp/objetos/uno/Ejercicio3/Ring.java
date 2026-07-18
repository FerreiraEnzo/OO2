package ar.edu.unlp.objetos.uno.Ejercicio3;

public abstract class Ring {
	protected int idx;
	
	public Ring() {
		idx=0;
	}
	
	public int getIdx() {
		return this.idx;
	}
	
	
	protected int chequearLongitudYAvanzar(int length) {
		if (idx >= length) 
			idx = 0;
		return idx++;
	}
	
	
	
	
	
	
	

}
