package ar.edu.unlp.objetos.uno.Ejercicio12Ptr;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PoliticaFlexible p1 = new PoliticaFlexible();
		AutoEnAlquiler a1 = new AutoEnAlquiler(100, 4, "Ford", p1);
		Usuario usu1 = new Usuario("Marcos");
		usu1.agregarAuto(a1);
		Reserva r1 = new Reserva(5, LocalDate.now(), a1, usu1);
		
		
		PoliticaModerada p2 = new PoliticaModerada();
		a1.setStrategy(p2);
		

	}

}
