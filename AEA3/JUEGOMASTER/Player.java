package JUEGOMASTER;

public abstract class Player {
    protected int codeLength;

    public Player(int codeLength) {
        this.codeLength = codeLength;
    }

    public int getCodeLength() {
        return codeLength;
    }

    public abstract String makeGuess();
}
