package ar.edu.unlp.objetos.uno.Ejercicio6PtrV2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuilderVegano bv = new BuilderVegano();
		BuilderVegetariano bvg = new BuilderVegetariano();
		BuilderSinTACC bst = new BuilderSinTACC();
		BuilderClasico bc = new BuilderClasico();
		Director d = new Director(bc);
		Sandwich s = d.construir();	
		
		
		System.out.println("Sandwich Clásico, resultado esperado: 500");
		System.out.println();
		System.out.println(s.calcularValor());
	}

	
}
