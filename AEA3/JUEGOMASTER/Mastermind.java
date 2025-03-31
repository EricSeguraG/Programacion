package JUEGOMASTER;

public class Mastermind {
    private CodeGenerator codeGenerator;
    private Player player;
    private Feedback feedback;

    public Mastermind() {
        this.codeGenerator = new CodeGenerator();
        this.player = new HumanPlayer();
        this.feedback = new Feedback();
    }

    public void startGame() {
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
