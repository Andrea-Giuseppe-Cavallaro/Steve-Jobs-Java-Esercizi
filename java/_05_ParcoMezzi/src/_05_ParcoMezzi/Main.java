package _05_ParcoMezzi;

public class Main {

	public static void main(String[] args) {
		Macchina m1 = new Macchina("Toyota", "Blu", 210, 5);
		Autobus b1 = new Autobus("Mercedes-Benz", "Giallo", 160, 60);
		Aereo a1 = new Aereo("Rayanair", "Bianco", 1100, 1200.50f);
		System.out.println(m1.toString() + "\n" + b1.toString() + "\n" + a1.toString());
	}

}
