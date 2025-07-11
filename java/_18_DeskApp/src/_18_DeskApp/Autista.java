package _18_DeskApp;

public class Autista extends Persona implements Utente_Autobus {
    private String patente;
    private int esperienza;

    public Autista(String patente, int esperienza, String nome, String cognome, String CF) {
        super(nome, cognome, CF);
        this.patente = patente;
        this.esperienza = esperienza;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getEsperienza() {
        return esperienza;
    }

    public void setEsperienza(int esperienza) {
        this.esperienza = esperienza;
    }

    @Override
    public Autista get_tipo() {
        return this;
    }

    @Override
    public String toString() {
        return "Autista [Nome = " + getNome() + ", Cognome = " + getCognome() + ", Codice Fiscale = " + getCodiceFiscale() +
               ", Patente = " + patente + ", Anni di Esperienza = " + esperienza + "]";
    }
}
