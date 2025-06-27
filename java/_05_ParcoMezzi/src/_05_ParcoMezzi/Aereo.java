package _05_ParcoMezzi;

public class Aereo extends Mezzi{
	float altitudineMax;

	public Aereo(String modello, String colore, int velocitàMax, float altitudineMax) {
		super(modello, colore, velocitàMax);
		this.altitudineMax = altitudineMax;
	}

	public float getAltitudineMax() {
		return altitudineMax;
	}

	public void setAltitudineMax(float altitudineMax) {
		this.altitudineMax = altitudineMax;
	}

	@Override
	public String toString() {
		return "\nAereo:\n[modello = " + modello + "\ncolore = " + colore
				+ "\nvelocitàMax = " + velocitàMax + "\naltitudineMax = " + altitudineMax + "]";
	}
}
