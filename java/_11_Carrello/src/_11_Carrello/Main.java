package _11_Carrello;

public class Main {
	public static void main(String args[]) {
		Carrello carrello = new Carrello();
		carrello.aggiungiProdotto("Prodotto singolo");
		carrello.aggiungiProdotto("Prodotto doppio", "2");
		carrello.aggiungiProdotto("Prodotto adfa");
		carrello.aggiungiProdotto("Prodotto doppio", "5");
		carrello.aggiungiProdotto("Prodotto singasdsadao");
		carrello.aggiungiProdotto("Prodotto doppio", "8");
		carrello.aggiungiProdotto("Prodotto ssdfdsd");

		carrello.stampaProdotti();
	}
}
