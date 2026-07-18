package ar.edu.unlp.objetos.uno.Ejercicio23Ptr;

import java.time.LocalDate;

public class NullObject implements IMamifero{
	
	
	public NullObject() {
		super();
	}
	
	public String getIdentificador() {
		return "";
	}
	
	public String getEspecie() {
		return "";
	}
	
	public LocalDate getFechaNacimiento() {
		return null;
	}
	
	public IMamifero getPadre() {
		return this;
	}
	
	public IMamifero getMadre() {
		return this;
	}
	
	public IMamifero getAbuelaMaterna() {
		return this;
	}
	
	public IMamifero getAbueloPaterno() {
		return this;
	}
	
	public IMamifero getAbuelaPaterna() {
		return this;
	}
	
	public IMamifero getAbueloMaterno() {
		return this;
	}
	
	public void setIdentificador(String id) {
	}
	
	public void setEspecie(String e) {
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
	}
	
	public void setPadre(IMamifero padre) {
	}
	
	public void setMadre(IMamifero madre) {
	}
	
	public boolean tieneComoAncestroA(IMamifero unMamifero) {
		return false;
	}
	
	
	
}
