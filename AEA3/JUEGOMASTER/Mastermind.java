package JUEGOMASTER;

public class Mastermind {
    private static CodeGenerator codeGenerator;
    private static Player player;
    private static Feedback feedback;

    public static void main(String[] args) {
        
        codeGenerator = new CodeGenerator();
        player = new HumanPlayer();
        feedback = new Feedback();
        String secretCode = codeGenerator.generateCode();
        boolean isCorrect = false;

        while (!isCorrect) {
            String guess = player.makeGuess();
            String result = feedback.getFeedback(secretCode, guess);

            System.out.println("La resposta és: [" + result + "]");

            if (guess.equals(secretCode)) {
                System.out.println("Has encertat el codi secret!");
                isCorrect = true;
            } else {
                System.out.println("Continua intentant-ho!");
            }
        }
    }
}


