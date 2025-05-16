package AEA5.Botones;

import javax.swing.*;
import java.awt.*;

public class BotonText {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BOTON ESCRIBIR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));
        
        frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lblEmail = new JLabel("E-MAIL:");
        JTextField txtEmail = new JTextField();
        
        JLabel lblNombre = new JLabel("HOLA MARINA:");
        JTextField txtNombre = new JTextField();
        
        JButton btnEnviar = new JButton("ENVIAR");
        
        frame.add(lblEmail);
        frame.add(txtEmail);
        frame.add(lblNombre);
        frame.add(txtNombre);
        frame.add(new JLabel());
        frame.add(btnEnviar);
        
        frame.setVisible(true);
    }
}