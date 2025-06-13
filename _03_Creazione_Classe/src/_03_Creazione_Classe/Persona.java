package _03_Creazione_Classe;

public class Persona {
	public String name;
	public String surname;
	public int age;
	public String password;
	
	public Persona(String Name, String Surname, int Age, String Password) {
		this.name = Name;
		this.surname = Surname;
		this.age = Age;
		this.password = Password;
	}
	
	void print() {
		System.out.println(getName() + " " + getSurname() + " " + getAge());
	}
	
	String getName() {
		return name;
	}
	
	String getSurname() {
		return surname;
	}
	
	int getAge() {
		return age;
	}
	
}
