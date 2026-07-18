package ar.edu.unlp.objetos.uno.Ejercicio23Ptr;

import java.time.LocalDate;

public class Mamifero implements IMamifero{
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private IMamifero padre;
	private IMamifero madre;
	
	public Mamifero(String id, String e, LocalDate fecha) {
		this.identificador = id;
		this.especie = e;
		this.fechaNacimiento = fecha;
		this.inicializar();
	}
	
	public void inicializar() {
		this.padre = new NullObject();
		this.madre = new NullObject();
	}
	
	
	public boolean tieneComoAncestroA(IMamifero unMamifero) {
		return ((this.madre == unMamifero) || (this.padre == unMamifero)
				|| this.padre.tieneComoAncestroA(unMamifero)
				|| this.madre.tieneComoAncestroA(unMamifero));
	}
	
	public IMamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	public IMamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	public IMamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public IMamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public IMamifero getPadre() {
		return this.padre;
	}
	public void setPadre(IMamifero padre) {
		this.padre = padre;
	}
	public IMamifero getMadre() {
		return this.madre;
	}
	public void setMadre(IMamifero madre) {
		this.madre = madre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
