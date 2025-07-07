package _17_Swing;

public class Studente extends Persona{
	private String matricola;
	
	public Studente(String nome, String cognome, String matricola) {
		super(nome, cognome);
		this.setMatricola(matricola);
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	@Override
	public void stampa(){
			System.out.println("Nome: " + getNome() + "\nCognome: " + getCognome() + "\nMatricola: " + matricola);
		}		
}
