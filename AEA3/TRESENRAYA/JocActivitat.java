package AEA3.TRESENRAYA;

import AEA3.TicTacToe.Tauler;

import java.util.Scanner;

public class JocActivitat {
    private TaulerActivitat tauler;
    private char jugadorActual;
    private boolean guanyador;
    private Scanner scanner;

    public JocActivitat() {
        tauler = new TaulerActivitat();
        jugadorActual = 'X';
        guanyador = false;
        scanner = new Scanner(System.in);
    }
    public void iniciar() {
        System.out.println("Bienvenido al juego de TicTacToe");
        turnoActual();
        while (!guanyador && tauler.tableroLleno()) {
            turnoActual();
            cambiaTurno();
        }
        System.out.println("El jugador " + jugadorActual + " ha ganado");
    }
    public void turnoActual() {
        System.out.println("Marca una casilla para jugar:");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();
        tauler.marcarCasilla(fila, columna, jugadorActual);
        tauler.winner(jugadorActual);

        if (tauler.tableroLleno()) {
           guanyador = true;
           System.out.println("El jugador " + jugadorActual + " ha ganado");
       }
    }
    public void cambiaTurno() {
        if (jugadorActual == 'x') {
            jugadorActual = 'O';
        } else {
            jugadorActual = 'X';
        }
        
    }
}




