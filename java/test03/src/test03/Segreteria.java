package test03;

public class Segreteria extends Utente{
	private String ufficio;
	
	public Segreteria(String username, String email, String ufficio) {
		super(username, email);
		this.ufficio = ufficio;
	}
	
	public String getUfficio() {
		return ufficio;
	}

	public void setUfficio(String ufficio) {
		this.ufficio = ufficio;
	}

	@Override
	public void presentati() {
		System.out.println("Personale di segreteria: " + getUsername() + ", Ufficio: " + ufficio);
	}

}
