package Reservasmaxi;

public class Habitacion extends Allotjament{

    int Llits;
    

    public Habitacion(String nom, int capacitat, int Llits){
        super(nom, capacitat);
        this.Llits = Llits;
    }
    
    public int getLlits() {
        return Llits;
    }

    public void setLlits(int llits) {
        Llits = llits;
    }
    

    @Override
    public double costenoche() {
        if (Llits<3)
            return 50;
        else
            return 50+(Llits-3)*20;

    }
    @Override
    public void Mostrar_informacio() {
        System.out.println("Habitación: " + nom + " | Llits: " + Llits + 
            " | Coste por noche: " + costenoche() + " euros." + 
            " | " + (Disponible ? "Disponible" : "No disponible"));
    }

    

}
