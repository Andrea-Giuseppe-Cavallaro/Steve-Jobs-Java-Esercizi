package _08_Animali;

public class Gatto extends Animale{

	public Gatto(String nome) {
		super(nome);
	}

	@Override
	public void emettiVerso() {
		System.out.println("Miao!");
	}

	@Override
	public void stampaNome() {
		System.out.print("Sono una gatto e mi chiamo " + getNome() + "...");
	}
}
