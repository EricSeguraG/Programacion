package Reservasmaxi;

public class Allotjament {

public String nom;
public int capacitat;
public boolean Disponible;
double precio;


Allotjament(){

}

public Allotjament(String nom, int capacitat){
    this.nom = nom;
    this.capacitat = capacitat;
    this.Disponible = true;

    
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

public boolean isDisponible() {
    return Disponible;
}


public void setDisponible(boolean Disponible) {
    this.Disponible = Disponible;
}
public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public double costenoche(){
    return 0;
}


public boolean reservar(){
    if (Disponible){
        Disponible = false;
        System.out.println("Reserva exitosa");
        return true;
        
        
    } else {
        System.out.println("No està disponible per reserves");
        return false;
        
    }
}

public boolean alliberar(){
    if (!Disponible){
        Disponible = true;
        System.out.println("Alliberació exitosa");
        return true;
        
        
    } else {
        System.out.println("Aquest allotjament no està reservat!!");
        return false;
        
    }
}

public void Mostrar_informacio() {
}

    
}


