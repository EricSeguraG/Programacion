package AEA5.Botones;

import javax.swing.*;
import java.awt.*;

public class Boton1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BOTONCITO");

        JButton button = new JButton("CLICAME");
        button.setBounds(150, 130, 100, 40);       
        button.setBackground(Color.BLUE);           
        button.setOpaque(true);                    
        button.setBorderPainted(true);            

        frame.add(button);

        
        frame.setSize(400, 400);                           
        frame.setLayout(null);                            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);                            
    }
}
