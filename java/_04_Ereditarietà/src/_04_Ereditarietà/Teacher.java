package _04_Ereditarietà;

public class Teacher extends Person {
	String teaching;
	
	public Teacher(String name, String surname, int age, String city, String teaching) {
		super(name, surname, age, city);
		this.teaching = teaching;
	}
	
	String getTeaching() {return teaching;}
}
