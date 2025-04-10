package JUEGOMASTER;

import UTILIDADES.lectordatosterminal;

public class Mastermind {
    public static final String ENCERTAT_4 = "0000";
    public static final String ENCERTAT_6 = "000000";

    private CodeGenerator codeGenerator;
    private Player player;
    private RobotPlayer robot;
    private Feedback feedback;
    private String secretCode;
    private boolean isRobotTurn;

    public Mastermind(Player player, RobotPlayer robot) {
        codeGenerator = new CodeGenerator();
        this.player = player;
        this.robot = robot;
        feedback = new Feedback();
        secretCode = codeGenerator.generateCode(player.getCodeLength());
        isRobotTurn = false;
    }

    public void start() {
        boolean guanyat = false;

        while (!guanyat) {
            if (!isRobotTurn) {
                String guess;

                // 🔁 Bucle de validación del intento del jugador
                while (true) {
                    guess = player.makeGuess();

                    if (guess.length() != player.getCodeLength()) {
                        System.out.println("❌ Error: El código debe tener " + player.getCodeLength() + " letras.");
                    } else {
                        break;
                    }
                }

                String response = feedback.getFeedback(secretCode, guess);
                System.out.println("Jugador: " + response);

                if (guess.equals(secretCode)) {
                    System.out.println("🎉 ¡Has ganado!");
                    guanyat = true;
                } else {
                    System.out.println("Turno del Robot...");
                    isRobotTurn = true;
                }

            } else {
                String robotGuess = robot.makeGuess();
                String robotFeedback = feedback.getFeedback(secretCode, robotGuess);

                System.out.println("Robot: " + robotGuess);
                System.out.println("Respuesta del Robot: " + robotFeedback);

                if (robotGuess.equals(secretCode)) {
                    System.out.println("🤖 ¡El Robot ha ganado!");
                    guanyat = true;
                } else {
                    robot.updateGuess(robotFeedback);
                    isRobotTurn = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        lectordatosterminal scanner = new lectordatosterminal();

        System.out.print("Introduce el tipo de dificultad (1: Adult, 2: Child): ");
        int choice = scanner.leerInt();

        Player player;
        RobotPlayer robot;
        if (choice == 1) {
            player = new AdultPlayer();
            robot = new RobotPlayer(6);
        } else {
            player = new ChildPlayer();
            robot = new RobotPlayer(4);
        }

        Mastermind game = new Mastermind(player, robot);
        game.start();
    }
}
