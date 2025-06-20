package _08_Animali;

import java.util.ArrayList;

public class Rifugio {
	private ArrayList<Animale> animali;
	
	public Rifugio() {
	    animali = new ArrayList<>();
	}
	
	public void aggiungiAnimale(Animale animale) {
		animali.add(animale);
	}
	
	public void stampaVersi() {
		for(Animale animale : animali) {
			animale.stampaNome();
			animale.emettiVerso();
		}
	}
}
