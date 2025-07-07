package _17_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	ArrayList<Studente> studenti = new ArrayList<>();
    	ArrayList<Docente> docenti = new ArrayList<>();
    	
    	// Finestra principale
        JFrame frame = new JFrame("Gestione Persone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        
        // TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // ---------------------
        // Tab Studente
        // ---------------------
        JPanel studentePanel = new JPanel(new GridLayout(4, 2));

        JTextField nomeStudenteField = new JTextField();
        JTextField cognomeStudenteField = new JTextField();
        JTextField matricolaField = new JTextField();

        JButton aggiungiStudente = new JButton("Aggiungi Studente");

        studentePanel.add(new JLabel("Nome:"));
        studentePanel.add(nomeStudenteField);
        studentePanel.add(new JLabel("Cognome:"));
        studentePanel.add(cognomeStudenteField);
        studentePanel.add(new JLabel("Matricola:"));
        studentePanel.add(matricolaField);
        studentePanel.add(new JLabel()); // spazio vuoto
        studentePanel.add(aggiungiStudente);

        // Azione bottone studente
        aggiungiStudente.addActionListener(e -> {
            String nome = nomeStudenteField.getText();
            String cognome = cognomeStudenteField.getText();
            String matricola = matricolaField.getText();

            if (!nome.isEmpty() && !cognome.isEmpty() && !matricola.isEmpty()) {
                Studente s = new Studente(nome, cognome, matricola);
                studenti.add(s);
                s.stampa(); // stampa in console
                JOptionPane.showMessageDialog(frame, "Studente aggiunto!");
                nomeStudenteField.setText("");
                cognomeStudenteField.setText("");
                matricolaField.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Compila tutti i campi!");
            }
        });
        
        // ---------------------
        // Tab Docente
        // ---------------------
        JPanel docentePanel = new JPanel(new GridLayout(4, 2));

        JTextField nomeDocenteField = new JTextField();
        JTextField cognomeDocenteField = new JTextField();
        JTextField materiaField = new JTextField();

        JButton aggiungiDocente = new JButton("Aggiungi Docente");

        docentePanel.add(new JLabel("Nome:"));
        docentePanel.add(nomeDocenteField);
        docentePanel.add(new JLabel("Cognome:"));
        docentePanel.add(cognomeDocenteField);
        docentePanel.add(new JLabel("Materia:"));
        docentePanel.add(materiaField);
        docentePanel.add(new JLabel());
        docentePanel.add(aggiungiDocente);

        // Azione bottone docente
        aggiungiDocente.addActionListener(e -> {
            String nome = nomeDocenteField.getText();
            String cognome = cognomeDocenteField.getText();
            String materia = materiaField.getText();

            if (!nome.isEmpty() && !cognome.isEmpty() && !materia.isEmpty()) {
                Docente d = new Docente(nome, cognome, materia);
                docenti.add(d);
                d.stampa(); // stampa in console
                JOptionPane.showMessageDialog(frame, "Docente aggiunto!");
                nomeDocenteField.setText("");
                cognomeDocenteField.setText("");
                materiaField.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Compila tutti i campi!");
            }
        });

        // Aggiunta tab
        tabbedPane.addTab("Studente", studentePanel);
        tabbedPane.addTab("Docente", docentePanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }

}
