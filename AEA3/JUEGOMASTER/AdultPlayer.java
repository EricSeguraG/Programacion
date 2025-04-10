package JUEGOMASTER;

import UTILIDADES.lectordatosterminal;

public class AdultPlayer extends HumanPlayer {
    lectordatosterminal scanner = new lectordatosterminal();

    public AdultPlayer() {
        super(6);
    }

    @Override
    public String makeGuess() {
        System.out.print("Escribe 6 letras: ");
        return scanner.leerString();
    }
}
