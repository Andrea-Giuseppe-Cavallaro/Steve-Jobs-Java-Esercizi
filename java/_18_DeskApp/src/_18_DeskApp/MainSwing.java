package _18_DeskApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainSwing extends JFrame {

    private Autobus autobus;

    // Campi passeggero
    private JTextField nomeField, cognomeField, cfField, destinazioneField;
    private JCheckBox bagaglioCheckBox;

    // Campi autista
    private JTextField nomeAutistaField, cognomeAutistaField, cfAutistaField, patenteField, esperienzaField;

    private JTextArea displayArea;
    private JButton aggiungiPasseggeroButton, aggiungiAutistaButton;

    public MainSwing() {
        super("Gestione Autobus");

        autobus = new Autobus();

        // ========================
        // TAB PANNELLI
        // ========================
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Passeggero", creaPanelPasseggero());
        tabbedPane.addTab("Autista", creaPanelAutista());

        add(tabbedPane, BorderLayout.NORTH);

        // Area display
        displayArea = new JTextArea(20, 80);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        // Setup finestra
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // ========================
    // PANEL PASSEGGERO
    // ========================
    private JPanel creaPanelPasseggero() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("Cognome:"));
        cognomeField = new JTextField();
        panel.add(cognomeField);

        panel.add(new JLabel("Codice Fiscale:"));
        cfField = new JTextField();
        panel.add(cfField);

        panel.add(new JLabel("Destinazione:"));
        destinazioneField = new JTextField();
        panel.add(destinazioneField);

        panel.add(new JLabel("Bagaglio:"));
        bagaglioCheckBox = new JCheckBox();
        panel.add(bagaglioCheckBox);

        aggiungiPasseggeroButton = new JButton("Aggiungi Passeggero");
        panel.add(aggiungiPasseggeroButton);

        // Action Listener
        aggiungiPasseggeroButton.addActionListener(e -> aggiungiPasseggero());

        return panel;
    }

    // ========================
    // PANEL AUTISTA
    // ========================
    private JPanel creaPanelAutista() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(new JLabel("Nome:"));
        nomeAutistaField = new JTextField();
        panel.add(nomeAutistaField);

        panel.add(new JLabel("Cognome:"));
        cognomeAutistaField = new JTextField();
        panel.add(cognomeAutistaField);

        panel.add(new JLabel("Codice Fiscale:"));
        cfAutistaField = new JTextField();
        panel.add(cfAutistaField);

        panel.add(new JLabel("Patente:"));
        patenteField = new JTextField();
        panel.add(patenteField);

        panel.add(new JLabel("Esperienza (anni):"));
        esperienzaField = new JTextField();
        panel.add(esperienzaField);

        aggiungiAutistaButton = new JButton("Aggiungi Autista");
        panel.add(aggiungiAutistaButton);

        // Action Listener
        aggiungiAutistaButton.addActionListener(e -> aggiungiAutista());

        return panel;
    }

    private void aggiungiPasseggero() {
        String nome = nomeField.getText().trim();
        String cognome = cognomeField.getText().trim();
        String cf = cfField.getText().trim();
        String destinazione = destinazioneField.getText().trim();
        boolean bagaglio = bagaglioCheckBox.isSelected();

        if (nome.isEmpty() || cognome.isEmpty() || cf.isEmpty() || destinazione.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Compila tutti i campi del passeggero!", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Passeggero p = new Passeggero(destinazione, bagaglio, nome, cognome, cf);

        try {
            autobus.aggiungiPasseggero(p);
            aggiornaDisplay();
            pulisciCampiPasseggero();
        } catch (Posti_esauriti_passeggero_exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Posti esauriti", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void aggiungiAutista() {
        String nome = nomeAutistaField.getText().trim();
        String cognome = cognomeAutistaField.getText().trim();
        String cf = cfAutistaField.getText().trim();
        String patente = patenteField.getText().trim();
        String esperienzaStr = esperienzaField.getText().trim();

        if (nome.isEmpty() || cognome.isEmpty() || cf.isEmpty() || patente.isEmpty() || esperienzaStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Compila tutti i campi dell'autista!", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int esperienza;
        try {
            esperienza = Integer.parseInt(esperienzaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Esperienza deve essere un numero intero!", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Autista a = new Autista(patente, esperienza, nome, cognome, cf);

        try {
            autobus.aggiungiAutista(a);
            aggiornaDisplay();
            pulisciCampiAutista();
        } catch (Posti_esauriti_autista_exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Posti esauriti", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void aggiornaDisplay() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== AUTISTI ===\n");
        for (Autista a : autobus.getAutisti()) {
            sb.append(a.toString()).append("\n");
        }

        sb.append("\n=== PASSEGGERI ===\n");
        for (Passeggero p : autobus.getPasseggeri()) {
            sb.append(p.toString()).append("\n");
        }

        displayArea.setText(sb.toString());
    }

    private void pulisciCampiPasseggero() {
        nomeField.setText("");
        cognomeField.setText("");
        cfField.setText("");
        destinazioneField.setText("");
        bagaglioCheckBox.setSelected(false);
    }

    private void pulisciCampiAutista() {
        nomeAutistaField.setText("");
        cognomeAutistaField.setText("");
        cfAutistaField.setText("");
        patenteField.setText("");
        esperienzaField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainSwing());
    }
}
