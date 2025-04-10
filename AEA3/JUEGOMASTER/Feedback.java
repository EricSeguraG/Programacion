package JUEGOMASTER;

public class Feedback {
    public static final char TOT_CORRECTE = '0';
    public static final char MALA_POSICIO = 'X';
    public static final char INCORRECTE = '-';

    public String getFeedback(String secret, String guess) {       
        StringBuilder feedback = new StringBuilder();

        for (int i = 0; i < secret.length(); i++) {
            char secretChar = secret.charAt(i);
            char guessChar = guess.charAt(i);

            if (guessChar == secretChar) {      
                feedback.append(TOT_CORRECTE);
            }
            else if (secret.indexOf(guessChar) != -1) {     
                feedback.append(MALA_POSICIO);
            }
            else {     
                feedback.append(INCORRECTE);
            }
        }
        return feedback.toString();
    }
}