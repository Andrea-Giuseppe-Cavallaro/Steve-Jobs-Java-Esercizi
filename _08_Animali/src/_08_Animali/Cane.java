package _08_Animali;

public class Cane extends Animale{
	public Cane(String nome) {
		super(nome);
	}

	@Override
	public void emettiVerso() {
		System.out.println("bau!");
	}
	
	@Override
	public void stampaNome() {
		System.out.print("Sono una cane e mi chiamo " + getNome() + "...");
	}

}
