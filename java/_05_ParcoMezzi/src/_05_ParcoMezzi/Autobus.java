package _05_ParcoMezzi;

public class Autobus extends Mezzi{
	int capienzaMax;

	public Autobus(String modello, String colore, int velocitàMax, int capienzaMax) {
		super(modello, colore, velocitàMax);
		this.capienzaMax = capienzaMax;
	}

	public int getCapienzaMax() {
		return capienzaMax;
	}

	public void setCapienzaMax(int capienzaMax) {
		this.capienzaMax = capienzaMax;
	}

	@Override
	public String toString() {
		return "\nAutobus:\n[modello = " + modello + "\ncolore = " + colore + "\nvelocitàMax = "
				+ velocitàMax + "\ncapienzaMax = " + capienzaMax + "]";
	}
}
