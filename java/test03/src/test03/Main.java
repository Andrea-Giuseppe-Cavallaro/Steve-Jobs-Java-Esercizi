package test03;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Utente> utenti= new ArrayList<Utente>();
		
		utenti.add(new Studente("Mario", "Mario@Rossi", "1234"));
		utenti.add(new Professore("Luca", "Luca@Bianchi", "Informatica"));
		utenti.add(new Segreteria("Sara", "Neri", "210"));
		
		for (Utente utente : utenti) {
			
            utente.presentati();
            
            //Cast e throw cercato online
            if (utente instanceof Autenticabile) {
                try {
                    ((Autenticabile) utente).autentica("prof2024");
                } catch (AutenticazioneException e) {
                    System.out.println("Errore di autenticazione: " + e.getMessage());
                }
            } else {
                System.out.println("La segreteria non ha password");
            }
        }
    }
}
