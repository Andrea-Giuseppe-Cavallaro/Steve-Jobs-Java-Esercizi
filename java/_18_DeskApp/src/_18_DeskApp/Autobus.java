package _18_DeskApp;

import java.util.ArrayList;

public class Autobus {
    private ArrayList<Passeggero> passeggeri;
    private ArrayList<Autista> autisti;
    private int countPasseggeri;
    private int countAutisti;

    public Autobus() {
        this.countPasseggeri = 2;
        this.countAutisti = 2;
        passeggeri = new ArrayList<>();
        autisti = new ArrayList<>();
    }
    
    public ArrayList<Passeggero> getPasseggeri() {
		return passeggeri;
	}

	public void setPasseggeri(ArrayList<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}

	public ArrayList<Autista> getAutisti() {
		return autisti;
	}

	public void setAutisti(ArrayList<Autista> autisti) {
		this.autisti = autisti;
	}

	public void aggiungiPasseggero(Passeggero p) throws Posti_esauriti_passeggero_exception {
        if (passeggeri.size() >= countPasseggeri) {
            throw new Posti_esauriti_passeggero_exception("Posti per passeggeri esauriti.");
        }
        passeggeri.add(p);
    }

    public void aggiungiAutista(Autista a) throws Posti_esauriti_autista_exception {
        if (autisti.size() >= countAutisti) {
            throw new Posti_esauriti_autista_exception("Posti per autisti esauriti.");
        }
        autisti.add(a);
    }

    public void stampaPasseggeri() {
        System.out.println("Lista passeggeri:");
        for (Passeggero p : passeggeri) {
            System.out.println(p);
        }
    }

    public void stampaAutisti() {
        System.out.println("Lista autisti:");
        for (Autista a : autisti) {
            System.out.println(a);
        }
    }
}
