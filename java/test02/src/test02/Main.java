package test02;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Studente("Mario", "Rossi", "1005");
		Persona persona2 = new Professore("Luca", "Bianchi", "Informatica");
		Persona persona3 = new Persona("Sara", "Neri");
		
		Persona array[] = {persona1, persona2, persona3};
		for(int i = 0; i < array.length; i++) {
			array[i].presentati();
		}
	}
	
}
