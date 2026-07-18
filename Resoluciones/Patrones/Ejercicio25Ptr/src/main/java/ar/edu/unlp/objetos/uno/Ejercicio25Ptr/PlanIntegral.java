package ar.edu.unlp.objetos.uno.Ejercicio25Ptr;


public class PlanIntegral extends PlanMedico{
	
	private static final double CARGO_INTEGRANTE_FAMILIAR = 3000;
	private static final double DESCUENTO_ANTIGUEDAD = 10000;
	private static final double MONTO_FIJO = 22000;

	
	public PlanIntegral() {
		super();
	}
	
	
	public double calcularCargoFamiliar(Afiliado a) {
		return (a.getFamiliaresACargo() * CARGO_INTEGRANTE_FAMILIAR) + a.getSalario() * 0.1;
	}
	
	public double getMontoFijo(ICoseguro c) {
		return MONTO_FIJO;
	}
	
	public double adicionalCobertura(Afiliado a) {
		double salario = a.getSalario() * 0.03;
		double antig = a.getCoseguro().getAntiguedad() * DESCUENTO_ANTIGUEDAD;
		return (salario - antig > 0)? salario - antig : 0;		
	}
	
	public double seguroInternacion() {
		return MONTO_FIJO* 0.05;
	}

	
	
	
	
	

}
