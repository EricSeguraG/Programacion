package AEA3.TRESENRAYA;


public class TicTacToeActivitat {
    public static void main(String[] args) {
        JocActivitat joc = new JocActivitat();
        //joc.iniciar();
        TaulerActivitat t = new TaulerActivitat();
        t.mostrarTauler();
        t.marcarCasilla(0,2,'X');
        boolean guanyador = t.winner('X');
        System.out.println(guanyador);
        t.mostrarTauler();
        t.marcarCasilla(0,1,'O');
        guanyador = t.winner('X');
        System.out.println(guanyador);
        t.mostrarTauler();
        boolean ple = t.tableroLleno();
        System.out.println("esta lleno;" +ple);


    }
}
