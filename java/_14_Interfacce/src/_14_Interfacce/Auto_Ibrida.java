package _14_Interfacce;

public class Auto_Ibrida extends Veicolo implements Connettività, Ricaricabile{
	private boolean connesso;
	
	public Auto_Ibrida(int batteria) {
		super(batteria);
		this.connesso = false;
	}

	@Override
	public void ricarica() {
		setBatteria(100);
	}

	@Override
	public void connetti() {
		System.out.println("Dispositivo Connesso");
		this.connesso = true;
	}

	@Override
	public void disconnetti() {
		System.out.println("Dispositivo Disconnesso");
		this.connesso = false;
	}

	@Override
	public boolean isConnesso() {
		return this.connesso;
	}
	
	
	
}
