package ar.edu.unlp.objetos.uno.Ejercicio8;

import java.util.List;

public class Document {
	List<String> words;
	
	
	public long characterCount() {
	 	long count = this.cantidadCaracteres();
	    	return count;
		}
	
	
	 public long calculateAvg() {
		 long avgLength = this.cantidadCaracteres() / this.words.size();
	 	return avgLength;
		}
	 
	 
	    
	 public long cantidadCaracteres() {
		 return this.words.stream().mapToLong(w -> w.length()).sum();
	 }
	    
	    
	    
	}

	
	
	
	
	
	
	
	
	
	
	

