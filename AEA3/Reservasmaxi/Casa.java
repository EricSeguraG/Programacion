package Reservasmaxi;

public class Casa extends Allotjament {
    boolean teJardi;
    boolean tePiscina;

    public Casa(String nom, int capacitat, boolean teJardi, boolean tePiscina, double precioPorNoche) {
        super(nom, capacitat, precioPorNoche);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    @Override
    public void Mostrar_informacio() {
        super.Mostrar_informacio();
        System.out.println("Tiene jardín: " + (teJardi ? "Sí" : "No"));
        System.out.println("Tiene piscina: " + (tePiscina ? "Sí" : "No"));
    }

    @Override
    public boolean cumpleCaracteristicas(boolean filtrarCocina, boolean filtrarJardinPiscina) {
        if (filtrarJardinPiscina) {
            return teJardi || tePiscina; 
        }
        return true;
    }

    public boolean isTeJardi() {
        return teJardi;
    }

    public boolean isTePiscina() {
        return tePiscina;
    }
}
