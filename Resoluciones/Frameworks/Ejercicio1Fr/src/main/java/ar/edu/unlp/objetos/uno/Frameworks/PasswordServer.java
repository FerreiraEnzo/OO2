package ar.edu.unlp.objetos.uno.Frameworks;

import java.io.PrintWriter;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class PasswordServer extends SingleThreadTCPServer{
	
	public static void main(String [] args) {
		new PasswordServer().startLoop(args);
	}
	
	public void handleMessage(String message, PrintWriter out) {
		
		String [] args = message.split(" ");
		if(args.length != 3) {
			System.exit(1);
		}
		out.println(this.generatePassword(args));
	}
	
	
	private String generatePassword(String[] args) {
		
		Random r = new Random();
		String letters = args[0];
		String numbers = args[1];
		String specialChars = args[2];
		
		StringBuilder password = new StringBuilder().append(specialChars.charAt(r.nextInt(specialChars.length())))
				.append(letters.charAt(r.nextInt(letters.length())))
				.append(numbers.charAt(r.nextInt(numbers.length())));
		
		//Lleno las 5 posiciones restantes
		String letrasYNumeros = letters + numbers;
		for(int i = 0; i < 5; i++) {
			password.append(letrasYNumeros.charAt(r.nextInt(letrasYNumeros.length())));
		}
		
		List<String> sortedPassword = Arrays.asList(password.toString().split(""));
		Collections.shuffle(sortedPassword);
		
		StringBuilder finalPassword = new StringBuilder();
		for (String c : sortedPassword) {
			finalPassword.append(c);
		}
		return finalPassword.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
