package _15_Coda;

public class Main {
	
	public static void main(String args[]) {
		//Creazione oggetto Posta
		Posta Motta = new Posta();
		
		//Creazione oggetto Persona
		Persona Madda = new Persona("Madda");
		Persona Pietro = new Persona("Pietrooooò");
		Persona Andrea = new Persona("Andrea");
		
		//Inserimento persone in coda
		Motta.entraInCoda(Madda);
		Motta.entraInCoda(Pietro);
		Motta.entraInCoda(Andrea);
		
		//Stampa coda
		Motta.mostraCoda();
		
		//Mostra la persona in cima alla coda
		Motta.chiEIlProssimo();
		
		//Rimuove dalla cima della coda
		Motta.servireProssimo();
		Motta.servireProssimo();
		
		//Stampa coda
		System.out.print("Rimane nella coda ");
		Motta.mostraCoda();
	}
}
