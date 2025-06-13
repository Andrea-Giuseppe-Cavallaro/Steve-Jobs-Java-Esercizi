package _09_Utente_e_Permessi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome, email;
		
		System.out.println("Inserisci l'username e l'email del primo admin");
		nome = input.nextLine();
		email = input.nextLine();
		Utente U1 = new Admin(nome, email);
		
		System.out.println("Inserisci l'username e l'email del secondo admin");
		nome = input.nextLine();
		email = input.nextLine();
		Utente U2 = new Admin(nome, email);
		
		System.out.println("Inserisci l'username e l'email del primo cliente");
		nome = input.nextLine();
		email = input.nextLine();
		Utente U3 = new Cliente(nome, email);
		
		System.out.println("Inserisci l'username e l'email del secondo cliente");
		nome = input.nextLine();
		email = input.nextLine();
		Utente U4 = new Cliente(nome, email);
		
		GestioneUtenti utenti = new GestioneUtenti();
		utenti.aggiungiUtente(U1).aggiungiUtente(U2).aggiungiUtente(U3).aggiungiUtente(U4);
		utenti.stampaPermessi();
		
		input.close();
	}

}
