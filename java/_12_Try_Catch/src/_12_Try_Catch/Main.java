package _12_Try_Catch;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci due numeri interi: ");
		int a = tastiera.nextInt();
		int b = tastiera.nextInt();
		
		/*
		int c = a/b;
		System.out.println(c);
		*/
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch(Exception e) {
			System.out.println("Impossibile dividere per 0");
		} finally {
			tastiera.close();
		}
	}
}
