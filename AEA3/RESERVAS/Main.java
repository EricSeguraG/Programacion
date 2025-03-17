package RESERVAS;

import UTILIDADES.lectordatosterminal;

public class Main {
    public static void main(String[] args) {
        Allotjament[] allotjaments = new Allotjament[1];

        allotjaments[0] = new Allotjament();
        allotjaments[0].setNom("Apartament");
        allotjaments[0].setCapacitat(2);
        allotjaments[0].setDisponibilitat(true);

        lectordatosterminal sc = new lectordatosterminal();
        int opcio;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar allotjaments disponibles");
            System.out.println("2. Reservar allotjament");
            System.out.println("3. Alliberar allotjament");
            System.out.println("4. Sortir");
            System.out.print("Tria una opció: ");
            opcio = sc.leerInt();

            switch (opcio) {
                case 1:
                    for (Allotjament a : allotjaments) {
                        System.out.println();
                        if (a.isDisponible()) a.mostrarInformacio();
                    }
                    break;
                case 2:
                    System.out.print("Introdueix el nom de l'allotjament a reservar: ");
                    String nom = sc.leerString();
                    for (Allotjament a : allotjaments) {
                        if (a.getNom().equalsIgnoreCase(nom)) {
                            a.reservar();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Introdueix el nom de l'allotjament a alliberar: ");
                    nom = sc.leerString();
                    for (Allotjament a : allotjaments) {
                        if (a.getNom().equalsIgnoreCase(nom)) {
                            a.alliberar();
        
                        }
                    }
                    break;
            }
        } while (opcio != 4);
    }
}

