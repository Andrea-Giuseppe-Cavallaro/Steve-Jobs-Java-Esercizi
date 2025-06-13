package _01_Calcolatrice;
import java.util.Scanner;

public class Calcolatrice {
	public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        float num1, num2;
		
        System.out.print("Inserisci il primo numero: ");
        num1 = tastiera.nextFloat();
        
        System.out.println();
        
        System.out.print("Inserisci il secondo numero: ");
        num2 = tastiera.nextFloat();
        
        System.out.println();
        
        tastiera.close();
        
        float somma, differenza, moltiplicazione, divisione;
        somma = somma(num1, num2);
        System.out.println("La Somma è :" + somma);
        
        differenza = differenza(num1, num2);
        System.out.println("La Differenza è :" + differenza);
        
        moltiplicazione = moltiplicazione(num1, num2);
        System.out.println("La Moltiplicazione è :" + moltiplicazione);
        
        divisione = divisione(num1, num2);
        System.out.println("La Divisione è :" + divisione);
    
	}
	
	public static float somma(float num1, float num2){
		return num1 + num2;
	}
	
	public static float differenza(float num1, float num2) {
		return num1 - num2;
	}
	
	public static float moltiplicazione(float num1, float num2) {
		return num1 * num2;
	}
	
	public static float divisione(float num1, float num2) {
		if(num2 == 0) {
			System.out.println("Non si può dividere per 0");
			return 0;
		}
		return num1 / num2;
	}

}