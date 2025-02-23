package AEA3.TRESENRAYA;

import AEA3.TicTacToe.Tauler;
import AEA3.UTILIDADES.lectordatosterminal;

import java.util.Scanner;

public class JocActivitat {
    private lectordatosterminal sc;
    private TaulerActivitat tauler;
    private char jugador;
    private boolean partida;
    private int fila;
    private int columna;
    private int mida;
    
       

    public JocActivitat() {
        //tauler = new TaulerActivitat();
        partida = true;
        sc = new lectordatosterminal();
    }

    public void iniciar() {
        System.out.println("Bienvenido al juego de TicTacToe");
        System.out.print("Introduce las dimensiones del tablero");
        mida = sc.leerInt();
        tauler = new TaulerActivitat(mida);
        System.out.println("Selecciona el jugador que empieza (X) o (O)");
        jugador = sc.leerLetra();

        if (jugador == 'X') {
            System.out.println("Jugador X");
        }
        else {
            System.out.println("Jugador O");
        }
        while (partida) {
            tauler.mostrarTauler();
            boolean jugadavalida = false;
            while (!jugadavalida) {
                System.out.println("Le toca al jugador: " + jugador);
                System.out.println("Selecciona una fila para jugar:");
                fila = sc.leerInt();
                fila = fila - 1; //fila -= 1;
                System.out.println("Selecciona una columna para jugar:");
                columna = sc.leerInt();
                columna = columna - 1; //columna -= 1;

                if (movimientoValido(fila, columna)) {
                    jugadavalida = true;
                }
                else {
                    System.out.println("La casilla seleccionada no es valida");
                    System.out.println();
                }
            }
            tauler.marcarCasilla(fila, columna, jugador);
            if (tauler.winner(jugador)) {
                System.out.println("El jugador " + jugador + " ha ganado");
                tauler.mostrarTauler();
                partida = false;
            }
            if (tauler.tableroLleno()) {
                System.out.println("Empate");
                tauler.mostrarTauler();
                partida = false;
            }
            cambiaTurno();
            
        }            
    }
    public void cambiaTurno() {
        if (jugador == 'X') {
            jugador = 'O';
        }
        else {
            jugador = 'X';
        }

    }   
    
    public boolean movimientoValido(int fila, int columna) {
        if (fila < 0 || fila >= mida || columna < 0 || columna >= mida) {
            System.out.println("La casilla seleccionada no es valida");
            return true;
        }

        if (tauler.mostrarcasilla(fila, columna) != '-') {
        System.out.println("La casilla seleccionada no es valida");
        System.out.println();
        return false;
        }

        return true;
    
    }
    
}




