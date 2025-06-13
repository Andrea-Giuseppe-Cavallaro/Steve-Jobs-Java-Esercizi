package _03_Creazione_Classe;

public class Main {
	public static void main(String[] args) {
	Persona p1 = new Persona("Andrea", "Cavallaro", 36, "Ciao");
	
	System.out.println(p1.name + " " + p1.surname + " " + p1.age + " " + p1.password);
	
	p1.password = "Mondo"; 
	
	System.out.println(p1.name + " " + p1.surname + " " + p1.age + " " + p1.password);

	//System.out.println(p1.getName() + " " + p1.getSurname() + " " + p1.getAge());
	//p1.password;
	//p1.print(p1);
	}
}
