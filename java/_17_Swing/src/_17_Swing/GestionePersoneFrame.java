package _17_Swing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GestionePersoneFrame extends JFrame {
    private final ArrayList<Studente> studenti;
    private final ArrayList<Docente> docenti;

    public GestionePersoneFrame(ArrayList<Studente> studenti, ArrayList<Docente> docenti) {
        super("Gestione Inserimento");
        this.studenti = studenti;
        this.docenti = docenti;

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Studente", creaPannelloStudente());
        tabbedPane.addTab("Docente", creaPannelloDocente());

        add(tabbedPane, BorderLayout.CENTER);

        JButton apriVisualizzatore = new JButton("Apri Visualizzatore");
        apriVisualizzatore.addActionListener(e -> new GestioneVisualizzaFrame(studenti, docenti));
        add(apriVisualizzatore, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel creaPannelloStudente() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JTextField nomeField = new JTextField();
        JTextField cognomeField = new JTextField();
        JTextField matricolaField = new JTextField();
        JButton aggiungiBtn = new JButton("Aggiungi Studente");

        aggiungiBtn.addActionListener(e -> {
            String nome = nomeField.getText();
            String cognome = cognomeField.getText();
            String matricola = matricolaField.getText();
            if (!nome.isEmpty() && !cognome.isEmpty() && !matricola.isEmpty()) {
                Studente s = new Studente(nome, cognome, matricola);
                studenti.add(s);
                JOptionPane.showMessageDialog(this, "Studente aggiunto!");
                nomeField.setText("");
                cognomeField.setText("");
                matricolaField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Compila tutti i campi!");
            }
        });

        panel.add(new JLabel("Nome:")); panel.add(nomeField);
        panel.add(new JLabel("Cognome:")); panel.add(cognomeField);
        panel.add(new JLabel("Matricola:")); panel.add(matricolaField);
        panel.add(new JLabel()); panel.add(aggiungiBtn);
        return panel;
    }

    private JPanel creaPannelloDocente() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JTextField nomeField = new JTextField();
        JTextField cognomeField = new JTextField();
        JTextField materiaField = new JTextField();
        JButton aggiungiBtn = new JButton("Aggiungi Docente");

        aggiungiBtn.addActionListener(e -> {
            String nome = nomeField.getText();
            String cognome = cognomeField.getText();
            String materia = materiaField.getText();
            if (!nome.isEmpty() && !cognome.isEmpty() && !materia.isEmpty()) {
                Docente d = new Docente(nome, cognome, materia);
                docenti.add(d);
                JOptionPane.showMessageDialog(this, "Docente aggiunto!");
                nomeField.setText("");
                cognomeField.setText("");
                materiaField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Compila tutti i campi!");
            }
        });

        panel.add(new JLabel("Nome:")); panel.add(nomeField);
        panel.add(new JLabel("Cognome:")); panel.add(cognomeField);
        panel.add(new JLabel("Materia:")); panel.add(materiaField);
        panel.add(new JLabel()); panel.add(aggiungiBtn);
        return panel;
    }
}
