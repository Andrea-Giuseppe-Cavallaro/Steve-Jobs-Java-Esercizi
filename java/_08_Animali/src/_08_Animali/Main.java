package _08_Animali;

public class Main {

	public static void main(String[] args) {
		Rifugio rifugio = new Rifugio();
	
		Animale cane = new Cane("Fido");
		Animale gatto = new Gatto("Lucifero");
		Animale gatto2 = new Gatto("Pucci");
		
		rifugio.aggiungiAnimale(cane);
		rifugio.aggiungiAnimale(gatto);
		rifugio.aggiungiAnimale(gatto2);
		
		rifugio.stampaVersi();
	}

}
