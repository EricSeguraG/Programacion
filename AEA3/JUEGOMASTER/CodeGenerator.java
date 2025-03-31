package JUEGOMASTER;
import java.util.Random;

public class CodeGenerator {
    private final String abc = "abcdefghijklmnopqrstuvwxyz";
    private final int LONG_SECRET = 3;

    public String generateCode() {
        Random random = new Random();
        StringBuilder secretCode = new StringBuilder();
        for (int i = 0; i < LONG_SECRET; i++) {
            int index = random.nextInt(abc.length());
            secretCode.append(abc.charAt(index));
        }
        return secretCode.toString();
    }
}
