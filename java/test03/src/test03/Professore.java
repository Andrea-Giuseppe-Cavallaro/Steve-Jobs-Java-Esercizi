package test03;

public class Professore extends Utente implements Autenticabile{
	private String materia;
	
	public Professore(String username, String email, String materia) {
		super(username, email);
		this.materia = materia;
	}
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void autentica(String password) throws AutenticazioneException {
        if (!password.equals("prof2024")) {
            throw new AutenticazioneException("Password errata per Professore");
        }
        System.out.println("Professore autenticato con successo!");
    }

	@Override
	public void presentati() {
		System.out.println("Professore: " + getUsername() + ", Insegna: " + materia);
	}
}
