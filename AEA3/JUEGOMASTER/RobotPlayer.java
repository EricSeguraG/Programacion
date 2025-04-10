package JUEGOMASTER;

import java.util.*;

public class RobotPlayer extends Player {
    private Random random = new Random();
    private String lastGuess = "";
    private boolean hasWon = false;

    private Set<Character> incorrectChars = new HashSet<>();
    private Set<Character> correctChars = new HashSet<>();
    private Map<Character, Set<Integer>> misplacedCharPositions = new HashMap<>();

    private char[] currentGuess;
    private char[] finalAnswer; 

    public RobotPlayer(int codeLength) {
        super(codeLength);
        currentGuess = new char[codeLength];
        finalAnswer = new char[codeLength];
        Arrays.fill(finalAnswer, '_'); // Indica posición aún desconocida
    }

    @Override
    public String makeGuess() {
        if (hasWon) return lastGuess;

        Set<Character> usedChars = new HashSet<>(incorrectChars); // Evita repetir incorrectas

        for (int i = 0; i < getCodeLength(); i++) {
            if (finalAnswer[i] != '_') {
                currentGuess[i] = finalAnswer[i]; // Fijar letras correctas
            } else {
                Character candidate = getMisplacedForPosition(i, usedChars);
                if (candidate != null) {
                    currentGuess[i] = candidate;
                    usedChars.add(candidate);
                } else {
                    char newChar = getNewUnusedChar(usedChars);
                    currentGuess[i] = newChar;
                    usedChars.add(newChar);
                }
            }
        }

        lastGuess = new String(currentGuess);
        return lastGuess;
    }

    public void updateGuess(String feedback) {
        // Comprobar victoria con comparación dinámica
        if (feedback.equals(generateWinPattern())) {
            hasWon = true;
            return;
        }

        for (int i = 0; i < feedback.length(); i++) {
            char guessChar = lastGuess.charAt(i);
            char fb = feedback.charAt(i);

            switch (fb) {
                case '0': // letra correcta y bien colocada
                    finalAnswer[i] = guessChar;
                    correctChars.add(guessChar);
                    misplacedCharPositions.remove(guessChar); // Ya no es "mal colocada"
                    break;
                case 'X': // letra está pero mal ubicada
                    if (!correctChars.contains(guessChar)) {
                        misplacedCharPositions.putIfAbsent(guessChar, new HashSet<>());
                        misplacedCharPositions.get(guessChar).add(i); // No volver a usar aquí
                    }
                    break;
                case '-': // letra incorrecta
                    if (!correctChars.contains(guessChar) && !misplacedCharPositions.containsKey(guessChar)) {
                        incorrectChars.add(guessChar);
                    }
                    break;
            }
        }
    }

    private String generateWinPattern() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getCodeLength(); i++) {
            sb.append('0');
        }
        return sb.toString();
    }

    private char getNewUnusedChar(Set<Character> usedChars) {
        char c;
        do {
            c = (char) ('a' + random.nextInt(26));
        } while (usedChars.contains(c) || incorrectChars.contains(c));
        return c;
    }

    private Character getMisplacedForPosition(int pos, Set<Character> used) {
        for (Map.Entry<Character, Set<Integer>> entry : misplacedCharPositions.entrySet()) {
            char ch = entry.getKey();
            Set<Integer> badPositions = entry.getValue();
            if (!badPositions.contains(pos) && !used.contains(ch)) {
                return ch;
            }
        }
        return null;
    }
}
