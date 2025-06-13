package _04_Ereditarietà;

public class Student extends Person {
	int id;
	int course;
	float avg;
	
	public Student(String name, String surname, int age, String city, int id, int course, float avg) {
		super(name, surname, age, city);
		this.id = id;
		this.course = course;
		this.avg = avg;
	}
	
	int getId() {return id;}
	int getCourse() {return course;}
	float getAvg() {return avg;}
}