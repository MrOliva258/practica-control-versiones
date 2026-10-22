package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String texto;
		int edad;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("pon un nombre");
		texto=sc.nextLine();
		System.out.println("Hola Buen dia: " +texto);
		System.out.println("que edad tienes");
		edad=sc.nextInt();
		System.out.println("tienes" + edad);
		sc.close();
	}

}
