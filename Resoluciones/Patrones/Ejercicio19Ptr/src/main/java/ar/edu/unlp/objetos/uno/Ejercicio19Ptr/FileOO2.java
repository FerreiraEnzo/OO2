package ar.edu.unlp.objetos.uno.Ejercicio19Ptr;

import java.time.LocalDate;

public class FileOO2 implements lFile{
	private String nombre;
	private String extension;
	private int tamaño;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	
	public FileOO2(String n, String e, int t, LocalDate fecha1, LocalDate fecha2, String p) {
		this.nombre = n;
		this.extension = e;
		this.tamaño = t;
		this.fechaCreacion = fecha1;
		this.fechaModificacion = fecha2;
		this.permisos = p;
	}

	public String prettyPrint() {
		return this.nombre;
	}

	public String getNombre() {
		return nombre;
	}


	public String getExtension() {
		return extension;
	}


	public int getTamaño() {
		return tamaño;
	}


	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}


	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public String getPermisos() {
		return permisos;
	}

	




	
	
	
	
	
	
	

}
