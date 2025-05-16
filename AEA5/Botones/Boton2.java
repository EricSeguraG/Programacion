package AEA5.Botones;

import javax.swing.*;
import java.awt.*;

public class Boton2{
    public static void main(String[] args) {
        JFrame frame = new JFrame("2 BOTONES");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  

        
        JButton botonAzul = new JButton("CLICAME");
        botonAzul.setBounds(90, 50, 100, 40);
        botonAzul.setFont(new Font("Arial", Font.BOLD, 16));
        botonAzul.setForeground(Color.BLUE);
        botonAzul.setBackground(Color.WHITE);
        botonAzul.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        frame.add(botonAzul);

        
        JButton botonRojo = new JButton("PINCHA");
        botonRojo.setBounds(90, 120, 100, 40);
        botonRojo.setFont(new Font("Arial", Font.BOLD, 14));
        botonRojo.setForeground(Color.WHITE);
        botonRojo.setBackground(Color.RED);
        frame.add(botonRojo);

        frame.setVisible(true);
    }
}
