package Reservasmaxi;

public class Apartament extends Allotjament {
    int numHabitaciones;
    boolean teCuina;

    public Apartament(String nom, int capacitat, int numHabitaciones, boolean teCuina, double precioPorNoche) {
        super(nom, capacitat, precioPorNoche);
        this.numHabitaciones = numHabitaciones;
        this.teCuina = teCuina;
    }

    @Override
    public void Mostrar_informacio() {
        super.Mostrar_informacio();
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Tiene cocina: " + (teCuina ? "Sí" : "No"));
    }

    @Override
    public boolean cumpleCaracteristicas(boolean filtrarCocina, boolean filtrarJardinPiscina) {
        if (filtrarCocina) {
            return teCuina; 
        }
        return true;
    }

    public boolean isTeCuina() {
        return teCuina;
    }
}
