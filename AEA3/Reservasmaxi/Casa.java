package Reservasmaxi;

public class Casa  extends Allotjament{

    boolean teJardi;
    boolean tePiscina;
   

    public Casa(String nom, int capacitat, boolean teJardi, boolean tePiscina){
        super(nom, capacitat);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean isTeJardi() {
        return teJardi;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }

    public boolean isTePiscina() {
        return tePiscina;
    }

    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }
    

    @Override
    public double costenoche() {
        if (tePiscina) return 200;
        else return 150;
    }

    @Override
    public void Mostrar_informacio() {
        System.out.println("Casa Rural: " + nom + " | Capacidad: " + capacitat + 
            " | Jardí: " + (teJardi ? "Sí" : "No") + 
            " | Piscina: " + (tePiscina ? "Sí" : "No") + 
            " | Coste por noche: " + costenoche() + " euros." + 
            " | " + (Disponible ? "Disponible" : "No disponible"));
    }
}
