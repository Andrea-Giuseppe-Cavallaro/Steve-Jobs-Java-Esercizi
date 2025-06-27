package _14_Interfacce;

public class Main {

	public static void main(String[] args) {
		Auto_Ibrida macchina1 = new Auto_Ibrida(50);
		System.out.println("Carica batteria: " + macchina1.getBatteria() + "%");
		
		macchina1.ricarica();
		System.out.println("Carica batteria: " + macchina1.getBatteria() + "%");
		
		System.out.println("Stato dispositivo: " + macchina1.isConnesso());
		macchina1.connetti();
		System.out.println("Stato dispositivo: " + macchina1.isConnesso());
		macchina1.disconnetti();
		System.out.println("Stato dispositivo: " + macchina1.isConnesso());

	}

}
