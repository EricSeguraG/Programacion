package RESERVAS;
public class Allotjament {
    private String nom;
    private int capacitat;
    private boolean disponibilitat;

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
    public double calcularPreuPerNit(){
        return 0;
    }
    public void mostrarInformacio(){
        System.out.println("Nom: " + nom);
        System.out.println("Capacitat: " + capacitat);
        System.out.println("Disponible: " + disponibilitat);
    }
    public void reservar(){
        if (disponibilitat){
            disponibilitat = false;
            System.out.println("Reservat correctament.");
        }
        else{
            System.out.println("Ja està reservat.");
            
        }
    }
    public void alliberar(){
        if (!disponibilitat){
            disponibilitat = true;
            System.out.println("Alliberat correctament.");
        }
        else {
            System.out.println("No està reservat.");
           
        }   
    }
    public boolean isDisponible(){  
        return disponibilitat;
    }

           
        
    
}

    