package test03;

public class Studente extends Utente implements Autenticabile{
	private String matricola;
	
	public Studente(String username, String email, String matricola) {
		super(username, email);
		this.matricola = matricola;
	}
	
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	@Override
	public void autentica(String password) throws AutenticazioneException{
		 if (!password.equals("studente123")) {
	            throw new AutenticazioneException("Password errata per Studente");
	     }
		 System.out.println("Studente autenticato con successo!");
	}
	
	@Override
	public void presentati() {
		System.out.println("Studente: " + getUsername() + ", Matricola: " + matricola);
	}

}
