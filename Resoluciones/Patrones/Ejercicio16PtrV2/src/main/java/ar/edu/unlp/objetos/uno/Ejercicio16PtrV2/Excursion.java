package ar.edu.unlp.objetos.uno.Ejercicio16PtrV2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private int cupoMinimo;
	private int cupoMaximo;
	private State estado;
	private List<Usuario> inscriptos;
	private List<Usuario> listaEspera;
	private double costo;
	
	
	public Excursion(String n, LocalDate fi, LocalDate ff, String pe, int cupoMin, int cupoMax,double c) {
		this.nombre = n;
		this.fechaInicio = fi;
		this.fechaFin = ff;
		this.puntoEncuentro = pe;
		this.cupoMinimo = cupoMin;
		this.cupoMaximo = cupoMax;
		this.listaEspera = new LinkedList<Usuario>();
		this.inscriptos = new LinkedList<Usuario>();
		this.estado = new Provisoria();
		this.costo = c;
	}
	
	
	public void agregarInscripto(Usuario u) {
		this.estado = estado.agregar(this, u);
	}
	
	public int getCupoMinimo() {
		return this.cupoMinimo;
	}
	
	public int getCupoMaximo() {
		return this.cupoMaximo;
	}
	
	public int getCupoActual() {
		return this.inscriptos.size();
	}
	
	public void inscribirUsuarioNormal(Usuario u) {
		this.inscriptos.add(u);
	}
	
	public void inscribirListEspera(Usuario u) {
		this.listaEspera.add(u);
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + "Costo: " + this.costo + "Fecha inicio: " + this.fechaInicio + 
				"Fecha fin: " + this.fechaFin + "Punto de encuentro: " + this.puntoEncuentro;
	}
	
	public List<Usuario> getInscriptos() {
		return this.inscriptos;
	}
	
	public String obtenerInformacion() {
		return this.estado.informacion(this);
	}

}
