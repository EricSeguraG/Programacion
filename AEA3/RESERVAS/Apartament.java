package RESERVAS;

public class Apartament {
    private int habitacions; 
    private boolean teCuina;
    private String nom;
    private int capacitat;
    private boolean disponibilitat;
    
    public int getHabitacions() {
        return habitacions;
    }
    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }
    public boolean isTeCuina() {
        return teCuina;
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
    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
    }  
    public double calcularPreuPerNit(){
        return 0; 
    }
    public void mostrarInformacio(){
        System.out.println("Nom: " + nom);
        System.out.println("Capacitat: " + capacitat);
        System.out.println("Disponible: " + disponibilitat);
    }

}
