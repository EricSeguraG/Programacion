package AEA3.TRESENRAYA;

public class TaulerActivitat {
    private char[][] tauler;
    public TaulerActivitat() {
        tauler = new char[3][3];
        for (int i = 0; i < 3; i++) {
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
    public void marcarCasilla(int fila,int columna, char jugador){
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
            if (tauler[fila][columna] == '-') {
                tauler[fila][columna] = jugador;
            }
        }
    }
    public boolean winner(char jugador) {
        for (int i = 0; i < tauler.length; i++) {
            if (tauler[i][0] == jugador && tauler[i][1] == jugador && tauler[i][2] == jugador) {
                return true;
            }
            if (tauler[0][i] == jugador && tauler[1][i] == jugador && tauler[2][i] == jugador) {
                return true;
            }
        }
        if (tauler[0][0] == jugador && tauler[1][1] == jugador && tauler[2][2] == jugador) {
            return true;
        }
        if (tauler[0][2] == jugador && tauler[1][1] == jugador && tauler[2][0] == jugador) {
            return true;
        }
        return false;
    }  
    
    public boolean tableroLleno() {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (tauler[i][j] == '-') {
                    lleno = false;
                }
            }
        }
            
    }
}
            
    

       

    


    



