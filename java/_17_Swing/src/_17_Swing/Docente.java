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
    public String toString() {
        return getNome() + " " + getCognome() + " - Materia: " + materia;
    }
}
