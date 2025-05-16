package AEA5.Botones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonDesplegable extends JFrame {
    private JComboBox<String> languageComboBox;
    private JLabel resultLabel;

    public BotonDesplegable() {

        setTitle("DESPLEGABLE");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] languages = {"Java", "C++", "C#", "PHP", "Python"};
        languageComboBox = new JComboBox<>(languages);
        
        languageComboBox.setSelectedItem("Java");

        JButton showButton = new JButton("Show");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String)languageComboBox.getSelectedItem();
                resultLabel.setText("Programming language Selected: " + selected);
            }
        });

        // Create the label to display the result
        resultLabel = new JLabel("Programming language Selected: Java");

        // Add components to the frame
        add(new JLabel("Select a programming language:"));
        add(languageComboBox);
        add(showButton);
        add(resultLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BotonDesplegable().setVisible(true);
            }
        });
    }
}