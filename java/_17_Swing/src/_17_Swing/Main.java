package _17_Swing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> studenti = new ArrayList<>();
        ArrayList<Docente> docenti = new ArrayList<>();

        new GestionePersoneFrame(studenti, docenti);
    }
}
