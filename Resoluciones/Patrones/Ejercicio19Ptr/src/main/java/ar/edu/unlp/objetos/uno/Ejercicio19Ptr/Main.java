package ar.edu.unlp.objetos.uno.Ejercicio19Ptr;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 FileOO2 file = new FileOO2("archivo", ".pdf", 100, LocalDate.of(2026,4,10), LocalDate.now(), "rwx");
		 //FIRST DECORATOR 
		 Decorator extensionDecorator = new ExtensionDecorator(file);
		 
		System.out.println(extensionDecorator.prettyPrint());
		System.out.println();
		
		//SECOND 
		Decorator fechaDecorador = new ExtensionDecorator(new FechaCreacionDecorator(file));
		System.out.println(fechaDecorador.prettyPrint() + "Segundo print");
		System.out.println();
				//SI SE DEBE RESPETAR EL ORDEN QUE INDICA EL ENUNCIADO. CONFIRMADO.
		
		
		
		Decorator thirdDecorator = new ExtensionDecorator(new PermisoDecorator(new TamDecorator((file))));
		System.out.println(thirdDecorator.prettyPrint() +  "Tercer print corregido");
		
		
		
		
		
		
		
		
		
		

	}

}
