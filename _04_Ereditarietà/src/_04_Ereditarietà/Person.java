package _04_Ereditarietà;

public class Person {
	String name;
	String surname;
	int age;
	String city;
	
	public Person(String name, String surname, int age, String city) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.city = city;
	}
	
	String getName() {return name;}
	String getSurname() {return surname;}
	int getAge() {return age;}
	String getCity() {return city;}
	
	void setName(String name) {this.name = name;}
}