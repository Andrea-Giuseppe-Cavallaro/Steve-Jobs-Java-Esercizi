package _10_Overloading;

public class Calcolatrice {
	public int somma(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public int somma(int numero1, int numero2, int numero3) {
		return numero1 + numero2 + numero3;
	}

	public double somma(double numero1, double numero2) {
		return numero1 + numero2;
	}

	public String somma(String stringa1, String stringa2) {
		return stringa1.concat(stringa2);
	}
}
