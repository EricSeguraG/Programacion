package Reservasmaxi;

public class Habitacion extends Allotjament {
    int numLlits;

    public Habitacion(String nom, int capacitat, int numLlits, double precioPorNoche) {
        super(nom, capacitat, precioPorNoche);
        this.numLlits = numLlits;
    }

    @Override
    public void Mostrar_informacio() {
        super.Mostrar_informacio();
        System.out.println("Número de camas: " + numLlits);
    }

    @Override
    public boolean cumpleCaracteristicas(boolean filtrarCocina, boolean filtrarJardinPiscina) {
        return true; 
    }
}
