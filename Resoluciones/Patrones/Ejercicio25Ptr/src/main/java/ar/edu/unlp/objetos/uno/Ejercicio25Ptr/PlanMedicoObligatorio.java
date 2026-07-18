package ar.edu.unlp.objetos.uno.Ejercicio25Ptr;

public class PlanMedicoObligatorio extends PlanMedico{

	private static final double CARGO_FAMILIAR = 3500;
	private static final double MONTO_FIJO = 15000;
	
	public PlanMedicoObligatorio() {
		super();
	}
	
	public double calcularCargoFamiliar(Afiliado a) {
		return (a.getFamiliaresACargo() - a.getCoseguro().getDescuento()) * CARGO_FAMILIAR;
	}
	
	public double getMontoFijo(ICoseguro c) {
		return MONTO_FIJO;
	}
	
	public double adicionalCobertura(Afiliado a) {
		return (a.getSalario() * 0.01) - a.getCoseguro().getMontoCoberturaViaje();
	}
	
	public double seguroInternacion() {
		return 0;
	}

	
}
