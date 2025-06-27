package _05_ParcoMezzi;

public class Mezzi {
	String modello;
	String colore;
	int velocitàMax;
	public Mezzi(String modello, String colore, int velocitàMax) {
		this.modello = modello;
		this.colore = colore;
		this.velocitàMax = velocitàMax;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public int getVelocitàMax() {
		return velocitàMax;
	}
	public void setVelocitàMax(int velocitàMax) {
		this.velocitàMax = velocitàMax;
	}
	@Override
	public String toString() {
		return "Mezzi [modello = " + modello + ", colore = " + colore + ", velocitàMax = " + velocitàMax + "]";
	}
}
