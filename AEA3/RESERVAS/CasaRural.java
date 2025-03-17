package RESERVAS;

public class CasaRural {
    private boolean tePiscina;
    private boolean teJardi;
    private String nom;
    private int capacitat;
    private boolean disponibilitat;
    
    public boolean isTePiscina() {
        return tePiscina;
    }
    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }
    public boolean isTeJardi() {
        return teJardi;
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
    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
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
