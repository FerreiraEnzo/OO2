package ar.edu.unlp.objetos.uno.Ejercicio25Ptr;

public class PlanPremium extends PlanMedico{
	
	private static final double MONTO_FIJO = 33000;
	private static final double CARGO_FAMILIAR = 2800;
	
	public PlanPremium() {
		super();
	}
	
	public double calcularMontoFijo(ICoseguro c) {
		return this.MONTO_FIJO - c.getDescuento();
	}
	
	public double getMontoFijo(ICoseguro c) {
		return MONTO_FIJO - c.getDescuento();
	}
	
	
	public double calcularCargoFamiliar(Afiliado a) {
		return a.getFamiliaresACargo() > 4 ? (a.getFamiliaresACargo() - 4) * CARGO_FAMILIAR : 0;
	}

	public double adicionalCobertura(Afiliado a) {
		return (a.getSalario() * 0.1) - a.getCoseguro().getMontoCoberturaViaje();
	}
	
	public double seguroInternacion() {
		return MONTO_FIJO * 0.05;
		
	}

}
