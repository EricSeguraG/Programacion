package JUEGOMASTER;
import UTILIDADES.lectordatosterminal;
public class HumanPlayer extends Player {
    public HumanPlayer(int palabra) {
        super(palabra);
    }

    @Override
    public String makeGuess() {
        lectordatosterminal scanner = new lectordatosterminal();
        String guess;
        do {
            System.out.print("Escriu " + codeLength + " lletres minúscules: ");
            guess = scanner.leerString();
        } while (!isValidGuess(guess));
        return guess;
    }

    private boolean isValidGuess(String guess) {
        if (guess.length() != codeLength) {
            System.out.println("La resposta ha de tenir " + codeLength + " lletres.");
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
