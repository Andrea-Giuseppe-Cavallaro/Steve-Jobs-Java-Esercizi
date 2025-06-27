package _10_Overloading;

public class Main {

	public static void main(String[] args) {
		Calcolatrice calcolatrice = new Calcolatrice();
		int int1 = 10, int2 = 5, int3 = 15;
		double double1 = 3.5, double2 = 6.5;
		String stringa1 = "Ciao", stringa2 = " Mondo";
		
		System.out.println("Numero:" + int1 + " Numero:" + int2 + " = " + calcolatrice.somma(int1, int2));
		System.out.println("Numero:" + int1 + " Numero:" + int2 + " Numero:" + int3 + " = " + calcolatrice.somma(int1, int2, int3));
		System.out.println("Numero:" + double1 + " Numero:" + double2 + " = " + calcolatrice.somma(double1, double2));
		System.out.println("Stringa:" + stringa1 + " Stringa:" + stringa2 + " = " + calcolatrice.somma(stringa1, stringa2));
	}
}
