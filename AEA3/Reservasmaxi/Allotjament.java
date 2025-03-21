package Reservasmaxi;

public class Allotjament {
    String nom;
    int capacitat;
    double precioPorNoche;
    boolean disponible;

    public Allotjament(String nom, int capacitat, double precioPorNoche) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true;
    }

    public boolean reservar(int dies, int persones) {
        if (persones <= capacitat && disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void alliberar() {
        disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getNom() {
        return nom;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

   
    public void Mostrar_informacio() {
        System.out.println("Nombre: " + nom);
        System.out.println("Capacidad: " + capacitat);
        System.out.println("Precio por noche: " + precioPorNoche);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    
    public boolean cumpleCaracteristicas(boolean filtrarCocina, boolean filtrarJardinPiscina) {
        return true; 
    }
}
