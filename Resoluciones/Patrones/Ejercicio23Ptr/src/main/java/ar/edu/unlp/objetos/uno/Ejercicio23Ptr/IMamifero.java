package ar.edu.unlp.objetos.uno.Ejercicio23Ptr;

import java.time.LocalDate;

public interface IMamifero {
	
	
	public boolean tieneComoAncestroA(IMamifero unMamifero);	
	
	public IMamifero getAbueloMaterno();
	
	public IMamifero getAbuelaMaterna();
	
	public IMamifero getAbueloPaterno();
	
	public IMamifero getAbuelaPaterna();
	
	
	public String getIdentificador();
	
	public void setIdentificador(String identificador);
	
	public String getEspecie();
	
	
	public void setEspecie(String especie);
	
	public LocalDate getFechaNacimiento();
	
	public void setFechaNacimiento(LocalDate fechaNacimiento);
	
	public IMamifero getPadre();
	
	public void setPadre(IMamifero padre);
	
	public IMamifero getMadre();
	
	public void setMadre(IMamifero madre);
	
	
	
	
	
	
	
	
	
	
	
	

}
