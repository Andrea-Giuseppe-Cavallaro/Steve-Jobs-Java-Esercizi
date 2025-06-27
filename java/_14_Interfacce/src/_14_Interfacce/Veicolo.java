package _14_Interfacce;

public abstract class Veicolo {
	private int batteria;
	
	public Veicolo(int batteria) {
		this.batteria = batteria;
	}
	
	public int getBatteria() {
		return batteria;
	}
	
	public void setBatteria(int batteria) {
		this.batteria = batteria;
	}
}
