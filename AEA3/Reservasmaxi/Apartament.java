package Reservasmaxi;

public class Apartament extends Allotjament{

    int habitacions;
    boolean teCuina;
    

    public Apartament(String nom, int capacitat, int habitacions, boolean teCuina){
        super(nom, capacitat);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
        
    }

    public int getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }

    public boolean isTeCuina() {
        return teCuina;
    }

    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
    }
    

    @Override
    public double costenoche() {
        return 100 + habitacions * 10;
    }


    @Override
    public void Mostrar_informacio() {
        System.out.println("Apartamento: " + nom + " | Capacidad: " + capacitat + " | Habitaciones: " + habitacions + 
            " | Cocina: " + (teCuina ? "Sí" : "No") + 
            " | Coste por noche: " + costenoche() + " euros." + 
            " | " + (Disponible ? "Disponible" : "No disponible"));
    }

    
    
}
