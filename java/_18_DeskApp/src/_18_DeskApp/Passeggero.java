package _18_DeskApp;

public class Passeggero extends Persona implements Utente_Autobus{
	private String destinazione;
	private Boolean bagaglio;
	
	public Passeggero(String destinazione, Boolean bagaglio, String nome, String cognome, String CF) {
		super(nome, cognome, CF);
		this.destinazione = destinazione;
		this.bagaglio = bagaglio;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public Boolean getBagaglio() {
		return bagaglio;
	}

	public void setBagaglio(Boolean bagaglio) {
		this.bagaglio = bagaglio;
	}

	@Override
	public Passeggero get_tipo() {
		return this;
	}

	@Override
	public String toString() {
		return "Passeggero [Nome = " + getNome() + ", Cognome = " + getCognome() + ", Codice Fiscale = " + getCodiceFiscale() + 
				", Destinazione = " + destinazione + ", Bagaglio = " + bagaglio + "]";
	}
}
