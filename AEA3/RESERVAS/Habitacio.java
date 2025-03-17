package RESERVAS;

public class Habitacio {
    private int numLlits;
    private String nom;
    private int capacitat;
    private boolean disponibilitat;

    public int getNumLlits() {
        return numLlits;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public boolean isDisponibilitat() {
        return disponibilitat;
    }

    public void setDisponibilitat(boolean disponibilitat) {
        this.disponibilitat = disponibilitat;
    }

    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
    }
    public void mostrarInformacio(){
        System.out.println("Nom: " + nom);
        System.out.println("Capacitat: " + capacitat);
        System.out.println("Disponible: " + disponibilitat);
    }
    public double calcularPreuPerNit(){
        return 0;
    }

}
