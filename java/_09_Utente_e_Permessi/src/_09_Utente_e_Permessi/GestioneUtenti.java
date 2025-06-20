package _09_Utente_e_Permessi;

import java.util.ArrayList;

public class GestioneUtenti {
	private ArrayList<Utente> utenti;
	
	public GestioneUtenti(){
		utenti = new ArrayList<>();
	}
	
	public GestioneUtenti aggiungiUtente(Utente u) {
		utenti.add(u);
		return this;
	}
	
	public void stampaPermessi() {
		for(Utente u : utenti) {
			u.stampaInfo();
			System.out.println("Permessi: " + u.getPermessi() + "\n");
		}
	}
}
