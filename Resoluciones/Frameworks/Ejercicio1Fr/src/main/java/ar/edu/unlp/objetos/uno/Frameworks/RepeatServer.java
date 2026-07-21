package ar.edu.unlp.objetos.uno.Frameworks;

import java.io.PrintWriter;
import java.util.StringJoiner;

public class RepeatServer extends SingleThreadTCPServer{
	

	public static void main(String[] args) {
		new RepeatServer().startLoop(args);
	}
	
	public void handleMessage(String message, PrintWriter out) {
		
		String[] args = message.split(" ");
		String str = args[0];
		
		if(args.length < 2) {
			out.println("Error: se requiere al menos dos argumentos");
			return;
		}
		
		if(str.isEmpty()) {
			out.println("Error: el argumento no puede estar vacio");
			return;
		}
		
		int repeticiones;
		try {
			repeticiones = Integer.parseInt(args[1]);
			if(repeticiones <= 0) {
				out.println("Error: El numero de repeticiones debe ser mayor que 0");
				return;
			}
		}catch(NumberFormatException e) {
			out.println("Error: el segundo elemento debe ser un numero entero válido");
			return;
		}
		
		String separador = (args.length ==3) ? args[2] : "";
		
		//Genera la respuesta repitiendo el string con el separador
		StringJoiner joiner = new StringJoiner(separador);
		for(int i=0; i< repeticiones; i++) {
			joiner.add(str);
		}
		
		out.println(joiner.toString());
		
	}
	
	
	

	
	
	
	
}
