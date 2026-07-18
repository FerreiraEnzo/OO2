package ar.edu.unlp.objetos.uno.Ejercicio25Ptr;

import java.time.LocalDate;
import java.util.List;


public class Afiliado {
	private String nombre;
	private int familiaresACargo;
	private double salario;
	private LocalDate fechaNacimiento;
	private List<PlanMedico> previos;
	private PlanMedico plan;
	private ICoseguro coseguro;
	
	
	public Afiliado(String n, int cant, double salario, LocalDate fecha) {
		this.nombre = n;
		this.familiaresACargo = cant;
		this.salario = salario;
		this.fechaNacimiento = fecha;
	}
	
	
	public double calcularMonto() {
		return this.plan.calcularMontoMensual(this);
	}
	
	
	public void setPlanMedico(PlanMedico plan) {
		this.plan = plan;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public ICoseguro getCoseguro() {
		return this.coseguro;
	}
	
	public int getFamiliaresACargo() {
		return this.familiaresACargo;
	}
	
	

}
