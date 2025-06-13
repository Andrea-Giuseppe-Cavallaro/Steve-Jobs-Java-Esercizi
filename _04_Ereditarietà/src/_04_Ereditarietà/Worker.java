package _04_Ereditarietà;

public class Worker extends Person {
	String job;
	
	public Worker(String name, String surname, int age, String city, String job) {
		super(name, surname, age, city);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}