package JUEGOMASTER;
import UTILIDADES.lectordatosterminal;

public class ChildPlayer extends HumanPlayer {
    lectordatosterminal scanner = new lectordatosterminal();

    public ChildPlayer() {
        super(4); 
    }

    @Override
    public String makeGuess() {
        System.out.print("Escribe 4 letras: ");
        return scanner.leerString();
    }
}