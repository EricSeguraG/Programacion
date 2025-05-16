package AEA5.Botones;

import javax.swing.*;
import java.awt.*;

public class Boton3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lenguajes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Lenguajes:"));

        JRadioButton javaButton = new JRadioButton("Java");
        JRadioButton phpButton = new JRadioButton("Php");
        JRadioButton cppButton = new JRadioButton("C++");

        ButtonGroup group = new ButtonGroup();
        group.add(javaButton);
        group.add(phpButton);
        group.add(cppButton);

        JButton validarButton = new JButton("Validar");

        panel.add(javaButton);
        panel.add(phpButton);
        panel.add(cppButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); 
        panel.add(validarButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
