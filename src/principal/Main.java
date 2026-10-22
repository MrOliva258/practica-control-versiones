package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String texto;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("pon un nombre");
		texto=sc.nextLine();
		System.out.println("Hola Buen dia: " +texto);
		sc.close();
	}

}
