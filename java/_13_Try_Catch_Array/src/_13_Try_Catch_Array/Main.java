package _13_Try_Catch_Array;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String array[] = {"Andrea", "Giuseppe", "Jessica", "Lorenzo"};
		
		System.out.print("Inserisci l'indice che vuoi controllare: ");
		Scanner input = new Scanner(System.in);
		int indice = input.nextInt();
		
		/*
		String nome = array[indice];
		System.out.println(nome);
		input.close();
		*/
		
		try {
			String nome = array[indice];
			System.out.println(nome);
		} catch (Exception e) {
			System.out.println("Non esiste l'indice inserito");
		} finally {
			input.close();
		}
	}
}
