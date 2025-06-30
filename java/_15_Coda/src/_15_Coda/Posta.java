package _15_Coda;

import java.util.LinkedList;
import java.util.Queue;

public class Posta {
	private Queue<Persona> coda;
	
	public Posta() {
		coda = new LinkedList<Persona>();
	}
	
	public void entraInCoda(Persona oggetto) {
		coda.add(oggetto);
		System.out.println(oggetto.getNome() + " si mette in coda");
	}
	
	public void chiEIlProssimo() {
		System.out.println(coda.peek().getNome() + " è in testa alla coda");
		coda.peek();
	}
	
	public void servireProssimo() {
		System.out.println(coda.poll().getNome() + " è stato servito");
	}
	
	public void mostraCoda() {
		for(Persona oggetto : coda) {
			System.out.println(oggetto.getNome());
		}
	}
}
