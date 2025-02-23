package AEA3.TRESENRAYA;

public class TaulerActivitat {
    private char[][] tauler;
    public TaulerActivitat() {
        tauler = new char[3][3];
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = '-';
            }
        }
    }

    public TaulerActivitat(int mida){
        tauler = new char[mida][mida];
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = '-';
            }
       }
    }

    public void mostrarTauler() {
        for(int i=0; i<tauler.length; i++) {
            for(int j=0; j<tauler[i].length; j++) {
                System.out.print(tauler[i][j]);
            }
            System.out.println();
        }
    }

    public char mostrarcasilla(int fila, int columna) {
        return tauler[fila][columna];
    }
        
    public void marcarCasilla(int fila,int columna, char jugador){
        if (fila >= 0 && fila < tauler.length && columna >= 0 && columna < tauler.length) {
            if (tauler[fila][columna] == '-') {
                tauler[fila][columna] = jugador;
            }
        }
    }
    public boolean winner(char jugador) {
        int mida = tauler.length;
        for (int i = 0; i < mida; i++) {
            boolean filaWin = true;
            boolean columnaWin = true;
            for (int j = 0; j < mida; j++) {
                if (tauler[i][j] != jugador) {
                    filaWin = false;
                }
                if (tauler[j][i] != jugador) {
                    columnaWin = false;
                }
            }
            if (filaWin || columnaWin) {
                return true;
            }
        }
        boolean diagWin = true;
        boolean diag2Win = true;
        for (int i = 0; i < mida; i++) {
            if (tauler[i][i] != jugador) {
                diagWin = false;
            }
            if (tauler[i][mida - 1 - i] != jugador) {
                diag2Win = false;
            }
        }
        if (diagWin || diag2Win) {
            return true;
        }
        return false;
    }
    
    
    public boolean tableroLleno() {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (tauler[i][j] == '-') {
                    return false;
                }
            }
        }
            return true;
    }
}