package FIGURAS;
import UTILIDADES.lectordatosterminal;
import java.util.Random;

public class MainFiguraMillorada {
    private final lectordatosterminal s = new lectordatosterminal();
    private boolean fi = false;
    public static void main(String[] args) {
        MainFiguraMillorada programa = new MainFiguraMillorada();
        programa.inici();
    }

    //Un inici simple en bucle fins que l'usuari decideixi parar el programa a la funció seguir().
    public void inici(){
        Figura_M fig = new Figura_M();
        while(!fi) {
            String opcio = fig.llegirDades();
            tractarOpcio(opcio);
            seguir();
        }
    }

    //Tractar les 7 opcions creant els corresponents objectes; no es guarden, així que només existirà un de cada alhora com a molt.
    //Primer es crea el random per escollir la constructora de manera aleatòria, assignant aquest valor a la variable numRandom (int).
    //En el primer if es controla quina figura ha estat escollida i es fa un System out corresponent a la figura (no totes tenen les mateixes variables, costats, radis, etc...) i es crea un objecte també corresponent a la figura escollida.
    //Amb l'if, if else escollim la constructora de manera aleatòria amb el random.
    //Finalment assignem el nom de la figura i imprimim les dades.
    public void tractarOpcio(String opcio){
        Random random = new Random();
        int numRandom = random.nextInt(2);
        if(opcio.equalsIgnoreCase("Triangle")){
            System.out.println("Escriu la base i l'altura del teu " +  opcio + " (en aquest ordre!):");
            Triangle_M tri;
            if(numRandom == 0){
                tri = new Triangle_M();
                tri.setBase(s.leerInt());
                tri.setH(s.leerInt());
            }
            else {
                tri = new Triangle_M(s.leerInt(), s.leerInt());
            }
            tri.imprimirDades();
        }
        else if(opcio.equalsIgnoreCase("Quadrat")){
            System.out.println("Escriu la mida dels costats del teu " + opcio + " (només una vegada!):");
            Quadrat_M qua;
            if(numRandom == 0){
                qua = new Quadrat_M();
                qua.setCostat(s.leerInt());
            }
            else{
                qua = new Quadrat_M(s.leerInt());
            }
            qua.imprimirDades();
        }
        else if(opcio.equalsIgnoreCase("Rectangle")){
            System.out.println("Escriu la mida dels costats del teu " + opcio + "(dos valors!):");
            Rectangle_M rec;
            if(numRandom == 0){
                rec = new Rectangle_M();
                rec.setCostat1(s.leerInt());
                rec.setCostat2(s.leerInt());
            }
            else{
                rec = new Rectangle_M(s.leerInt(), s.leerInt());
            }
            rec.imprimirDades();
        }
        else if(opcio.equalsIgnoreCase("Trapezi")){
            System.out.println("Escriu la mida dels costats del teu " + opcio + " (dos costats i l'altura!):");
            Trapezi_M tra;
            if(numRandom == 0){
                tra = new Trapezi_M();
                tra.setA(s.leerInt());
                tra.setB(s.leerInt());
                tra.setH(s.leerInt());
            }
            else{
                tra = new Trapezi_M(s.leerInt(), s.leerInt(), s.leerInt());
            }
            tra.imprimirDades();
        }
        else if(opcio.equalsIgnoreCase("Rombe")){
            System.out.println("Escriu la mida dels diàmetres del teu " + opcio + " (diàmetre major i menor, en aquest ordre!):");
            Rombe_M rom;
            if(numRandom == 0){
                rom = new Rombe_M();
                rom.setdM(s.leerInt());
                rom.setDm(s.leerInt());
            }
            else{
                rom = new Rombe_M(s.leerInt(), s.leerInt());
            }
            rom.imprimirDades();
        }
        else if(opcio.equalsIgnoreCase("Parallelogram")){
            System.out.println("Escriu la base i altura del teu " + opcio + " (en aquest ordre!):");
            Parallelogram_M par;
            if(numRandom == 0){
                par = new Parallelogram_M();
                par.setB(s.leerInt());
                par.setH(s.leerInt());
            }
            else{
                par = new Parallelogram_M(s.leerInt(), s.leerInt());
            }
            par.imprimirDades();
        }
        else if(opcio.equalsIgnoreCase("Cercle")){
            System.out.println("Escriu el radi del teu " + opcio + ":");
            Cercle_M cer;
            if(numRandom == 0){
                cer = new Cercle_M();
                cer.setRadi(s.leerInt());
            }
            else{
                cer = new Cercle_M(s.leerInt());
            }
            cer.imprimirDades();
        }
    }

    //En comptes de fer el seguiFigura() he fet aquesta funció per a després de calcular cada àrea preguntar a l'usuari si vol continuar calculant àrees.
    public void seguir(){
        System.out.println("Vols calcular l'àrea d'una altra figura? (Yes/No)");
        String opcio = s.leerString();
        while(!opcio.equalsIgnoreCase("No") && !opcio.equalsIgnoreCase("Yes")){
            System.out.println("Vols calcular l'àrea d'una altra figura? (Yes/No)");
            opcio = s.leerString();
            if (opcio.equalsIgnoreCase("No")) {
                System.out.println("Chau\n\n--------------\n");
                fi = true;
            }
            else if(opcio.equalsIgnoreCase("Yes")){
                System.out.println("\n--------------\n");
            }
        }
    }
}