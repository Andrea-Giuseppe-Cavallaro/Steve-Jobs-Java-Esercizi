package _04_Ereditarietà;

public class Main {
	public static void main(String[] args) {
		Student s01 = new Student("Andrea", "Cavallaro", 36, "Catania", 01, 31, 7.6f);
		System.out.println(s01.getName() + " " + s01.getSurname() + " " + s01.getAge() + " " + s01.getCity() + " " + s01.getCourse());
	}
}
