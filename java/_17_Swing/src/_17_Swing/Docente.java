package _17_Swing;

public class Docente extends Persona {
	private String materia;
	
	public Docente(String nome, String cognome, String materia) {
		super(nome, cognome);
		this.setMateria(materia);
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void stampa() {
		System.out.println("Nome: " + getNome() + "\nCognome: " + getCognome() + "\nMateria: " + materia);
	}
}
