package test02;

public class Professore extends Persona{
	private String materia;
	
	public Professore(String nome, String cognome, String materia) {
		super(nome, cognome);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public void presentati() {
		System.out.println("Ciao, sono " + getNome() + " " + getCognome() + ", insegno: " + materia);
	}
}
