package _16_Pila;

public class Main {

	public static void main(String[] args) {
		//Istanziamento oggetto Browser
		Browser Edge = new Browser();
		
		//Aggiunta pagine alla pila
		Edge.visitPage("www.google-chrome.com");
		Edge.visitPage("www.uninstal-Edge.com");
		Edge.visitPage("www.explode-Edge.com");
		
		
		//Pagina precedente
		Edge.prevPage();
		
		//Stampa pila
		Edge.stampaCronologia();
		
		//Rimozione pagine dalla pila
		Edge.goBack();
		Edge.goBack();
		Edge.goBack();
		Edge.goBack();
		
	}

}
