package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String texto;
		System.out.println("introduce un texto");
		texto=sc.nextLine();
		System.out.println("el etxto que introdujiste es "+texto);
		sc.close();
	}

}
