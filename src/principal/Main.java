package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String texto;
		int edad;
		String mayor;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("pon un nombre");
		texto=sc.nextLine();
		System.out.println("Hola Buen dia: " +texto);
		System.out.println("que edad tienes");
		edad=sc.nextInt();
		mayor=(edad >=18)?" eres mayor de edad":" eres menor de edad";
		System.out.println("tienes: "+edad+mayor);
		System.out.println("gracias por usar el programa");
		
		
		
		sc.close();
	}

}