package _05_ParcoMezzi;

public class Macchina extends Mezzi {
	int numeroPorte;

	public Macchina(String modello, String colore, int velocitàMax, int numeroPorte) {
		super(modello, colore, velocitàMax);
		this.numeroPorte = numeroPorte;
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	@Override
	public String toString() {
		return "\nMacchina:\n[modello = " + modello + "\ncolore = " + colore + "\nvelocitàMax= "
				+ velocitàMax + "\nnumeroPorte = " + numeroPorte + "]";
	}
}
