package _17_Swing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GestioneVisualizzaFrame extends JFrame {
    private final DefaultListModel<Studente> modelStudenti = new DefaultListModel<>();
    private final DefaultListModel<Docente> modelDocenti = new DefaultListModel<>();

    public GestioneVisualizzaFrame(ArrayList<Studente> studenti, ArrayList<Docente> docenti) {
        super("Visualizza e Rimuovi");
        setSize(600, 400);
        setLayout(new GridLayout(1, 2));

        studenti.forEach(modelStudenti::addElement);
        docenti.forEach(modelDocenti::addElement);

        add(creaPannelloStudenti(studenti));
        add(creaPannelloDocenti(docenti));

        setVisible(true);
    }

    private JPanel creaPannelloStudenti(ArrayList<Studente> studenti) {
        JPanel panel = new JPanel(new BorderLayout());
        JList<Studente> list = new JList<>(modelStudenti);
        panel.setBorder(BorderFactory.createTitledBorder("Studenti"));
        panel.add(new JScrollPane(list), BorderLayout.CENTER);

        JPanel pulsanti = new JPanel(new GridLayout(2, 1));
        JButton rimuovi = new JButton("Rimuovi");
        JButton stampa = new JButton("Stampa");

        rimuovi.addActionListener(e -> {
            Studente s = list.getSelectedValue();
            if (s != null) {
                studenti.remove(s);
                modelStudenti.removeElement(s);
            }
        });

        stampa.addActionListener(e -> {
            if (modelStudenti.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nessuno studente registrato.");
            } else {
                StringBuilder msg = new StringBuilder("Studenti:\n");
                for (int i = 0; i < modelStudenti.size(); i++) {
                    msg.append(modelStudenti.get(i)).append("\n");
                }
                JOptionPane.showMessageDialog(this, msg.toString());
            }
        });

        pulsanti.add(rimuovi);
        pulsanti.add(stampa);
        panel.add(pulsanti, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel creaPannelloDocenti(ArrayList<Docente> docenti) {
        JPanel panel = new JPanel(new BorderLayout());
        JList<Docente> list = new JList<>(modelDocenti);
        panel.setBorder(BorderFactory.createTitledBorder("Docenti"));
        panel.add(new JScrollPane(list), BorderLayout.CENTER);

        JPanel pulsanti = new JPanel(new GridLayout(2, 1));
        JButton rimuovi = new JButton("Rimuovi");
        JButton stampa = new JButton("Stampa");

        rimuovi.addActionListener(e -> {
            Docente d = list.getSelectedValue();
            if (d != null) {
                docenti.remove(d);
                modelDocenti.removeElement(d);
            }
        });

        stampa.addActionListener(e -> {
            if (modelDocenti.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nessun docente registrato.");
            } else {
                StringBuilder msg = new StringBuilder("Docenti:\n");
                for (int i = 0; i < modelDocenti.size(); i++) {
                    msg.append(modelDocenti.get(i)).append("\n");
                }
                JOptionPane.showMessageDialog(this, msg.toString());
            }
        });

        pulsanti.add(rimuovi);
        pulsanti.add(stampa);
        panel.add(pulsanti, BorderLayout.SOUTH);
        return panel;
    }
}
