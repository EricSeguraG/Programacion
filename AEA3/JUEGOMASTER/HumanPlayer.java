package JUEGOMASTER;
import UTILIDADES.lectordatosterminal;

public class HumanPlayer extends Player {
    private final int LONG_SECRET = 3;

    @Override
    public String makeGuess() {
        lectordatosterminal scanner = new lectordatosterminal();
        String guess;
        do {
            System.out.print("Escriu " + LONG_SECRET + " lletres minúscules: ");
            guess = scanner.leerString();
        } while (!isValidGuess(guess));
        return guess;
    }

    private boolean isValidGuess(String guess) {
        if (guess.length() != LONG_SECRET) {
            System.out.println("La resposta ha de tenir " + LONG_SECRET + " lletres.");
            return false;
        }
        for (char c : guess.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                System.out.println("Només es permeten lletres minúscules.");
                return false;
            }
        }
        return true;
    }
}
