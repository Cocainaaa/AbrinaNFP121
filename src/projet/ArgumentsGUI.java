package projet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArgumentsGUI extends JFrame {

    private JPanel panel;
    private JLabel label;
    private DefaultListModel<String> argumentsList;
    private JList<String> argumentsView;
    private JButton creuseButton;

    public ArgumentsGUI() {
        super("Arguments de la ligne de commande");

        // Création du panneau principal
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Création de l'étiquette en haut
        label = new JLabel("Arguments :");
        panel.add(label, BorderLayout.NORTH);

        // Création de la liste en bas
        argumentsList = new DefaultListModel<>();
        argumentsView = new JList<>(argumentsList);
        panel.add(argumentsView, BorderLayout.SOUTH);

        // Création des boutons au centre
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 3));
        panel.add(buttonsPanel, BorderLayout.CENTER);

        // Bouton "Creuse (C)"
        creuseButton = new JButton("Creuse (C)");
        creuseButton.addActionListener(new CreuseButtonListener());
        buttonsPanel.add(creuseButton);

        // Bouton "Pleine (P)"
        JButton pleineButton = new JButton("Pleine (P)");
        pleineButton.addActionListener(new PleineButtonListener());
        buttonsPanel.add(pleineButton);

        // Bouton "+"
        JButton plusButton = new JButton("+");
        plusButton.addActionListener(new PlusButtonListener());
        buttonsPanel.add(plusButton);

        // Configuration de la fenêtre principale
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
    }

    // Listener pour le bouton "Creuse (C)"
    private class CreuseButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            argumentsList.addElement("-C");
        }
    }

    // Listener pour le bouton "Pleine (P)"
    private class PleineButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            argumentsList.addElement("-P");
        }
    }

    // Listener pour le bouton "+"
    private class PlusButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String value = JOptionPane.showInputDialog("Valeur de l'option :");
            if (value != null) {
                argumentsList.addElement("+ " + value);
            }
        }
    }

    public static void main(String[] args) {
        new ArgumentsGUI();
    }
}
